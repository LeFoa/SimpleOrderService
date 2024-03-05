package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import study.orderSerivce.domain.entity.status.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "orders")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems= new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private LocalDateTime orderDate;

    protected Order() {
    }

    @Builder
    public Order(User user, Delivery delivery, OrderStatus status, LocalDateTime orderDate) {
        this.user = user;
        this.delivery = delivery;
        this.status = status;
        this.orderDate = orderDate;
    }

}
