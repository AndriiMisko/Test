package osvyd;

public abstract class FruitAbstract {

    protected String name;
    protected String color;
    protected String action;

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAction(String action) {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void ripe(){
        System.out.println(name + action);
    }

    public void printFruitColor(){
        System.out.print(name + color);
    }


}
