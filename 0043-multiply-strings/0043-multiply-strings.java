class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int size1 = num1.length();
        int[] n1 = new int[size1];
        for(int i=0;i<size1;i++){
            int n = num1.charAt(size1-1-i) - '0';
            n1[i]=n;
        }

        int size2 = num2.length();
        int[] n2 = new int[size2];
        for(int i=0;i<size2;i++){
            int n = num2.charAt(size2-1-i) - '0';
            n2[i]=n;
        }

        //CHECK BOTH INT ARRAYS

        int[] product = new int[n1.length+n2.length];
        int k=0;
        //MULTIPLY
        for(int i=0;i<n1.length;i++){
            int carry=0;
            for(int j=0;j<n2.length;j++){
                int temp = carry+n1[i]*n2[j]+product[j+i];

                product[j+i]= temp%10;
                carry=temp/10;      
                if(j==n2.length-1) product[i+j+1]=carry;          
            }
        }

        int size=product.length;
        char[] cFinal = new char[size];
        for(int i=0;i<size;i++){
            product[i]+=48;
            cFinal[size-i-1]=(char)product[i];
        }

        String s = String.valueOf(cFinal);

        if(s.charAt(0)=='0') return s.substring(1);
        
        return s;
        
    }
}