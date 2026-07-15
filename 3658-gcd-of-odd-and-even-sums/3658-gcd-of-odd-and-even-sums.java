class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0, sumEven=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0)
                sumEven+=i;
            else
                sumOdd+=i;
        }
        return findGCD(sumOdd,sumEven);
    }
    public static int findGCD(int a, int b){
        if(b==0)
            return a;
        return findGCD(b,a%b);
    }
}