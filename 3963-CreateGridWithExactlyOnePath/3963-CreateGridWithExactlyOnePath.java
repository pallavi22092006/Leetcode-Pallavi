// Last updated: 9/16/2026, 9:34:39 AM
class Solution {
    public String[] createGrid(int m, int n) {
       // List<String> l=new ArrayList<>();
        String[] l=new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0||j==n-1){
                    sb.append('.');
                }else{
                    sb.append('#');
                }
            }
            l[i]=sb.toString();
        }
        return l;
    }
}