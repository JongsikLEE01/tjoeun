package Day15.Ex02_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparator<User>{
	String id;
	String name;
	int age;
	
	public User() {
		this("X","X",0);
	}
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// compare
	@Override
	public int compare(User o1, User o2) {
		// 정렬 1: 나이순 - 오름차
		// 정렬 2: 이름순 - 내림차
		// o1 : 해당 객체
		// o2 : 비교 객체
		
		// 나이순으로 오름차순 조건
		int age1 = o1.age;
		int age2 = o2.age;
		String name1 = o1.name;
		String name2 = o2.name;
		
		// 나이가 같을때 이름순으로 내림차순 조건 작성
		// 방법1
//		if(age1 > age2) return 1;
//		if(age1 == age2){
//			int gap = name1.compareTo(name2);
//			 return -gap;
//		}
//		if(age1 < age2) return -1;		
//		return 0;
		
		// 방법2
		int result1 = age1 - age2;
		int result2 = -name1.compareTo(name2);
		// if(result1 == 0) return result2;
		return result1 != 0 ? result1 : result2;
	}
	
}

public class ComparatorEx {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User("user1","8",20));
		userList.add(new User("user2","5",27));
		userList.add(new User("user3","4",20));
		userList.add(new User("user4","3",27));
		userList.add(new User("user5","2",55));
		userList.add(new User("user6","1",18));
		userList.add(new User("user7","7",20));
		// 정렬전
		for (User movie : userList) {
			System.out.println(movie);	
		}
		System.out.println();
				
		// 오름차순 정렬
		// Book 객체에 구현된 comparaTo() 메소드의 비교 기준으로 정렬
		Collections.sort(userList, new User());
		
		for (User movie : userList) {
			System.out.println(movie);	
		}
	}
}