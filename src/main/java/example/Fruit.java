package example;

public class Fruit implements IFruit {

    protected String name;
    protected String color;

    public void ripe() {

        System.out.println("Ripening " + name);

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
