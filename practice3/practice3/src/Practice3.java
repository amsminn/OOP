import java.util.ArrayList;
import java.util.Scanner;

//(문제3-1) 1개 클래스
class Book {

}



//(문제3-2) 3개 클래스
class Phone {

}

class Answeringphone extends Phone {

}

class Smartphone extends Answeringphone {

}



//(문제3-3) 2개 클래스
class Vehicle {

}

class Car extends Vehicle {

}


// (실습3) 테스트 클래스
public class Practice3 {
    public static void main(String[] args) {

        // (문제3-1) 테스트코드 시작 위치
		System.out.println("---(문제3-1)---");
        
        //    (작업1)  Book 객체 생성, 메뉴 생성 및 처리
        //    (작업2)  책 배열 타입은 ArrayList를 사용함
        //    (작업3)  책 이름 비교는 String 메소드(indexOf())를 사용함

    	
        //  ((문제3-2) 테스트코드 시작 위치
		System.out.println("\n\n---(문제3-2)---");
		Phone[] phones = { new Phone("황진이"), new Answeringphone("길동이", "내일"), new Smartphone("민국이", "저녁때", "갤러그") };
        // --> 위 문장에서 초기화된 전화기 배열객체를 사용하여 아래 위치에 테스트 코드를 추가-완성할 것.

        //  (문제3-2) 테스트코드 추가

		
        // (문제3-3) 테스트코드 시작 위치
		System.out.println("\n\n---(문제3-3)---");
		Vehicle v = new Vehicle("실버", 150);
		v.show();
		
		System.out.println();
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v2 = c;
		v2.show();
		
    }
}