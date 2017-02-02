package com.llisovichok.lessons.clinic;

import java.io.Serializable;

/**
*This class describes a client and his pet
*/
public class Client implements Serializable {
/**
*A name of the client
*/
	private final String name;
	
/**
*A pet that the client has
*/
	private final Pet pet;

/**
*Class constructor
*/	
	public Client(String name, Pet pet) throws UserException {
		if (name.equals("")){
			throw new UserException("Вы не ввели имя клиента!");
		}
		else this.name = name;

		if (pet == null){
			throw new UserException("Вы не указали питомца!");
		}
		else this.pet = pet;
	}


	public String getName(){
		return this.name;
	}

	public Pet getPet(){
		return this.pet;
	}


	@Override
	public String toString(){
		String result;
		result = 	"Имя клиента: " + this.name + "\n" +
					"Питомец: " + this.pet.getKind() + "\n"+
					"Имя питомца: " + this.pet.getName() + "\n\n";
		return result;			
	}
}