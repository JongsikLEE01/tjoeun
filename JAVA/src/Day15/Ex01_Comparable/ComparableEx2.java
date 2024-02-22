package Day15.Ex01_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
	영화 가격 순 오름차순
 */
class Movie implements Comparable<Movie>{
	String title;
	String author;
	int price;
	
	// 생성자
	public Movie() {
		this("제목없음", "작자미상", 0);
	}
	public Movie(String title, String author, int price) {
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
		return "Movie [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	// compareTo
	// - 책 객체의 가격순으로 오름차순으로 정렬되도록 기준을 정의
	@Override
	public int compareTo(Movie o) {
		// this : 해당 객체
		// o    : 비교 객체
		
		// 영화 제목 순 오름차순
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		return -result;	// -result : 음수로 바꾸면 내림차순
		// String의 compareTo() 메소드로 문자열 크기를 비교
		// 사전 순으로 앞쪽이 작은 문자열, 뒤쪽이 큰 문자열
		// 해당 객체.compareTo(비교 객체)
		// 해당객체 > 비교객체 : 양수
		// 해당객체 = 비교객체 : 0
		// 해당객체 < 비교객체 : 음수
	}	
}

public class ComparableEx2 {
	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("가", "가",10000));
		movieList.add(new Movie("나", "나",30000));
		movieList.add(new Movie("A", "다",50000));
		movieList.add(new Movie("나", "라",40000));
		movieList.add(new Movie("1", "마",20000));
		// 정렬전
		for (Movie movie : movieList) {
			System.out.println(movie);	
		}
		System.out.println();
		
		// 오름차순 정렬
		// Book 객체에 구현된 comparaTo() 메소드의 비교 기준으로 정렬
		Collections.sort(movieList);
		
		for (Movie movie : movieList) {
			System.out.println(movie);	
		}
	}
}