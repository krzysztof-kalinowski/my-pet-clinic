package kkalinowski.springframework.kkpetclinic.service;

import kkalinowski.springframework.kkpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
