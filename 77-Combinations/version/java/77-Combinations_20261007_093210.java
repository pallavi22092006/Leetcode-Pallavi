// Last updated: 10/7/2026, 9:32:10 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> result=new ArrayList<>();
4        backtrack(1,n,k,new ArrayList<>(),result);
5        return result;
6    }
7    void backtrack(int start,int n,int k,List<Integer> list,List<List<Integer>> result){
8        if(list.size()==k){
9            result.add(new ArrayList<>(list));
10            return;
11        }
12        for(int i=start;i<=n;i++){
13            list.add(i);
14            backtrack(i+1,n,k,list,result);
15            list.remove(list.size()-1);
16        }
17    }
18}