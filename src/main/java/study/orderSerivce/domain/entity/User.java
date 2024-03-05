package study.orderSerivce.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String authId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    private String phoneNumber;

    private String email;

    @Embedded
    @Column(nullable = false)
    private Address address;

    protected User() {
    }

    @Builder
    public User(String authId, String password, String name, String phoneNumber, String email, Address address){
        this.authId = authId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
