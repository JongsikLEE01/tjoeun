package Day15.Ex03_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex04_FileReaderWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("메모장 내용 입력");
		System.err.print(">> ");
		String str1 = sc.nextLine();
		
		// 파일 입력
		try {
			// 파일명 Test2.text로 출력 스트림 객체 생성ㄴ
			fw= new FileWriter("./src/Day15/Ex03_File/Test3.txt");
			// 문자열 str을 index 0~끝까지 출력	
			fw.write(str1);
			fw.close();
			System.out.println("파일 저장...");
		} catch (IOException e) {
			System.err.println("입출력 에러...");
			e.printStackTrace();
		}
		
		// 파일 출력
		try {
			fr = new FileReader("./src/Day15/Ex03_File/Test3.txt");
			int data = 0;
			// read: 한 문자씩 읽어와서 int타입으로 반환, 더이상 문자가 없으면 -1반환
			while ((data = fr.read()) !=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("인코딩 타입 : "+fr.getEncoding());
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 읽어오지 못했습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("문자 입력시 예외 발생");
			e.printStackTrace();
		}
		
		sc.close();
	}
}