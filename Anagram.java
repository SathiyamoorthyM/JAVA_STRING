//  check given string  anagram or not for given array.

public class Anagram
{

   String ascSorting ( String x)
    {
    char a[]=new char[x.length()];
    String u="";

   for(int i=0; i<a.length;i=i+1)                    // Converted string into character array
       {
          a[i]=x.charAt(i);
        }

    for(int i=0; i<a.length; i=i+1)                 // Sorting the character array ascending order
        {
            for(int j=i+1; j<a.length; j=j+1)
                { 
                    if(a[i]>a[j])
                        {
                            char temp=a[j];
                            a[j]=a[i];
                            a[i]= temp;
                        }
                  }
                u=u+a[i];                                  // Converted character array into string
        }
     System.out.print(u);
    System.out.println();
   return u;
    }    

 
public static void main(String args[])
    {
        Anagram  anagram=new Anagram();
                         String a = anagram.ascSorting("DESSERTS");
                         String b= anagram.ascSorting("STRESSED");

    if(a.equals(b))                                                                             //  compare two  strings by using  predefined methods 
        {   
            System.out.println("Anagram");
        }
    else
        {
            System.out.println("Not a Anagram");
        }
 
              
    }
        
}

/*
output:

DEERSSST
DEERSSST
Anagram

*/
