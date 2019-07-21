package com.rtti;

import static com.util.Print.print;
import static com.util.Print.printnb;

import com.rtti.petExample.Pet;
import com.rtti.petExample.Pets;
import com.util.TypeCounter;

public class PetCount4 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		for (Pet pet : Pets.createArray(20)) {
			printnb(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		print();
		print(counter);
	}
}