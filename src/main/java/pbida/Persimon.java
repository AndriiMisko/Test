package pbida;

public class Persimon extends Fruit {

    protected String name = "Persimon";
    protected String color = "red";

    @Override
    protected void ripe(String name){
        System.out.println(name + " is ripe");
    }

}
