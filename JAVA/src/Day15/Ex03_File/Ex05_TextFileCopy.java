package Day15.Ex03_File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_TextFileCopy {
	public static void main(String[] args) {
		//Test.txt파일을 test4.txt파일로 복사
		// 1 test.txt 파일 입력
		// 2 test4.txt 파일 출력
		FileReader fr =  null;
		FileWriter fw = null;
		
		int data = 0;
		try {
			fr = new FileReader("./src/Day15/Ex03_File/Test.txt");
			fw = new FileWriter("./src/Day15/Ex03_File/Test4.txt");
			
			while((data = fr.read())!=-1) {
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println("파일 복사...");
			System.out.println("test.txt -> text4.txt");
		} catch (IOException e) {
			System.err.println("입출력 오류...");
			e.printStackTrace();
		}
	}
}