public class Elephant extends Mammal{

    int tusks = 2;
    boolean hasFangs = false;
    boolean hasClaws = false;

    public Elephant( String name) {
        super(name);
    }

    public static void main(String[] args) {
        Elephant myElephant = new Elephant("Dumbo");
        myElephant.changeSpeed(10);
    }
}