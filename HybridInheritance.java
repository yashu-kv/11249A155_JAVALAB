class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
interface Pet {
    void play();
}
class Dog extends Animal implements Pet {

    void bark() {
        System.out.println("Dog barks");
    }
    public void play() {
        System.out.println("Dog plays");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
        d.play();
    }
}