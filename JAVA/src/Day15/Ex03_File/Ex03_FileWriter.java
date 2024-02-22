package Day15.Ex03_File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex03_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		try {
			// 파일명 Test2.text로 출력 스트림 객체 생성ㄴ
			fw= new FileWriter("./src/Day15/Test2.txt");
			// 문자열 str을 index 0~끝까지 출력
			fw.write(str1,0,str1.length());
			fw.close();
			System.out.println("파일 저장...");
		} catch (IOException e) {
			System.err.println("입출력 에러...");
			e.printStackTrace();
		}
		
		sc.close();
	}
}