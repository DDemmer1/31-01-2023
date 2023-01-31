package de.demmer.dennis;

public class GenericMethodTraining {

	public static <T> T getArgumentBack(T variable) {
		return variable;
	}
	

	public static <T> void printArray(T[] array) {
		System.out.print("[");

		for (int i = 0; i < array.length; i++) {
			if (!(i == array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.print("]\n");
	}

	
	//ADVANCED!
	public static  <T extends Comparable<T>> T getBiggestVariable(T var1, T var2, T var3) throws Exception  {

		
		if(!(var1 instanceof Comparable<T>)) {
			throw new Exception("Parameter is not of Type Comparable");
		}
		
		
		T biggest = var1;

		if (var2.compareTo(biggest) > 0) {
			biggest = var2;
		}

		if (var3.compareTo(biggest) > 0) {
			biggest = var3;
		}
		
		return biggest;

	}

}
