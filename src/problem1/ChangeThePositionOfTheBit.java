package problem1;

public class ChangeThePositionOfTheBit {

    static int changeBit(Integer num, int numBit){

        return num^(num<<(numBit-1));
    }

    public static void main(String[] args) {
        int num=28;
        System.out.println(num);
        num=changeBit(num,4);
        System.out.println(num);


    }
}
