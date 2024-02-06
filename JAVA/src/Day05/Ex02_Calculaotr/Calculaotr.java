package Day05.Ex02_Calculaotr;
/*
 * 계산기
 * - 피연산자 2개
 * 덧셈, 뺄셈(인자1 - 2), 곱셈(실수), 나눗셈(실수 인자1 / 2), 나머지(실수인자1 % 2), 합계, 평균
 *  메소드명 plus, minus, multiple, divide, remain, sum, avg
 */

public class Calculaotr {
	int a;
	int b;
	int arr[];
	
	public Calculaotr() {
		
	}
	
	public Calculaotr(int a, int b, int arr[]) {
		this.a = a;
		this.b = b;
		this.arr = arr;
	}
	// 덧셈
	public int plus(int a1, int a2) {
		int result;
		result = a1 + a2;
		return result;
	}
	// 뺄셈
	public int minus(int a1, int a2) {
		int result;
		result = a1 - a2;
		return result;
	}
	// 곱셈
	public double multiple(double a1, double a2) {
		double result;
		result = a1 * a2;
		return result;
	}
	// 나눗셈
	public double divide(double a1, double a2) {
		double result;
		result = a1 / a2;
		return result;
	}
	// 나머지
	public double remain(double a1, double a2) {
		double result;
		result = a1 % a2;
		return result;
	}
	// 합계
	public double sum(double a1[]) {
		int result = 0;
		for(double i : a1) 
			result += i;
		return result;
	}
	// 평균
	public double avg(double a1[]) {
		double result = (double) sum(a1);
		double avg;
		// 합계 메소드 호출 : 합계 / 배열 길이
		avg=result/a1.length;
		return avg;
	}
}