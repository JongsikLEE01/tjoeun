package Day15.Ex03_File;

import java.io.IOException;
import java.io.FileInputStream;

public class Ex06_FileInputStream {
	public static void main(String[] args) {
		// 바이트 스트림 클래스
		// FileInputStream 객체로 바이트코드(이진데이터) 그대로 입력
		// 문자 스트림 클래스와 다르게 문자로 변환하는 작업
		byte[] data = new byte[100];
		try {
			FileInputStream fis = new FileInputStream("./src/Day15/Ex03_File/test.out");
			
			int i = 0,b;
			while ((b = fis.read())!=-1) {
				//읽어오느 바이트 b를 바이트 배열에 형변환하여 대입
				data[i] = (byte) b;
				i++;
			}
			for (byte a : data) {
				System.out.println((char)a);
			}
			fis.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("입출력 예외발생");
			e.printStackTrace();
		}
	}
}