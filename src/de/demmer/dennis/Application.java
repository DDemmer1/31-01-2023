package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {
		System.out.println("----Generic Method:----");
		
		Integer[] arr = { 1, 2, 3, 4, 5 };
		GenericMethodTraining.printArray(arr);

		int i = GenericMethodTraining.getArgumentBack(10);
		System.out.println(i);
		

		try {
			int biggest = GenericMethodTraining.getBiggestVariable(4, 9, 0);
			System.out.println("Biggest int is: "  + biggest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		System.out.println("----Generic Class:----");
		GenericClassTraining genericClass = new GenericClassTraining();

		
		
		
		genericClass.setVar(10);
		System.out.println("Var is: "  + genericClass.getVar());
		
		

	}

}
