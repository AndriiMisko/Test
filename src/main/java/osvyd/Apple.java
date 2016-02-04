package osvyd;

public class Apple extends FruitAbstract {

    public Apple(String name, String color, String action){
        setName(name);
        setColor(color);
        setAction(action);
    }

    @Override
    public void ripe() {
        System.out.println(getName(name) + " " + getAction(action));
    }

    public void printFruitColor(){
        System.out.print(getName(name) + getColor(color));
    }



}