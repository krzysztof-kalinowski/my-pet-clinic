package kkalinowski.springframework.kkpetclinic.service;

import kkalinowski.springframework.kkpetclinic.model.Owner;

import java.util.List;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
