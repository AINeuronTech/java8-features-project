package lambda.expression;

public class TestDrive {
    public static void main(String[] args) {
        Car car = new Car(){
            @Override
            public void start(){
                System.out.println("start feature to run the engine");
            }

            @Override
            public void stop(){
                System.out.println("break feature to stop the engine");
            }
        };
        car.start();
        car.stop();

        Engine engine = (a,b) -> System.out.println(a+b);
        engine.move(10,15);


        Delivery delivery = (s) -> System.out.println(s);
        delivery.uberEat("food delivery");
    }
}
