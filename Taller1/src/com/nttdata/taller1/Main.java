package com.nttdata.taller1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		//Metodo imperativo
		for(int number: numbers) {
			if(number>10) {
				System.out.println(number);
			}
		}
		
		//Metodo funcional
		System.out.println(numbers.stream().filter(number -> number>10).collect(Collectors.toList()));
	}

}
