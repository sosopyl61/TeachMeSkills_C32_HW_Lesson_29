package by.rymtsov.I.right;

public class Bird implements Walkable, Flyable, Eatable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
}
