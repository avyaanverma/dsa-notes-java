public class ThreeByte {
    // wrong keyword const 
    // no data type
    // it should be -1 here 2^24 -1 
    final int lowerBnd = (int)Math.pow(2,23)-1,upperBnd=(int)-Math.pow(2,23);
    private int value;

    public ThreeByte(int value){
        if(value < lowerBnd && value > upperBnd){
            this.value=value;
        }
        else{
            System.out.print("ERROR:");
            System.out.println("Your no is not in range");
        }
    }

    public int getValue(){
        return value;
    }
    public void readValue(){
        System.out.println("value of 3 byte "+ value);
    }
    }

