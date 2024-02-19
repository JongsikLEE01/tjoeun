package Day12.Ex04_Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysEx {
	public static void main(String[] args) {
		// 정렬되지 않는 배열요소들
		Integer[] arr = {5, 3, 4, 1, 2};
		
		// 배열을 정렬(sort) - 오름차순
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 배열의 정렬(sort) - 내림차순
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 이진 탐색 알고리즘(BinarySearch)
		// Arrays.binarySearch(배열, 찾을값)
		// - 전제 조건 : 주어짅 배열이 오름차순 정렬되어 있어야함
		// 이진 탐색 알고리즘을 사용해 탐색 후
		// 해당 값이 있으면 그 위치를 반환, 없을 경우 () - (insertion point)-1) 음수를 반환
		
		// 1~100 사이의 랜덤 수를 가지는 배열
		int random[] = new int[100];
		
		Random rand = new Random();
		for (int i = 0; i < random.length; i++) {
			random[i] = rand.nextInt(100)+1;
		}
		
		// 오름차순 정렬
		Arrays.sort(random);
		for (int i : random) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 이진탐색 : 정수 10을 100개의 랜덤 수 중에서 탐색
		int result = Arrays.binarySearch(random, 10);
		if(result < 0) {
			System.out.println("랜덤 수 10이 없음");
			System.out.println("insertion point : "+result);
		}else { 
			System.out.println("index? "+result);
		}
		
		// Arrays.fill(값) : 값으로 모든 배열요소를 채우는 메소드
		int fill[] = new int[10];
				
		Arrays.fill(fill, 8);
				
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + " ");
		}
		System.out.println();
		
		// Arrays.copyOf(배열, 길이);
		// : 배열을 앞에서 부터 (길이)개의 요소를 복사하여 배열로 반환
		int copy[] = Arrays.copyOf(fill, 3);
		// 8 8 8 8 8  8 8 8 8 8
		// 8 8 8 을 복사해옴
				
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
				
		// Arrays.copyOfRange(배열, 시작index, 끝index+1);
		// : 배열을 시작index~끝index 까지의 요소를 복사하여 배열로 반환
		int copyRange[] = Arrays.copyOfRange(random, 11, 21);  // 11~20
				
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print(copyRange[i] + " ");
		}
		System.out.println();
	}
}