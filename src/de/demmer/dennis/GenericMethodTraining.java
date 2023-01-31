package de.demmer.dennis;

public class GenericMethodTraining {

	public static <T> T getArgumentBack(T variable) {
		return variable;
	}
	

	public static void printArray(int[] array) {
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
	public static Integer getBiggestVariable(Integer var1, Integer var2, Integer var3) throws Exception  {

		
		if(!(var1 instanceof Comparable<Integer>)) {
			throw new Exception("Parameter is not of Type Comparable");
		}
		
		
		Integer biggest = var1;

		if (var2.compareTo(biggest) > 0) {
			biggest = var2;
		}

		if (var3.compareTo(biggest) > 0) {
			biggest = var3;
		}
		return biggest;

	}

}
