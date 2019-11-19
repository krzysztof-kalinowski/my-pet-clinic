package kkalinowski.springframework.kkpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Krzysztof Kalinowski on 10/11/2019.
 */

@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
