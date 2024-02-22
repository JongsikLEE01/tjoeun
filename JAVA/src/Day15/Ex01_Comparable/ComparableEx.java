package Day15.Ex01_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
	책 가격 순 오름차순
 */
class Book implements Comparable<Book>{
	String title;
	String author;
	int price;
	
	// 생성자
	public Book() {
		this("제목없음", "작자미상", 0);
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	// compareTo
	// - 책 객체의 가격순으로 오름차순으로 정렬되도록 기준을 정의
	@Override
	public int compareTo(Book o) {
		// this : 해당 객체
		// o    : 비교 객체
		
		// 가격 순 오름차순
		int thisPrice = this.getPrice();
		int comPrice = o.getPrice();
		
		// 양수(1) 	: 해당 객체가 큼
		// 0      	: 같음
		// 음수(-1)  : 해당 객체가 작음
		// 방법1
//		if(thisPrice > comPrice) return 1;
//		if(thisPrice == comPrice) return 0;
//		if(thisPrice < comPrice) return -1;
//		return 0;
		
		// 방법2
		int gap = thisPrice - comPrice;		// 오름차순
		int gap2 = comPrice - thisPrice;	// 내림차순
		return gap2;
	}	
}

public class ComparableEx {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("책1", "작성자1",10000));
		bookList.add(new Book("책2", "작성자2",30000));
		bookList.add(new Book("책3", "작성자3",50000));
		bookList.add(new Book("책4", "작성자4",40000));
		bookList.add(new Book("책5", "작성자5",20000));
		// 정렬전
		for (Book book : bookList) {
			System.out.println(book);	
		}
		System.out.println();
		
		// 오름차순 정렬
		// Book 객체에 구현된 comparaTo() 메소드의 비교 기준으로 정렬
		Collections.sort(bookList);
		
		for (Book book : bookList) {
			System.out.println(book);	
		}
	}
}