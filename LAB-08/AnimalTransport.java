/*
 * The Transport interface declares a deliver () method. The abstract class Animal is the 
* super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
* implemented by the Camel and Donkey classes. Write a test program that initialize an 
* array of four Animal objects. If the object implements the Transport interface, the 
* deliver () method is invoked. [A]. 
*/


interface Transport {
    public void deliver();
}

abstract class Animal {
    abstract void display();
}

class Tiger extends Animal{ 
    void display() { 
        System.out.println("Tiger"); 
    } 
} 
class Deer extends Animal {
    void display() {
        System.out.println("Deer");
    }
} 
class Camel extends Animal implements Transport { 
    public void deliver() { 
        System.out.println("Camel is Transport "); 
    } 
    void display() { 
        System.out.println("Camel"); 
        // deliver();
    }     
} 
class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("Donkey is Transport");
    }
    void display() {
        System.out.println("Donkey");
        // deliver(); 
    }
}


public class AnimalTransport {
    public static void main( String[] args ) 
    {

        Animal[] A1 =new Animal[4];

        A1[0] = new Tiger(); 
        A1[1] = new Camel(); 
        A1[2] = new Donkey(); 
        A1[3] = new Deer();

        for (int i=0; i<A1.length; i++) { 
            A1[i].display();
        }
        ((Transport)A1[1]).deliver();
        ((Transport)A1[2]).deliver();
    }
    
}
