import java.util.Scanner;

public class MinorProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String a=sc.next();
		
		int n=a.length();
		char c;
		for(int i=0;i<n;i++)
		{
			c=a.charAt(i);
			String new_data="";
			for(int k=0;k<=i;k++)
			{
				new_data+=a.charAt(k);
			}
			for(int j=i+1;j<n;j++) 
			{
				if(c==a.charAt(j) && a.charAt(j)!='*')
				{
					new_data+='*';
				}
				else
				{
					new_data+=a.charAt(j);
				}
			}
			a=new_data;
			System.out.println((i+1)+"iteration\""+a+"\"");
		}
		a=a.replace("*", "");
		String lrg="";
		int l=a.length();
		for(int j=0;j<l;j++)
		{
			int max=0;
			for(int i=0;i<l;i++)
			{
				if(a.charAt(i)!='#')
				{
					if(max<Integer.parseInt(""+a.charAt(i)))
					{
						max=Integer.parseInt(""+a.charAt(i));
					}
				}
			}
		lrg+=max;
		a=a.replace(""+max, "#");
		System.out.println((j+1)+"iteration lrg:"+lrg+"    str:"+a);
		}

	}

}
