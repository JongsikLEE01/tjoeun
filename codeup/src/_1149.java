import java.util.Scanner;
//더 큰 정수 출력

public class _1149 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i > j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}
		
		sc.close();
	}
}