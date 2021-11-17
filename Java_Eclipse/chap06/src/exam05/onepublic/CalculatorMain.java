package exam05.onepublic;

import exam05.cal.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.addTwoDouble(3.14, 25));
		System.out.println(calc.multiTwoNum(45, 22));
		System.out.println(calc.divTwoNum(66, 22));
		System.out.println(calc.remainTwoNum(67, 22));

		calc.showOperationTimes();
	}
}
