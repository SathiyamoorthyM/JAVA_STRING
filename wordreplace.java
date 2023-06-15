// Print the particular word replace by given word  of string.  forigen ---> Developed

public class wordreplace
{
    public static void main (String args[])
    {
        String s="India is my country and America is a foreign country";
        String a[]=s.split(" ");
        
      for(int i=0; i<a.length ; i=i+1)
        {
            if( a[i].equals("foreign"))   //      a[i].equals("foreign","Developed")
                {
                    System.out.print(" Developed");
                }
            else
            {
            System.out.print(" "+a[i]);
            }
       }

            System.out.println();
      }
}

/*
o/p:

 India is my country and America is a Developed country


*/

/*

in forloop 
a="foreign";
b="Developed";
if(a[i].equals(a))
 a[i]="b";
then print string array a[].


*/
