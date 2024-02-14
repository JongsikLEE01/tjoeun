package Day08.Ex02_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0.0;
		
		// 입력 받은 도형 배열
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while(true) {
			if(index == 3) break;
			// 각 도형의 종류 선택
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.print(">>");
			String input = sc.next();
			// "그만"을 입력하면 while문 종료
			if(input.equals("그만"))
				break;
			
			// 도형 선택
			switch (input) {
			case "1": // 삼각형
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				height = sc.nextDouble();
				// 도형 객체를 입력받아 배열에 추가
				shapeList[index++] = new Triangle(width, height);
				break;
			case "2": // 사각형
				System.out.print("가로 : ");
				width = sc.nextDouble();
				System.out.print("세로 : ");
				height = sc.nextDouble();
				
				shapeList[index++] = new Rectangle(width, height);
				break;
			case "3": // 원형
				System.out.print("반지름 : ");
				radius = sc.nextDouble();
				
				shapeList[index++] = new Circle(radius);
				break;
			}
		}
		// 넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			if(shape == null)
				continue;
			// instanceof : 인스턴스를 비교하는 연산자
			// 같은 인스턴스면 true, 아니면 false를 반환
			// 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용
			if(shape instanceof Triangle)
				System.out.println("삼각형!");
			if(shape instanceof Rectangle)
				System.out.println("사각형!");
			if(shape instanceof Circle)
				System.out.println("원형!");
			
			// 넓이와 둘레
			double area = shape.area();
			double round = shape.round();
			
			// 합계
			areaSum += area;
			roundSum += round;
			// 둘레와 넓이를 출력
			System.out.print("넓이 : " + area + "\t");
			System.out.print("둘레 : " + round + "\t");
			System.out.println();
		}
		// 둘레 총합과 넓이 총합을 출력
		System.out.println("넓이 총합 : "+areaSum);
		System.out.println("둘레 총합 : "+roundSum);
		
		sc.close();
	}
}