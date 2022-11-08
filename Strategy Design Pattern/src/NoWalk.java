public class NoWalk implements WalkStrategy{
    @Override
    public void walk() {
        System.out.println("this animal cannot walk");
    }
}
