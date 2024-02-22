package Day15.Ex03_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) {
		// FileReader - 문자 스트림 클래스
		// new FileReader("파일경로")
		try {
			FileReader fr = new FileReader("./src/Day15/Test.txt");
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
	}
} 