package de.demmer.dennis;

import java.util.ArrayList;

public class Application2 {
	
	public static void main(String[] args) {
		
		GenericClassTraining<String> myClass = new GenericClassTraining<String>();
		
		myClass.setVar("Test");
		String i = myClass.getVar();
		System.out.println(i);
		
		
		
		GenericClassTraining<Double> myClass1 = new GenericClassTraining<Double>();
		myClass1.setVar(5.5);
		double d = myClass1.getVar();
		System.out.println(d);
		
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hallo Welt");
		
		
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		arrayListInteger.add(5);
		
		
		
		//---------- Generische Methoden -----------------
		
		GenericMethodTraining genMethoden = new GenericMethodTraining();
		genMethoden.getArgumentBack("Bla");
		
		System.out.println(GenericMethodTraining.getArgumentBack(5));
		System.out.println(GenericMethodTraining.getArgumentBack("Hallo Welt"));
		System.out.println(GenericMethodTraining.getArgumentBack(5.5));
		System.out.println(GenericMethodTraining.getArgumentBack(new int[5]));


		Integer[] arr1 = {1,2,3,4};
		GenericMethodTraining.printArray(arr1);
		
		
		String[] arr2 = {"Hallo","Welt"};
		GenericMethodTraining.printArray(arr2);
		
		
		try {
		
			System.out.println(GenericMethodTraining.getBiggestVariable(5, 9, 2));
			System.out.println(GenericMethodTraining.getBiggestVariable(5.5, 5.6, 8.7));

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
