//  Check Palindrom the given string.

public class palindrom
{
    public static void main (String args[])
    {
        String s="malayalam";
        char c[]=new char[s.length()];
        String d="";


        for(int i=0 ; i<c.length ; i=i+1)               // converted stinrg--->char array and char array ---> string
            {
                c[i]=s.charAt((c.length-1)-i);
                d=d+c[i];

            }
/*                                                                                // here i replace the second for loop . if u need remove the comment
        for(int i=0; i<c.length; i=i+1)
            {
                d=d+c[i];
            }                                                           */
        System.out.println(d);
    
        if(s.equals(d))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not a palindrom");
        }
}
}

/*
output:

malayalam
Palindrom

*/
