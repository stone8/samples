package BitPlay;

/**
 * Created by wenhongliu on 11/30/16.
 * Divide two integers without using multiplication, division and mod operator.

 Return the floor of the result of the division.

 Example:

 5 / 2 = 2
 Also, consider if there can be overflow cases. For overflow case, return INT_MAX.

 http://qa.geeksforgeeks.org/3794/divide-integers-without-multiplication-division-operator
 */
public class DevideInteger {

    public int divide(int dividend, int divisor) {

        long n = dividend, m = divisor;
        // determine sign of the quotient
        int sign = n < 0 ^ m < 0 ? -1 : 1;
        // remove sign of operands
        n = Math.abs(n);
        m = Math.abs(m);
        // q stores the quotient in computation
        long q = 0L;

        // test down from the highest bit
        // accumulate the tentative value for valid bits
        for (long t = 0, i = 31; i >= 0; i--) {
            if (t + (m << i) <= n) {
                t += m << i;
                q |= 1L << i;
            }
        }

        // assign back the sign
        if (sign < 0) q = -q;

        // check for overflow and return
        if(q >= (long) Integer.MAX_VALUE || q < (long) Integer.MIN_VALUE)
            return  Integer.MAX_VALUE;
        else
            return (int) q;
    }

    public static void main(String[] args){
        System.out.printf("%d\n", new DevideInteger().divide(5, 2));
    }
}
