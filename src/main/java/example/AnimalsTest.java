package example;

// all classes and interfaces should be in separate files
// this is for learning purpose only

// all animals speak, let's make that a contract
interface IAnimal{
    void speak();
}

// this is a base class for all animals
// try to remove speak() method from any class and see what happens
class Animal implements IAnimal{
    protected String name;

    public Animal(){
        name = "animal";
    }

    @Override
    public void speak(){
        System.out.println("I am an animal");
    }

    public String getName(){
        return name;
    }
}

class Cat extends Animal{

    public Cat(){
       name = "cat";
    }

    // this method overrides same method in class Animal
    @Override
    public void speak(){
        System.out.println("I am a cat");
    }

    // this is an overloading example
    // this method overloads speak() method
    public void speak(String text){
        System.out.println("Cat is saying: " + text);
    }
}

class Dog extends Animal{

    public Dog(){
        name = "dog";
    }

    // this method overrides same method in class Animal
    @Override
    public void speak(){
        System.out.println("I am a dog");
    }

}

public class AnimalsTest{

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.speak();
        cat.speak();

        // overloaded method call
        cat.speak("meow");

        dog.speak();

        System.out.println();

        dressAnimal(animal);
        dressAnimal(cat);
        dressAnimal(dog);
    }

    // dynamic polymorphism example
    public static void dressAnimal(Animal someAnimal){
        someAnimal.speak();

        System.out.println("Dressing " + someAnimal.getName());
        System.out.println();
    }
}