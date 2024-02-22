package Day15.Ex03_File;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_InputStreamReader {
	public static void main(String[] args) {
		// 문자 스트림 클래스
		// new InputStreamReader(입력 스트림 객체);
		// Sysout.in -> 키보드로부터 문자를 입력하는 스트림 객체
		InputStreamReader isr =  new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			
			try {
				// 입력 스트림으로부터 한 글자씩 읽어옴
				ch=(char) isr.read();
			} catch (IOException e) {
				System.err.println("파일을 연결할 수  없습니다.");
				e.printStackTrace();
			}
			if(ch == -1) break;
			System.out.print(ch);
		}
	}
}