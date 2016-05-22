package problem1;

public class SizeType {


    public static void main(String[] args) {
        byte numByte=1;
        short numShort=1;
        int numInt=1;
        long numLong=1;
        System.out.println((1<<31)<<1);
        System.out.println((1<<30)<<2);
        System.out.println(1<<32);

        long l=7;
        System.out.println((l<<63)<<1);
        System.out.println(l<<64);

        int size=0;
        while(numByte!=0){
            numByte= (byte) (numByte<<1);
            size++;
        }
        System.out.println("byte :  "+size);

        size=0;
        while(numShort!=0){
            numShort= (short) (numShort<<1);
            size++;
        }
        System.out.println("short :  "+size);


        size=0;
        while(numInt!=0){
            numInt= (int) (numInt<<1);
            size++;
        }
        System.out.println("int :  "+size);

        size=0;
        while(numLong!=0){
            numLong= (long) (numLong<<1);
            size++;
        }
        System.out.println("long :  "+size);






    }
}
