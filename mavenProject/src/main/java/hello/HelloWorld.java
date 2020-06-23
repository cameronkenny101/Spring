package hello;

import java.time.LocalDateTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("The current local time is: " + current);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
