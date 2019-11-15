package kkalinowski.springframework.kkpetclinic.service.map;

import kkalinowski.springframework.kkpetclinic.model.Pet;
import kkalinowski.springframework.kkpetclinic.service.PetService;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}