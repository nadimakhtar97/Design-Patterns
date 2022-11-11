public class Snake extends Animal{
    @Override
    public void talk() {
        System.out.println("hiisss...");
    }

    @Override
    public void eat() {
        System.out.println("snake eat");
    }

    Snake(String name,String color,Integer age){
        this.name = name;
        this.color = color;
        this.age = age;
        this.fly = new NoFly();
        this.walk = new Crawl();
    }
}
