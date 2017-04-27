package bitarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenhongliu on 12/1/16.
 *
 * Given an array of integers, every element appears thrice except for one which occurs once.

 Find that element which does not appear thrice.

 Note: Your algorithm should have a linear runtime complexity.

 Could you implement it without using extra memory?

 Example :

 Input : [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
 Output : 4
 */
public class SingleNumber2 {

    public int singleNumber(final List<Integer> a) {

        int[] bit = new int[32];

        for(int num: a ){
            for(int i= 0; i<32; i++) {
                bit[i] += ((num>>i) & 1); //trick: num shifted i each loop
            }
        }

        // !!! trick: convert bit to integer:
        int sum = 0;
        for(int i = 31; i>=0; i--) //revert
        {
            bit[i] %= 3;     // change 3 to 0
            sum = 2*sum + bit[i]; //move bit
        }
        return sum;
    }

    public static void main(String[] args){

        List<Integer> res = new ArrayList<>();

        res = Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1);

        System.out.printf("%d\n", new SingleNumber2().singleNumber(res));
    }
}
