class Bike {
    
    int speed = 60;

    void run(){
        System.out.println("A normal bike");
    }
}
class SportBike extends Bike{

    int speed = 120;

    void run(){
        System.out.println("A fast bike");
    }
    public static void main(String[] args) {
        Bike myBike = new SportBike();
        myBike.run();

        System.out.println(myBike.speed);
    }
}