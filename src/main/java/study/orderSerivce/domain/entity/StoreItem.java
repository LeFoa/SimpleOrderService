package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import study.orderSerivce.domain.entity.item.Item;

@Entity
@Getter
public class StoreItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_item_id", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id",nullable = false)
    private Store store;

}
