public class MethOverload {
    int myInt = 1;
    String myString = "Some string";

    public MethOverload(int intParam) {
        this.myInt = intParam;
    }
    
    public MethOverload(String stringParam) {
        this.myString = stringParam;
    }
    
    public MethOverload(int intParam, String stringParam) {
        this.myInt = intParam;
        this.myString = stringParam;
    }

    public static void main(String[] args) {
        MethOverload justInt = new MethOverload("Test");
    }
}