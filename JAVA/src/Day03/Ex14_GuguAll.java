package Day03;

public class Ex14_GuguAll {
	public static void main(String[] args) {
		//1~9단의 구구단
		for(int i = 1; i <=9; i++) {
			System.out.println("*****"+ i +"단*****");
			for(int j = 1; j <=9; j++) {
				System.out.print(i + "*" + j + "=" + (i*j));
				System.out.print("\n");
			}
			System.out.println("\t");
		}
	}
}