package kkalinowski.springframework.kkpetclinic.service;

import kkalinowski.springframework.kkpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
