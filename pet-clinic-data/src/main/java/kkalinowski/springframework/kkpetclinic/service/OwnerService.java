package kkalinowski.springframework.kkpetclinic.service;

import kkalinowski.springframework.kkpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
