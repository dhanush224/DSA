class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i=0;
        int j=height.length-1;
        int maxArea = 0;

        while(i<j){
            int min = Math.min(height[i],height[j]);
            area = min*(j-i);
            maxArea = (area>maxArea)? area:maxArea;
            if(height[i]<height[j]) i++;
            else j--;
        }

        return maxArea;        
    }
}