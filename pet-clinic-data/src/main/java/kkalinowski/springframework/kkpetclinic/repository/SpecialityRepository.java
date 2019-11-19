package kkalinowski.springframework.kkpetclinic.repository;

import kkalinowski.springframework.kkpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Krzysztof Kalinowski on 19/11/2019.
 */

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
