import java.util.Scanner;

public class uniqueDigitsOfLargeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a large number");
		String number=sc.next();
		sc.close();
		String data="",lrg="",largest="";
		int ln;
		for(int i=0;i<10;i++)
		{
			String x=Integer.toString(i);
			if(number.contains(x))
			{
				data=data+"  "+x;
				lrg=lrg.concat(x);
			}
		}
		ln=lrg.length();
		for(int i=ln-1;i>=0;i--)
		{
			largest+=lrg.charAt(i);
		}
		int a=Integer.parseInt(largest);
		System.out.println("the unique digits present in the number are:"+data);
		System.out.println("The largest number possible out of these unique digits:"+a);

	}

}
