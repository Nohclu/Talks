public class Wolf extends Mammal{

    boolean hasFangs = true;
    boolean hasClaws = true;

    public Wolf( String name) {
        super(name);
    }


    public static void main(String[] args) {
        Wolf myWolf = new Wolf("Ghost");
        myWolf.changeSpeed(10);
    }
}