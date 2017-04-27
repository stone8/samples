package BitPlay;

import java.util.ArrayList;

/**
 * Created by wenhongliu on 11/30/16.

 Write a function that takes an unsigned integer and returns the number of 1 bits it has.

 Example:

 The 32-bit integer 11 has binary representation

 00000000000000000000000000001011
 so the function should return 3.

 Note that since Java does not have unsigned int, use long for Java
 */
public class NumberOf1Bits {

    public int numSetBits_slow(long a) {
        ArrayList<Integer> res = new ArrayList<>();

        while(a>=1){
            res.add((int) a%2);
            a = a/2;
        }
        int count = 0;
        for(int i = 0; i<res.size(); i++){
            if(res.get(i) ==1)
                count++;
        }
        return count;
    }

    public int numSetBits(long a) {

        int count = 0;
        while(a>0){
            if((a&1) !=0 )
                count++;
            a>>=1;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.printf("%d \n", new NumberOf1Bits().numSetBits(4294967295L));

    }
}
