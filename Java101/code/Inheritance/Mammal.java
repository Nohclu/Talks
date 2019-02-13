public class Mammal {

    String name;
    int eyes = 2;
    int legs = 4;
    boolean hasBackBone = true;
    boolean hasLungs = true;
    double velocity =0.0;

    public Mammal(String name) {
        super();
        this.name = name;
    }
    public void changeSpeed(double currVel){
        this.velocity = currVel;
    }
}