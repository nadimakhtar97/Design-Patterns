public class Cat extends Animal{
    @Override
    public void talk() {
        System.out.println("Meow!!");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    Cat(String name,String color,Integer age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.fly = new NoFly();
        this.walk = new FastWalk();
    }
}
