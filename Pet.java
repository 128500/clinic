package com.llisovichok.lessons.clinic;

import java.io.Serializable;

/**
*This class represents a client's pet
*/

public class Pet implements Serializable {
	
	/**
	*A name of a pet
	*/
	private final String name;
	/**
	 * The kind of a pet
	 */
	public  String KIND = "питомец";//"pet"

	/**
	*Class constructor
	*@param name a cat's name
	*/
	public Pet(final String name){
		this.name = name;
	}

	/**
	*Class constructor with no parameters
	*/
	public Pet(){
		this.name = "unknown";
	}

	public String getName(){
		return this.name;
	}

	public String getKind(){
		return this.KIND;
	}

	@Override
	public String toString(){
		
		return	String.format("Имя питомца '%s' (%s)", this.name, this.KIND);
	}
				
}