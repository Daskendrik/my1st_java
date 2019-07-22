package ru.stqa.my1stPr.sandbox;

public class My1stPr { // Класс(объект), обычно называется по имени файла
	public static void main(String[] agrs) {  // А это уже метод
		//System.out.println("Hi"); // А это то, что она делает
		MyClass firstObject = new MyClass(1600, 11, 200);
		MyClass secondObject = new MyClass(1,1,1);
		firstObject.printParams();
		secondObject.printParams();
		firstObject.setHeight(-1);
		firstObject.setHeight(1);
	}
}
//  неоходимо добавить среду разработки, запускать через командную строку