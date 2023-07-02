package telran.java47.person.service;

import telran.java47.person.dto.AddressDto;
import telran.java47.person.dto.CityPopulationDto;
import telran.java47.person.dto.PersonDto;

public interface PersonService {
	boolean addPerson(PersonDto personDto);
	
	PersonDto findPersonById(Integer id);
	
	PersonDto updateName(Integer id, String name);
	
	PersonDto updateAddress(Integer id, AddressDto addressDto);
	
	PersonDto deletePerson(Integer id);
	
	Iterable<PersonDto> findPersonsByCity(String city);
	
	Iterable<PersonDto> findPersonsByAges(Integer from, Integer to);
	
	Iterable<PersonDto> findPersonsByName(String name);
	
	Iterable<CityPopulationDto> getCityPopulation(); 
}
