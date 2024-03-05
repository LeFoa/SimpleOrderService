package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Store {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id", updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String number;

    @Embedded
    @Column(nullable = false)
    private Address address;

    protected Store() {
    }

    @Builder
    public Store(String name, String number, Address address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }
}
