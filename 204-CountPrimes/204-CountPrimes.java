// Last updated: 8/13/2026, 11:33:18 AM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count=0;
        boolean[] notPrime = new boolean[n];
        for(int i=2;i<n;i++){
            if(!notPrime[i]){
                count++;

                if((long)i*i<n){
                    for(int j=i*i;j<n;j+=i){
                        notPrime[j]=true;
                    }
                }
            }
        }
        return count;
    }
}