package com.training.other;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			String s="abc";
			int c= Integer.parseInt(s);
			int a = 10 / 0;
			System.out.println("im in try block2");	
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("in catch block");
			ex.printStackTrace();
		} catch (Exception e) {
			System.out.println("in exception block");
			e.printStackTrace();;
		}

	}
}
