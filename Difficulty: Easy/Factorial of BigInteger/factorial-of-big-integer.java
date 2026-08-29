import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        BigInteger ans=BigInteger.ONE;
        for(int i=2;i<=n;i++){
         ans=ans.multiply(BigInteger.valueOf(i));
    }
        return ans;
    }
}
