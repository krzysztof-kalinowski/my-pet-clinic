package kkalinowski.springframework.kkpetclinic.bootstrap;

import kkalinowski.springframework.kkpetclinic.model.Owner;
import kkalinowski.springframework.kkpetclinic.model.Pet;
import kkalinowski.springframework.kkpetclinic.model.PetType;
import kkalinowski.springframework.kkpetclinic.model.Vet;
import kkalinowski.springframework.kkpetclinic.service.OwnerService;
import kkalinowski.springframework.kkpetclinic.service.PetTypeService;
import kkalinowski.springframework.kkpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Krzysztof Kalinowski on 15/11/2019.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1 = new PetType();
        petType1.setName("Dog");
        PetType savedDogPetType = petTypeService.save(petType1);

        PetType petType2 = new PetType();
        petType2.setName("Cat");
        PetType savedCatPetType = petTypeService.save(petType2);

        System.out.println("Loaded PetTypes...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michał");
        owner1.setLastName("Sapacz");
        owner1.setAdress("Szatańska 66");
        owner1.setCity("Warszawa");
        owner1.setTelephone("666666666");

        Pet michalPet = new Pet();
        michalPet.setPetType(savedDogPetType);
        michalPet.setOwner(owner1);
        michalPet.setBirthDate(LocalDate.now());
        michalPet.setName("Micha");
        owner1.getPets().add(michalPet);

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Patrycja");
        owner2.setLastName("Budzik");
        owner2.setAdress("Zegarowa 5");
        owner2.setCity("Jaroszówka");
        owner2.setTelephone("123456789");

        Pet patrycjaPet = new Pet();
        patrycjaPet.setPetType(savedCatPetType);
        patrycjaPet.setOwner(owner2);
        patrycjaPet.setBirthDate(LocalDate.now());
        patrycjaPet.setName("Katka");
        owner2.getPets().add(patrycjaPet);

        ownerService.save(owner2);


        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Krzysztof");
        vet1.setLastName("Kalinowski");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Zdzisław");
        vet2.setLastName("Mietkowski");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");





    }
}
