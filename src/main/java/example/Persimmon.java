package example;

public class Persimmon extends Fruit {

    public Persimmon() {
        name = "Persimmon";
        color = "Red";
    }

    @Override
    public void ripe() {
        System.out.println(name + " is ripe");
    }
}
