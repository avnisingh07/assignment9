package ASSIGNMENT_9;

public class Synch {
    public static void main(String[] args) {

        CallMe target = new CallMe();

        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronised");
        Caller ob3 = new Caller(target, "World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try {

            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
