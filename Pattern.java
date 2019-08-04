


import java.util.Scanner;

public class Program{

   
    public static void main(String[] args) {

       Scanner scan= new Scanner(System.in);
       int N=scan.nextInt();
       
       StringBuffer myArray[] = new StringBuffer[N];
for(int index = 0; index < myArray.length; index++)
{
    myArray[index] = new StringBuffer("");
}
       
       for(int i=0;i<N;i++)
       {
             for(int j=0;j<i;j++)
       {
          myArray[i].append("**");
       }
       }
       int p=1;
       
    
          for(int k=1;k<=N;k++)
         {
             for(int l=1;l<=N-k+1;l++)
             {
         myArray[k-1].append((p*10));
         p++;
             }
              
         }
          
          
             for(int k=N;k>=1;k--)
         {
             for(int l=1;l<=N-k+1;l++)
             {
              if(l==N-k+1)
              {
                    myArray[k-1].append((p));
                      p++;
              }
              else{
         myArray[k-1].append((p*10));
         p++;
              }
              
             }
               myArray[k-1].append("\n");
         }
           
       
       for(int index = 0; index < myArray.length; index++)
             System.out.print(myArray[index]);
   
    }
    

}
