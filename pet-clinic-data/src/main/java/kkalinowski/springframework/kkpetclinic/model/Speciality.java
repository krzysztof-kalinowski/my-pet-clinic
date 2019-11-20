package kkalinowski.springframework.kkpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Krzysztof Kalinowski on 18/11/2019.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Builder
    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    @Column(name = "description")
    private String description;

}
