package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import study.orderSerivce.domain.entity.status.DeliveryStatus;

@Entity
@Getter
public class Delivery {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivey_id", updatable = false, nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeliveryStatus status;

    @Column(nullable = false)
    private Address address;

    protected Delivery() {
    }

    @Builder
    public Delivery(DeliveryStatus status, Address address) {
        this.status = status;
        this.address = address;
    }
}
