public class NoFly implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("this animal can not fly");
    }
}
