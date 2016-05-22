package problem1;

public class Karatsuba {
    public static int length(long num){
        int i=0;
        while(num!=0){
            num=num>>1;
            i++;
        }
        return i;
    }
    public static long karatsube(long num1,long num2){
        int len1=length(num1);
        int len2=length(num2);
        int maxLen=Math.max(len1,len2);

        if(maxLen<2) return num1*num2;

        int offset=maxLen>>1;
        long a=num1>>offset;
        long b=num1-(a<<offset);
        long c=num2>>offset;
        long d=num2-(c<<offset);


        
        long ac=karatsube(a,c);

        long bd=karatsube(b,d);

        long abcd=karatsube(a+b,c+d);


        //ac+bc+ad+bd==ac+((a+b)(c+d)-ac-bd))+bd
        return (ac<<(offset*2))+((abcd-ac-bd)<<offset)+bd;









    }
    public static void main(String[] args) {

        System.out.println(karatsube(25,31));

    }


}
