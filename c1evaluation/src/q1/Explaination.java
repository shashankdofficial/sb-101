//package q1;
//
//public class Explaination {
//
//	Two synchronized thread can communicate each other by using some methods present 
//	in Object class, those methods are wait(), notify(), notifyAll().

//Wait();
//
//Whenever we want to suspend and synchronized thread unconditionally, we use wait() method.
//
//Notify();
//
//Whenever we want to resume the suspended (waiting) thread, we use notify() method. 


//Note:- we can call wait(), notify(),notifyAll() only in the synchronized block or 
//synchronized methods. otherwise we will get a runtime exception


//To call a wait() or notify() method on any object, we must have the access of the lock of the object 
//otherwise it will give us a runtime exception called IllegalMinorStateException.
//
//Once a thread calls wait() method on any object, it immediately releases the lock of that
//particular object and enters into the waiting area immediately.
//
//Once a thread calls notify() method on any object, it also releases the lock of the object but not 
//immediately
//}
