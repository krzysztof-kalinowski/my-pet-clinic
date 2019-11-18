package kkalinowski.springframework.kkpetclinic.model;

/**
 * Created by Krzysztof Kalinowski on 18/11/2019.
 */

public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
