package by.rymtsov.I.right;

public class Dog implements Walkable, Eatable {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
