// Last updated: 8/13/2026, 11:34:01 AM
class Solution {
    public int reverseBits(int n) {
       int result=0;
        for (int i=0;i<32;i++){
            result<<=1;          
            result|=(n&1);     
            n>>>=1;              
        }
        return result; 
    }
}