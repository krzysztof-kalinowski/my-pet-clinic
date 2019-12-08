package kkalinowski.springframework.kkpetclinic.controller;

import kkalinowski.springframework.kkpetclinic.model.Owner;
import kkalinowski.springframework.kkpetclinic.model.PetType;
import kkalinowski.springframework.kkpetclinic.service.OwnerService;
import kkalinowski.springframework.kkpetclinic.service.PetTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by Krzysztof Kalinowski on 08/12/2019.
 */

@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {

    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public PetController(OwnerService ownerService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @ModelAttribute("types")
    public Collection<PetType> populatePetTypes() {
        return petTypeService.findAll();
    }

    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") Long ownerId) {
        return ownerService.findById(ownerId);
    }

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }


}
