import java.util.ArrayList;
import java.util.Scanner;

//(����3-1) 1�� Ŭ����
class Book {

}



//(����3-2) 3�� Ŭ����
class Phone {

}

class Answeringphone extends Phone {

}

class Smartphone extends Answeringphone {

}



//(����3-3) 2�� Ŭ����
class Vehicle {

}

class Car extends Vehicle {

}


// (�ǽ�3) �׽�Ʈ Ŭ����
public class Practice3 {
    public static void main(String[] args) {

        // (����3-1) �׽�Ʈ�ڵ� ���� ��ġ
		System.out.println("---(����3-1)---");
        
        //    (�۾�1)  Book ��ü ����, �޴� ���� �� ó��
        //    (�۾�2)  å �迭 Ÿ���� ArrayList�� �����
        //    (�۾�3)  å �̸� �񱳴� String �޼ҵ�(indexOf())�� �����

    	
        //  ((����3-2) �׽�Ʈ�ڵ� ���� ��ġ
		System.out.println("\n\n---(����3-2)---");
		Phone[] phones = { new Phone("Ȳ����"), new Answeringphone("�浿��", "����"), new Smartphone("�α���", "���ᶧ", "������") };
        // --> �� ���忡�� �ʱ�ȭ�� ��ȭ�� �迭��ü�� ����Ͽ� �Ʒ� ��ġ�� �׽�Ʈ �ڵ带 �߰�-�ϼ��� ��.

        //  (����3-2) �׽�Ʈ�ڵ� �߰�

		
        // (����3-3) �׽�Ʈ�ڵ� ���� ��ġ
		System.out.println("\n\n---(����3-3)---");
		Vehicle v = new Vehicle("�ǹ�", 150);
		v.show();
		
		System.out.println();
		Car c = new Car("�Ķ�", 200, 1000, 5);
		c.show();

		System.out.println();
		Vehicle v2 = c;
		v2.show();
		
    }
}