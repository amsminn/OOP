
// (문제4-1)
interface Queue {
	void enqueue(int item);
	int dequeue();
	boolean isEmpty();
	void display();
}

class MyQueue implements Queue {
	private static int front, back, capacity;
	private static int queue[];
	private final int INC_SIZE = 3;

	public MyQueue(int size) {
		front = back = 0;
		capacity = size;
		queue = new int[capacity];
	}

	public void enqueue(int item) {
		
		// (문제4-1) 구현 위치

	}

	public int dequeue() {
		
		// (문제4-1) 구현 위치

	}

	public void display() {
		
		// (문제4-1) 구현 위치

	}

	@Override
	public boolean isEmpty() {
		
		// (문제4-1) 구현 위치

	}
}


// (문제4-2)
class CardDeck implements java.util.Iterator {
    private static String[] cardNames = {
             "2", "3", "4", "5", "6", "7", "8", "9",
	     "10", "Jack", "Queen", "King", "Ace" };
    private int current = 0;
    
    public boolean hasNext() {
		
		// (문제4-2) 구현 위치

    }
    
    public Object next() {
		
		// (문제4-2) 구현 위치

    }
    
    public void remove() {    	
		
		// (문제4-2) 구현 위치

    }
}


// (문제4-3)
interface GetInfo {
	double getValue();
	static double average(GetInfo[] objects) { return 0; }
}

class Student implements GetInfo {
	double score;

	public Student(double score) {
		
		// (문제4-3) 구현 위치

	}

	@Override
	public double getValue() {
		
		// (문제4-3) 구현 위치

	}

	public static double average(GetInfo[] objects) {
		
		// (문제4-3) 구현 위치

	}
}


public class Practice4 {
	public static void main(String[] args) {
    	// (문제4-1)
		System.out.println("---(문제4-1)---");
		MyQueue q = new MyQueue(3);
		q.display();
		q.enqueue(10);
		q.display();
		q.enqueue(20);
		q.display();
		q.enqueue(30);
		q.display();
		q.enqueue(40);
		q.display();
		q.enqueue(50);
		q.display();
		q.enqueue(60);
		q.display();
		q.enqueue(70);
		q.display();

		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();

    	// (문제4-2)
		System.out.println("\n---(문제4-2)---");
        System.out.println("(첫번째 리딩)");
		CardDeck c = new CardDeck();
        while (c.hasNext()) {
        	String s = (String) c.next();
        	if(s.equals("Jack"))
        		c.remove();
            System.out.println("next()가 반환하는 값:"+ s);
        }
        System.out.println("\n(두번째 리딩)");
		c = new CardDeck();
        while (c.hasNext()) {
            System.out.println("next()가 반환하는 값:"+ c.next());
        }

    	// (문제4-3)
		System.out.println("\n---(문제4-3)---");
		Student[] list = new Student[3];
		list[0] = new Student(10.0);
		list[1] = new Student(20.0);
		list[2] = new Student(30.0);
		System.out.println(Student.average(list));
	}
}