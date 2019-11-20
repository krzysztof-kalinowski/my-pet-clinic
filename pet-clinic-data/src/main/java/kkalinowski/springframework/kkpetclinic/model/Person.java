package kkalinowski.springframework.kkpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Krzysztof Kalinowski on 10/11/2019.
 */
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity{

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

}
