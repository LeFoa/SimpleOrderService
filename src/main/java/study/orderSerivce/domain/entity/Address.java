package study.orderSerivce.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    private String street;
    private String streetNumber;
    private String zipcode;

    public Address(String street, String streetNumber, String zipcode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipcode = zipcode;
    }

    protected Address() {
    }
}
