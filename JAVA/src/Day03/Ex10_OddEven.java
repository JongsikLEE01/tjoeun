package Day03;

public class Ex10_OddEven {
	public static void main(String[] args) {
		//1~ 20사이의 정수중 홀수 합계과 짝수 합계 구하기
		int i = 0;
		int sumodd = 0;
		int sumeven = 0;
		
		while(i <= 20) {
			if(i % 2 == 0) {
				sumeven += i;
			}else {
				sumodd += i;	
			}
			i++;
		}
		System.out.println("홀수 합계 : "+ sumodd);
		System.out.println("짝수 합계 : "+ sumeven);
	}
}