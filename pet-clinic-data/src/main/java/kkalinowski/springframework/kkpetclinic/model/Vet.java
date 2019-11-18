package kkalinowski.springframework.kkpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 10/11/2019.
 */

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

}
