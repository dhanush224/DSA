class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int leftMax=height[i];
        int rightMax=height[j];

        int rain=0;
        while(i<j){
            if(height[i]<height[j]){
                i++;
                if(height[i]>leftMax) leftMax=height[i];
                rain+=leftMax-height[i];
            }else{
                j--;
                if(height[j]>rightMax) rightMax=height[j];
                rain+=rightMax-height[j];
            }
        }

        return rain;

    }

}