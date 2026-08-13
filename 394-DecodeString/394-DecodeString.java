// Last updated: 8/13/2026, 11:30:32 AM
class Solution {
    public String decodeString(String str) {
        Stack<Integer> s1=new Stack<>();
        Stack<String> s2=new Stack<>();
        int num=0;
        String s="";
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(Character.isLetter(c)){
                s+=c;
            }
            else if(c=='['){
                s1.push(num);
                s2.push(s);
                num=0;
                s="";
            }
            else{
                StringBuilder temp=new StringBuilder();
                int t=s1.pop();
                for(int i=0;i<t;i++)
                 temp.append(s);
                s=s2.pop()+ temp.toString();
            }
        }
        return s;
    }
}