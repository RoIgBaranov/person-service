package telran.java47.person.dao;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;


import telran.java47.person.model.CityPopulation;
import telran.java47.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	Stream<Person> findByAddressCityIgnoreCase(String city);
	
	Stream<Person> findByNameIgnoreCase(String name);
	
	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);
	
//	Stream<CityPopulation> countByAddressCityGroupByCity();
}
