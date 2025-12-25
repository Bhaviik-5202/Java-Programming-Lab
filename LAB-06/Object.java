public class Object {

    static int count = 0;

    public Object() {
        count++;
    }


    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();


        System.out.println("Number Of Object: " +count);

    }
}


/* 
 * 
 * public class ObjectCounter {
    // Static variable to count the number of objects
    private static int objectCount = 0;

    // Constructor that increments the object count
    public ObjectCounter() {
        objectCount++;
    }

    // Static method to get the current object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Displaying the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}

 */