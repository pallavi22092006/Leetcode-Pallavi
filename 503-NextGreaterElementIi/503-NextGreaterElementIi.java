// Last updated: 8/13/2026, 11:29:17 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] num=new int[n];
        Arrays.fill(num,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*n;i++){
            int nu=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<nu)
            num[st.pop()]=nu;
            if(i<n)
            st.push(i);
        }
        return num;
    }
}
/*
            while (!st.isEmpty() && nums[st.peek()] < num)
                ans[st.pop()] = num;
            if (i < n)
                st.push(i);
        }
        return ans;
    }
}*/