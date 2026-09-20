class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int leftMax=height[i];
        int rightMax=height[j];

        int rain=0;
        while(i<j){
            if(height[i]<height[j]){
                int sum =Math.min(leftMax,rightMax)-height[i];
                if(sum>0) rain+=sum;
                i++;
                if(height[i]>leftMax) leftMax=height[i];
            }else{
                int sum =Math.min(leftMax,rightMax)-height[j];
                if(sum>0) rain+=sum;
                j--;
                if(height[j]>rightMax) rightMax=height[j];
            }
        }

        return rain;

    }

}