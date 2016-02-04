package osvyd;

public class Persimmon extends FruitAbstract {

    public Persimmon(String name, String color, String action){
        setName(name);
        setColor(color);
        setAction(action);
    }

    @Override
    public void ripe() {
        System.out.println(name + " " + action);
    }

    public void printFruitColor(){
        System.out.print(name + color);
    }



}