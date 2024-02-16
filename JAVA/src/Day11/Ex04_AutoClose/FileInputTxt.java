package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputTxt {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:/JSLEE/test.txt");	// text.txt 파일을 입력 할 수 있도록 연결
			
			int read = 0;
			
			// fis.read() : .txt 파일의 데이터를 한 글자씩 읽어오는 메소드, 더 이상 읽어올 데이터가 없으면 -1울 반환
			while((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
		} catch (FileNotFoundException e) {		// file이 존재하지 않을 때 예외를 처리
			System.err.println("파일을 찾을 수 없음...");
			e.printStackTrace();
		} catch (IOException e) {	// input, output 예외 처리
			System.err.println("입출력 관련 예외 발생...");
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}