import java.util.Scanner;

public class Pallindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num, rev=0, temp;
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		temp = num;
		while(num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(temp==rev)
		{
			System.out.println("It is a pallindrome no.");
		}
		else
		{
			System.out.println("Not a pallindrome no.");
		}
	}
}
		
