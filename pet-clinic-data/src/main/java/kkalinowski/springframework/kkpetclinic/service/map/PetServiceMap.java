package kkalinowski.springframework.kkpetclinic.service.map;

import kkalinowski.springframework.kkpetclinic.model.Pet;
import kkalinowski.springframework.kkpetclinic.service.PetService;
import kkalinowski.springframework.kkpetclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    private final VisitService visitService;

    public PetServiceMap(VisitService visitService) {
        this.visitService = visitService;
    }

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
        if(object.getVisits().size() > 0){
            object.getVisits().forEach(visit -> {
                if(visit.getId() == null){
                    visit.setId(visitService.save(visit).getId());
                }
                if(visit.getDate() == null){
                    visit.setDate(LocalDate.now());
                }
            });
        }
        return super.save(object);
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