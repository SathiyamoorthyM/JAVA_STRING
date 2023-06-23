// find the total counts the vowels in given String.

public class exstring
{
    public static void main (String args[])
    {
        String s= "malala got nobel prize for peace";
        int count=0;
        for(int i=1; i<s.length(); i=i+1)
            {
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
                    {
                        count =count+1;
                    }
            }
        System.out.println(count);  
   }
}
 
/*
o/p:

12

*/
