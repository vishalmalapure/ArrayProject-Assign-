import java.util.*;
class DeleteElement
{
public static void main(String as[])
{
int arr[]={10,20,30,40,10,10};
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element you want to delete :");
int d=sc.nextInt();
for(int i=0;i<arr.length-count;i++)
{
	if(arr[i]==d)
	{
		count++;
		for(int j=i;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		i--;// if in case duplicate found
	}
}

for(int i=0;i<arr.length-count;i++)
{
	System.out.println(" "+arr[i]);
}
	System.out.println(" It is the best element of the college day and is most repeated aomgt the water ");
}
}