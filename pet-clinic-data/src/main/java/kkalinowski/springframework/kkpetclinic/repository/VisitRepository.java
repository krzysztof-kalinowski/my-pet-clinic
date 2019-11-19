package kkalinowski.springframework.kkpetclinic.repository;

import kkalinowski.springframework.kkpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Krzysztof Kalinowski on 19/11/2019.
 */

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
