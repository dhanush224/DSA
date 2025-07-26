class Solution {
    public int myAtoi(String s) {

        int negFlag=-1;
        int numFlag = 0;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)==45 && negFlag==-1) {
                negFlag=0;
                continue;
            }else if((int)s.charAt(i)==43 && negFlag==-1){
                negFlag=1;
                continue;
            }
            if(48<=(int)s.charAt(i) && (int)s.charAt(i)<=57){
                numFlag=1;
                res.append(s.charAt(i));
            }else if((int)s.charAt(i)==32 && negFlag==-1)continue;
            else break;
            for(int j=i+1;j<s.length();j++){
                // System.out.println(res+", Ascii: "+(int)s.charAt(j));
                if((int)s.charAt(j)<48 || (int)s.charAt(j)>57){
                    break;
                }else if(48<=(int)s.charAt(j) && (int)s.charAt(j)<=57){
                    res.append(s.charAt(j));
                    

                } 

            }
            break;
        }

        String res1 = res.toString();
        System.out.println(res1);
        if(res1.equals("")) return 0;

        int ans = 0;
        try {
            ans = Integer.parseInt(res1);
        } catch (NumberFormatException e) {
            if(negFlag==0) ans = Integer.MAX_VALUE+1;
            else ans = Integer.MAX_VALUE;
        }        
        

        if(negFlag==0) return -1*ans;
        else return ans;
        
    }
}