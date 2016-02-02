package igoshta;

abstract class AbstractFruit implements IFruit {
    protected String name;
    protected String color;


    public void ripe() {
        System.out.println("Ripening "+name);
    }

    public void printFruitColor() {
        System.out.println("Color of "+name+" is "+color);
    }
}
