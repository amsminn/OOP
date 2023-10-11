
// (����4-1)
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
		
		// (����4-1) ���� ��ġ

	}

	public int dequeue() {
		
		// (����4-1) ���� ��ġ

	}

	public void display() {
		
		// (����4-1) ���� ��ġ

	}

	@Override
	public boolean isEmpty() {
		
		// (����4-1) ���� ��ġ

	}
}


// (����4-2)
class CardDeck implements java.util.Iterator {
    private static String[] cardNames = {
             "2", "3", "4", "5", "6", "7", "8", "9",
	     "10", "Jack", "Queen", "King", "Ace" };
    private int current = 0;
    
    public boolean hasNext() {
		
		// (����4-2) ���� ��ġ

    }
    
    public Object next() {
		
		// (����4-2) ���� ��ġ

    }
    
    public void remove() {    	
		
		// (����4-2) ���� ��ġ

    }
}


// (����4-3)
interface GetInfo {
	double getValue();
	static double average(GetInfo[] objects) { return 0; }
}

class Student implements GetInfo {
	double score;

	public Student(double score) {
		
		// (����4-3) ���� ��ġ

	}

	@Override
	public double getValue() {
		
		// (����4-3) ���� ��ġ

	}

	public static double average(GetInfo[] objects) {
		
		// (����4-3) ���� ��ġ

	}
}


public class Practice4 {
	public static void main(String[] args) {
    	// (����4-1)
		System.out.println("---(����4-1)---");
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

    	// (����4-2)
		System.out.println("\n---(����4-2)---");
        System.out.println("(ù��° ����)");
		CardDeck c = new CardDeck();
        while (c.hasNext()) {
        	String s = (String) c.next();
        	if(s.equals("Jack"))
        		c.remove();
            System.out.println("next()�� ��ȯ�ϴ� ��:"+ s);
        }
        System.out.println("\n(�ι�° ����)");
		c = new CardDeck();
        while (c.hasNext()) {
            System.out.println("next()�� ��ȯ�ϴ� ��:"+ c.next());
        }

    	// (����4-3)
		System.out.println("\n---(����4-3)---");
		Student[] list = new Student[3];
		list[0] = new Student(10.0);
		list[1] = new Student(20.0);
		list[2] = new Student(30.0);
		System.out.println(Student.average(list));
	}
}