import java.util.*;
class KthLargestElement
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a[]=new int[10];
     int i,k,j,count=1,temp,flag=0;
     System.out.println("Enter 10 elements");
     for(i=0;i<10;i++)
      {
          a[i]=sc.nextInt();
      }
     System.out.println("Enter value of k");
     k=sc.nextInt();
     for(i=0;i<10;i++)
      {
          for(j=i;j<10;j++)
           {
               if(a[i]<a[j])
                {
                     temp=a[i];
                      a[i]=a[j];
                     a[j]=temp;
                }
            }
        }
    for(i=0;i<a.length-1;i++)
        {
          if(count==k)
              {
                     System.out.println(a[i]);
                     flag=1;
                     break;
                }
          else if(a[i]!=a[i+1])
               {
                  count++;
                }
           }    
     if(flag==0)
             System.out.println("There is not elements");

      
   }
}