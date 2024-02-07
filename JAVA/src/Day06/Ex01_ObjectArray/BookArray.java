package Day06.Ex01_ObjectArray;

import java.util.Scanner;

/*책제목, 저자명을 갖는 book 클래스 정의
  book 클래스타입의 객체 배열을 생성
  사용자로부터 책 3권을 입력받아 출력하는 프로그램*/
//하나의 클래스파일에서 여러개의 클래스를 정의할 수 있음
class Book{
	String title;
	String author;
	
	// 기본 생성자
	public Book() {
		this("제목없음","작자미상"); // 기본값
	}
	// 매개변수가 있는 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// toString()메소드 오버라이딩
	// : 객체를 출력문에 출력 시, 출력할 템플릿을 지정하는 메소드
	// 반환Object(최상위 클래스)에 정의된 toString() 메소드를 오버라이딩
	// 반환값을 출력문에서 출력하는 객체를 대신해 출력
	@Override
	public String toString() {
		return "[책이름 : " + title + ", 저자 : " + author + "]";
	}
}

// 메인클래스 : 클래스파일 이름과 클래스 이름은 같아야함
public class BookArray {
	public static void main(String[] args) {
		// Book 타입의 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		// 입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.printf("%d번째 책의 이름을 입력하세요 : ", i+1);
			String title = sc.nextLine();
			System.out.printf("%d번째 책의 저자를 입력하세요 : ", i+1);
			String author = sc.nextLine();
			// Book 객체를 객체 배열 bookArray에 대입
			bookArray[i] = new Book(title, author);
		}
		
		// 출력
		for(Book book : bookArray) {
			System.out.println(book);
		}
		
		sc.close();
	}
}