package Day11.Ex03_MultiCatch;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 수 정수 2개를 입력");
		
		try {
			String str1 =sc.nextLine();				// ArrayIndexOutOfBound 발생 가능
			String str2 =sc.nextLine();			
			
			char[] char1 = str1.toCharArray();		// String -> char[] 변환
			char[] char2 = str1.toCharArray();		// "10" -> [1][0]
			
			String[] input1 = new String[char1.length];
			String[] input2 = new String[char1.length];
			
			// char1 -> ['1']['0']
			// input1 -> ['1']['0']
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] + "";
			}
			for (int i = 0; i < char2.length; i++) {
				input2[i] = char2[i] + "";
			}
			
			System.out.println(input1[0] + input1[1]);	// IndexOutOfBound 발생 가능
			System.out.println(input2[0] + input2[1]);
			
			int value1 = Integer.parseInt(str1);	// NumberFormatException 발생 가능
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1+" + "+str2+"="+result);
		// 다중 catch : 여러 예외를 각각 다른 catch블록으로 처리하는것
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("접근할 수 없는 index 배열 범위입니다(한 자리 수 입력한 경우)");
		} catch(NumberFormatException e) {
			System.err.println("숫자로 변환할 수 없는 값 입니다(문자를 입력한 경우)");
		} catch (Exception e) {
			System.err.println("이 외의 알 수 없는 예외 발생");
		}
		
		sc.close();
	}
}