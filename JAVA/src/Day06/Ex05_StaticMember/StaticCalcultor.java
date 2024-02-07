package Day06.Ex05_StaticMember;

public class StaticCalcultor {
	public static void main(String[] args) {
		int arr[] = {70,65,90,85,100};
		// 다른 클래스의 static 메소드를 호출하는 방법
		// 클래스명.메소드명( );
		
		System.out.println("abs(-123) : " + Calcultor.abs(-123));
		System.out.println("max(arr) : " + Calcultor.max(arr));
		System.out.println("min(arr) : " + Calcultor.min(arr));
	}
}

	//연산결과를 구하는 static 메소드 정의
	//절대값, 최대값, 최소값
class Calcultor{
	//절대값
	public static int abs(int val) {
		return val >= 0 ? val : -val;
	}
	//최대값
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			if(i > max)
				max = i;
		}
		return max;
	}
	//최소값
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i < min)
				min = i;
		}
		return min;
	}
}