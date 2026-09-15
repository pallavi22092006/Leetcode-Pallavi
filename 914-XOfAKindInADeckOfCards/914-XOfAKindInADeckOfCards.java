// Last updated: 9/15/2026, 4:20:29 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : deck)
            map.put(x, map.getOrDefault(x,0)+1);

        int g = 0;
        for(int c : map.values())
            g = gcd(g,c);

        return g > 1;
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}