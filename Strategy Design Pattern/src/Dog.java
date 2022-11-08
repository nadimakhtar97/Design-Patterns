public class Dog extends  Animal{

    @Override
    public void talk() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    Dog(String name,String color,Integer age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.fly = new NoFly();
        this.walk = new SimpleWalk();
    }
}
