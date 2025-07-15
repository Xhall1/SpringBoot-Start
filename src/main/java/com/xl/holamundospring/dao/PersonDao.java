package com.xl.holamundospring.dao;

import com.xl.holamundospring.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {

}
