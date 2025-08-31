import java.util.*;
class Insert
{
public static void main(String aa[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
System.out.println("Enter the values in the array");
for(int i=0;i<a.length-1;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Printing the element before inserting :");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the index:");
int index=sc.nextInt();
System.out.println("Enter the value:");
int value=sc.nextInt();

for(int i=a.length-2;i>=index;i--)
{
a[i+1]=a[i];
}
a[index]=value;

System.out.println("Printing the element after inserting");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}

