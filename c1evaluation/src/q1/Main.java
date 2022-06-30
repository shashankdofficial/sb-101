package q1;

public class Main {

	//A lock without key is nothing but deadlock.
	//If two threads are waiting for each other forever(for infinite time).
	//The synchronized keyword is the only reason for deadlock.
	//There are no solution for Deadlock situation
	//We just prevent it to not be happen with some preventions.
	
	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		
		ThreadA t1 = new ThreadA(a1, b1);
		ThreadB t2 = new ThreadB(a1, b1);
		
		t1.start();
		t2.start();
	}
	
	//Here if any method of class A or class B we remove the synchronized keyword then it will not become deadlock
}
