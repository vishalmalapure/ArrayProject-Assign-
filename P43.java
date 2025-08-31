import java.util.*;
class P43
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("     ------------------------------------------");
System.out.println("Enter choice 1 to find the prime number :");
System.out.println("Enter the choice 2 to find the Duck number :");
System.out.println("Enter the choice 3 to find the perfect number :");
System.out.println("Enter the choice 4 to find the strong number :");
System.out.println("Enter the choice 5 to find the Armstrong number:");

int ch=sc.nextInt();

switch(ch)
	{
		case 1:
			System.out.println("Enter the number ");
			int num=sc.nextInt();
			int temp=1;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
					temp++;
					
			}
				if(temp!=1)
				{
				System.out.println("Given number is not prime number :");
				}
				else
				{
				System.out.println("The given number is  the prime number :");
				}
			break;
		case 2:
			System.out.println("Enter the number ");
			int num2=sc.nextInt();
			int rem;
			int flag=1;
			for(int j=1;j<=num2;j++)
			{
				rem=num2%10;
				num2=num2/10;
				if(rem==0)
					{
					flag++;
					break;
					}
			}
				if(flag!=1)
					{
					System.out.println("The given number is the duck number :");
					}
					else
					{
					System.out.println("The given number is not the duck number :");
					}
			break;
		case 3:
			System.out.println("Enter the number:");
			int num3=sc.nextInt();
			int sum=0;
			for(int k=1;k<num3;k++)
			{
				
				if(num3%k==0)
				{
					sum=sum+k;
					System.out.println(k);
				}
			}
				if(num3==sum)
				{
				System.out.println("The number is the perfect number :");
				}
				else
				{
				System.out.println("The number is not the perfect number :");
				}
			break;
		case 4:
			System.out.println("Enter the number:");			
			int num4=sc.nextInt();
			int remm;
			temp=num4;
			int summ=0;
			while(num4>0)
			{
			remm=num4%10;
			num4=num4/10;
			int fact=1;
				for(int l=remm;l>0;l--)
					{	
					fact =fact*l;
					}
				summ=summ+fact;
			}
			if(summ==temp)
			{
				System.out.println("The given number is the Strong number :");
			}
			else
			{
				System.out.println("The given number is not the strong number :");
			}
			break;
		case 5:
			System.out.println("Enter the number:");
			int num5=sc.nextInt();
			int count=0;
			int remmm;
			int tempp=num5;
			int temp2;
			while(num5>0)
			{
			remmm=num5%10;
			count=count+1;
			num5=num5/10;
			}
			num5=tempp;
			int remmmm;
			int sum2=0;
			while(num5>0)
			{
				 
				int img=1;
				 remmmm=num5%10;
				for(int m=1;m<=count;m++)
				{
					
					img=img*remmmm;
				}
				sum2=sum2+img;
                             num5=num5/10;
			}
				if(sum2==tempp)
				{
				System.out.println("The given number is the armstrong number :");
				}
				else
				{
				System.out.println("The given number is not the armstrong number :");
				}
			
			break;
		default:
		     System.out.println("----------Enter the correct choice:---------------");
}
}
}
				
			
			
			
			