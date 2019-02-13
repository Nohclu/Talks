public class Tiger extends Mammal {

    boolean hasFangs = true;
    boolean hasClaws = true;

    public Tiger( String name) {
        super(name);
    }

    public static void main(String[] args) {
        Tiger myTiger = new Tiger("Tony");
        myTiger.changeSpeed(10);
    }
}