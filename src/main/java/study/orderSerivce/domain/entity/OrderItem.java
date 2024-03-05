package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import study.orderSerivce.domain.entity.item.Item;

@Entity
@Getter
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id",nullable = false)
    private Item item;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int quantity;

    protected OrderItem() {
    }

    @Builder
    public OrderItem(Item item, int price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public void addOrder(Order order){
        this.order = order;
        order.getOrderItems().add(this);
    }

}
