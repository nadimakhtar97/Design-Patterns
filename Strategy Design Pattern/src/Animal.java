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
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", fly=" + fly +
                ", walk=" + walk +
                '}';
    }
}
