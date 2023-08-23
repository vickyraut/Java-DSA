public class Abstract_Class {

    public static void main(String[] args) {

        //You can't create object of abstract class so this line will show error
        //Animal animal = new Animal();

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);


    }
}

abstract class Animal {
    String color;

    // You can't create object of abstract class so this constructor will invoke when we create object of child class.
    Animal() {
        color = "yellow";
    }

    void eat() {
        System.out.println("Animal is Eating");
    }

    abstract void walk();
}

class Horse extends Animal {
    @Override
    void walk() {
        System.out.println("Horse is walking");
    }
}

