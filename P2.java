import java.util.Scanner;

class P2
{
		public  static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			double a,b,c,d,e,f;
			System.out.println("Enter value a:");
			a=sc.nextDouble();
			
			System.out.println("Enter value b:");
			b=sc.nextDouble();

			System.out.println("Enter value c:");
			c=sc.nextDouble();

			System.out.println("Enter value d:");
			d=sc.nextDouble();

			System.out.println("Enter value e:");
			e=sc.nextDouble();

			System.out.println("Enter value f:");
			f=sc.nextDouble();

			//D=ad−bc
			double D=(a*d)-(b*c);
			//Dx=ed−bf
			double Dx= (e*d)-(b*f);
			double Dy=(a*f)-(c*e);
			
			if(D==0)
			{
				System.out.println("Denominator is zero.");
			}
			else
			{
				// x=Dx/D, y=Dy/D*
				double x=Dx/D;
				double y=Dy/D;
				System.out.println(x);
				System.out.println(y);
			}
			
		
			
		}
}