package kkalinowski.springframework.kkpetclinic.service;

import java.util.Set;

/**
 * Created by Krzysztof Kalinowski on 11/11/2019.
 */

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
