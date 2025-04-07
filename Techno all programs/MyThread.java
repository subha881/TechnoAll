public class MyThread extends Thread {
    public void run(){ //running state(cpu allocation)
        for (int i = 0;i<10;i++){
            System.out.println("Thread started...."+Thread.currentThread().getId());
            try{
                Thread.sleep(2000);//blocked state /waiting state
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread pj = new MyThread(t1);
        t1.start(); // runable state
       MyThread t2 = new MyThread();
        t2.start(); 
    }
    
}
/*Here’s a detailed list of the methods present in the Thread class and the Object class in Java, along with explanations for each.

1. Methods in the Thread Class
The Thread class provides methods to create and control threads in Java. Here are the important methods of the Thread class:

Method	Description
start()	Starts the thread, invoking its run() method.
run()	Defines the code executed by the thread when started. Should be overridden when extending Thread.
sleep(long millis)	Causes the current thread to sleep for the specified number of milliseconds.
join()	Waits for the thread to die. If a thread calls join(), the calling thread will wait for the joined thread.
join(long millis)	Waits for the thread to die or for the specified number of milliseconds, whichever happens first.
interrupt()	Interrupts the thread, setting its interrupt status to true. Can be used to stop the thread from sleeping or waiting.
isInterrupted()	Returns true if the thread has been interrupted, false otherwise.
interrupted()	Checks if the current thread has been interrupted and clears the interrupted status flag.
getId()	Returns the thread's unique ID.
getName()	Returns the thread's name.
setName(String name)	Sets the thread's name.
getPriority()	Returns the thread's priority (default is Thread.NORM_PRIORITY).
setPriority(int priority)	Sets the thread's priority (Thread.MIN_PRIORITY, Thread.NORM_PRIORITY, Thread.MAX_PRIORITY).
getState()	Returns the thread's state (NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED).
getThreadGroup()	Returns the thread group to which the thread belongs.
isAlive()	Returns true if the thread is alive (started but not terminated).
isDaemon()	Returns true if the thread is a daemon thread, false otherwise.
setDaemon(boolean on)	Marks the thread as a daemon thread or a user thread. Daemon threads exit when no user threads remain.
yield()	Causes the currently executing thread to temporarily pause and allow other threads to execute.
currentThread()	Returns a reference to the currently executing thread.
setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)	Sets the handler for uncaught exceptions in the thread.
getUncaughtExceptionHandler()	Returns the handler for uncaught exceptions in the thread.
countStackFrames()	Deprecated. Used to return the number of stack frames in the thread.
2. Methods in the Object Class
The Object class is the root class of all classes in Java. It defines methods that are available to every Java object.

Method	Description
equals(Object obj)	Checks if two objects are equal. The default implementation checks reference equality. Can be overridden.
hashCode()	Returns a hash code value for the object. It is used in hashing-based collections like HashMap.
toString()	Returns a string representation of the object. Can be overridden.
getClass()	Returns the runtime class of the object.
clone()	Creates and returns a copy of the object. Requires the class to implement the Cloneable interface.
finalize()	Called by the garbage collector before an object is destroyed. Can be overridden to clean up resources.
wait()	Causes the current thread to wait until another thread calls notify() or notifyAll() on the same object.
wait(long timeout)	Causes the current thread to wait until either the timeout expires or notify()/notifyAll() is called.
wait(long timeout, int nanos)	Causes the current thread to wait for the specified amount of time plus nanoseconds.
notify()	Wakes up one thread waiting on this object's monitor (using wait()).
notifyAll()	Wakes up all threads waiting on this object's monitor.
Detailed Explanations:
1. Methods in the Thread Class
start(): Starts the execution of the thread. It internally calls the run() method of the thread.
run(): Contains the code that defines the behavior of the thread. If the Thread class is extended, this method should be overridden.
sleep(long millis): Pauses the thread for the specified number of milliseconds. It can throw InterruptedException if the thread is interrupted while sleeping.
join(): Waits for the thread to finish its execution. It blocks the calling thread until the specified thread finishes.
interrupt(): Sets the interrupt flag for the thread. It doesn’t stop the thread but can be used to break out of blocking states like sleep(), wait(), etc.
yield(): Suggests that the current thread should pause and allow other threads to execute (but does not guarantee that another thread will be chosen).
isDaemon() / setDaemon(): Daemon threads are background threads that do not prevent the JVM from exiting when the application finishes. Use setDaemon(true) to make a thread a daemon.
2. Methods in the Object Class
equals(Object obj): Checks if two objects are "equal." By default, it checks reference equality, but it can be overridden to compare actual content.
hashCode(): Returns a hash code for the object. Objects that are "equal" (using equals()) must have the same hash code.
toString(): Provides a string representation of the object, commonly used for debugging. By default, it returns the class name followed by the object’s hash code, but this can be overridden.
wait() / notify() / notifyAll(): These methods are used for thread synchronization. wait() causes the current thread to wait until another thread invokes notify() or notifyAll() on the same object. notify() wakes up a single waiting thread, while notifyAll() wakes up all waiting threads.
These are core methods that form the backbone of multithreading and synchronization in Java.











 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */