package de.demmer.dennis;

public class ApplicationGenerics {

	public static void main(String[] args) {

		
		System.out.println("----Generic Method:----");

		
		Boolean[] stringArr = { true, false, true};
		GenericMethodTraining.printArray(stringArr);

		
		
		Double d = GenericMethodTraining.getArgumentBack(5.5);
		System.out.println(d);

		
		
		try {
			String biggestString = GenericMethodTraining.getBiggestVariable("A", "X", "B");
			System.out.println("Biggest String is: " + biggestString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		System.out.println("----Generic Class:----");
		GenericClassTraining<String> genericClassWithString = new GenericClassTraining<String>();

		
		
		genericClassWithString.setVar("Hallo Welt");
		System.out.println("Var is: " + genericClassWithString.getVar());

	}

}
