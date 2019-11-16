package kkalinowski.springframework.kkpetclinic.bootstrap;

import kkalinowski.springframework.kkpetclinic.model.Owner;
import kkalinowski.springframework.kkpetclinic.model.Vet;
import kkalinowski.springframework.kkpetclinic.service.OwnerService;
import kkalinowski.springframework.kkpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Krzysztof Kalinowski on 15/11/2019.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michał");
        owner1.setLastName("Sapacz");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Patrycja");
        owner2.setLastName("Budzik");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

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
