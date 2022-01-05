package com.bl.lamda;


interface IMathFunction {

	int calculate( int a, int b);

	static void printResult(int a, int b, IMathFunction fobj) {
		System.out.println(fobj.calculate(a, b));
	}
}

public class MathOperation {

	public static void main(String[] args) {

		IMathFunction add = (x , y) ->(x + y);
		System.out.println(add.calculate(45, 67));

		IMathFunction multiplication = (x, y) -> (x*y);
		System.out.println(multiplication.calculate(3, 2));

		IMathFunction substraction = (x, y) -> (x - y);
		System.out.println(substraction.calculate(15, 5));

		IMathFunction division = (x, y) -> {
			if(y == 0)
				return y;
			return (x / y);
		};

		System.out.println(division.calculate(23, 6));

		IMathFunction.printResult(7, 9, add);

		IMathFunction.printResult(8, 9, multiplication);

		IMathFunction.printResult(10, 9, substraction);

		IMathFunction.printResult(9, 9, division);
	}
}
