package igoshta;

class Apple extends AbstractFruit {

    public Apple(){
        name = "Apple";
        color = "Green";
    }

    @Override
    public void ripe() {
        System.out.println(name+" is ripe.");
    }

}
