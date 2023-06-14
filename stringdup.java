//  Print duplicate CHARACTER removed string.

public class stringdup
{
    public static void main (String args[])
    {
        String s="SSQQQL";
        char c[]=new char[s.length()];

        for(int i=0; i<c.length; i=i+1)                    // string ----> char Array 
        {
            c[i]=s.charAt(i);
        }

        for(int i=0; i<c.length;i=i+1)
        {
            for(int j=1+i; j<c.length;j=j+1)
                {
                    if(c[i]==c[j] )
                        {
                           c[j]=' ';                                 // string --> space     int---> zero
                        }
                  
                }
        }

        for(char x : c)                                  // advanced for loop
        {
         if(x != ' ')
            {
             System.out.print(x);
            }
        }
        System.out.println();
    }
}

/*
o/p:

SQL

*/
