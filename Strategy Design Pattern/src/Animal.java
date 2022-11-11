public class Animal {
    public String name;
    public String color;
    public Integer age;

    FlyStrategy fly; //fly strategy
    WalkStrategy walk; // walk strategy

    public void talk(){
        System.out.println("Talk");
    }
    public void eat(){
        System.out.println("Eat");
    }

    @Override
    public String toString() {
        System.out.print("Eat: ");
        this.eat();
        System.out.print("Talk: ");
        this.talk();
        System.out.print("Walk: ");
        this.walk.walk();
        System.out.print("Fly: ");
        this.fly.fly();
        return this.name + " " + this.color + " " + this.age + "\n" ;
    }
}
