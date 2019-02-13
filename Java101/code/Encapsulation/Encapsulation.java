public class Encapsulation {

    private int myInt;

    public Encapsulation(int intParam) {
        this.myInt = intParam;
    }

    public void setMyInt(int n){
        this.myInt = n;
    }

    public int getMyInt(){
        return this.myInt;
    }
}