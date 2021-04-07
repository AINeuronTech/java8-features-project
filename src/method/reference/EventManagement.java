package method.reference;

public class EventManagement {
    public static void sayHello(){
        System.out.println("Hello welcome to the event !");
    }

    public static void main(String[] args) {
        //case-1 Instance method reference
        /*EventManagement eventManagement = new EventManagement();
        Greeting greeting1 = eventManagement::sayHello;
        greeting1.welcome(); */

        //case-2 static method reference
        Greeting greeting2 = EventManagement::sayHello;
        greeting2.welcome();

    }
}
