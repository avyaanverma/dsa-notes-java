public class Main {
    public static void main(String args[]){
        ThreeByte three = new ThreeByte(10000); 

        System.out.println("valid value is " + three.getValue());

        int max = (int)Math.pow(2,23)-1; // it should be -1 here 
        int min = (int)-Math.pow(2,23);

        System.out.println("Maximum value " + max);
        System.out.println("Minimum value " + min);

        ThreeByte invalid = new ThreeByte(8389620);

    }
}
