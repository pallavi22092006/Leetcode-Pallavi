// Last updated: 10/6/2026, 10:16:22 AM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        java.util.HashSet<Integer> set=new java.util.HashSet<>();
4        for(int candy:candyType){
5            set.add(candy);
6        }
7        return Math.min(set.size(),candyType.length/2);
8    }
9}