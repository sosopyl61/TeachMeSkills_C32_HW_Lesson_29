package by.rymtsov.I.wrong;

public class Cat implements Animal {

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Cat can't fly");
    }
}
