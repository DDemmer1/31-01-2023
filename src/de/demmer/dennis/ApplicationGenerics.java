package de.demmer.dennis;

public class ApplicationGenerics {

	public static void main(String[] args) {

		
		System.out.println("----Generic Method:----");

		String[] stringArr = { "Das", "ist", "ein", "Test" };
		GenericMethodTraining.printArray(stringArr);

		String string1 = GenericMethodTraining.getArgumentBack("Hallo Welt");
		System.out.println(string1);

		try {
			String biggestString = GenericMethodTraining.getBiggestVariable("A", "X", "B");
			System.out.println("Biggest String is: " + biggestString);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----Generic Class:----");
		GenericClassTraining genericClassWithString = new GenericClassTraining<String>();

		genericClassWithString.setVar("Hallo Welt");
		System.out.println("Var is: " + genericClassWithString.getVar());

	}

}
