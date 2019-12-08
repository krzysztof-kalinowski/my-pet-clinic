package kkalinowski.springframework.kkpetclinic.service.map;

import kkalinowski.springframework.kkpetclinic.model.PetType;
import kkalinowski.springframework.kkpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 18/11/2019.
 */

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType findByName(String name) {
        return super.findAll().stream()
                .filter(petType -> petType.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
