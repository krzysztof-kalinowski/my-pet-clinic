package kkalinowski.springframework.kkpetclinic.model;

import java.io.Serializable;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
