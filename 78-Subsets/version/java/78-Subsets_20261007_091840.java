// Last updated: 10/7/2026, 9:18:40 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result=new ArrayList<>();
4        backtrack(nums,0,new ArrayList<>(),result);
5        return result;
6    }
7    void backtrack(int[] nums,int index,List<Integer> list,List<List<Integer>> result){
8        result.add(new ArrayList<>(list));
9
10        for(int i=index;i<nums.length;i++){
11            list.add(nums[i]);
12            backtrack(nums,i+1,list,result);
13            list.remove(list.size()-1);
14        }
15    }
16}