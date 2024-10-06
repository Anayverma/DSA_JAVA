import java.io.*;
class Solution
{   public int romanToInt(String s)
    {
        int n[]=new int[s.length()+1];int sum=0;
       for(int i=s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'M':
                n[i]=1000;
                break;
                case 'D':
                n[i]=500;
                break;
                case 'C':
                n[i]=100;
                break;
                case 'L':
                n[i]=50;
                break;
                case 'X':
                n[i]=10;
                break;
                case 'V':
                n[i]=5;
                break;
                case 'I':
                n[i]=1;
                break;
            }
            if(n[i]<n[i+1])
            n[i]*=-1;
            sum+=n[i];
        }

        return sum;
   }
}