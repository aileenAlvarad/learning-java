package com.curso3;

public class ManipulaCadena3 {

	public static void main(String[] args) {

		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "david";

		System.out.println(alumno1.equals(alumno2));

		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}