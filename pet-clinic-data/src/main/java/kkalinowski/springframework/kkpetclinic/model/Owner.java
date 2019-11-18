package kkalinowski.springframework.kkpetclinic.model;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 10/11/2019.
 */

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
