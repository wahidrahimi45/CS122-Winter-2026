package inteface;

import org.example.Mammal;

public interface Walkable {
    public abstract void walk();
}
interface Nameable
{
    String getName();
}


abstract class Animal implements Walkable {

}



class Monkey implements Walkable, Nameable {
    @Override
    public void walk()
    {
        System.out.println("Monkey can walk on the ground and on the tree");
    }

    @Override
    public String getName() {
        return null;
    }
}

class Cat extends Animal implements Walkable, Nameable{

    String name;
    @Override
    public void walk() {
        System.out.println("Cat walk only on the ground");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

