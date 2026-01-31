class Solution {
    public int reverse(int x) {
        int sign = 1;
        int reversed = 0;
        int y =x;
        int length=0;
        while(y!=0){
            y/=10;
            length++;
        }
        int revLength = 0;
        if(x<0) sign=-1;
        while(x!=0){
            int div = (int) Math.pow(10,length-1);
            int digit = x/div;
            reversed+=digit*Math.pow(10,revLength);
            x-=digit*div;
            revLength++;
            length--;
        }
        if(reversed==(int) Math.pow(2,31) || reversed==(int) -1*Math.pow(2,31)) return 0;

        return reversed;
    }
}