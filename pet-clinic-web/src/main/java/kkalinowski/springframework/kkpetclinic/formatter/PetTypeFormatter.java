package kkalinowski.springframework.kkpetclinic.formatter;

import kkalinowski.springframework.kkpetclinic.model.PetType;
import kkalinowski.springframework.kkpetclinic.service.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by Krzysztof Kalinowski on 08/12/2019.
 */
@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) {
        return  petTypeService.findByName(text);
    }
}
