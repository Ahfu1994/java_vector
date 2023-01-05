import java.util.Scanner;

public class Vector3D
{
	double X, Y, Z;
	public Vector3D add(Vector3D V)
	{
		Vector3D result = new Vector3D();
		result.X= X+V.X;
		result.Y= Y+V.Y;
		result.Z= Z+V.Z;
		return result;
	}
	
	public Vector3D minus(Vector3D V)
	{
		Vector3D result = new Vector3D();
		result.X= X-V.X;
		result.Y= Y-V.Y;
		result.Z= Z-V.Z;
		return result;
	}
	
	public double dot(Vector3D V)
	{
		double result = X*V.X+Y*V.Y+Z*V.Z;
		return result;
	}
	
	public double size()
	{
		double result = Math.sqrt(X*X+Y*Y+Z*Z);
		return result;
	}
	
	public Vector3D unit()
	{
		double s = size();
		Vector3D result = new Vector3D();
		result.X = X/s; 
		result.Y = Y/s;
		result.Z = Z/s;
		return result;
	}

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		Vector3D a = new Vector3D();
//		a.X = sc.nextDouble();
//		a.Y = sc.nextDouble();
//		a.Z = sc.nextDouble();
		
//		Vector3D b = new Vector3D();
//		b.X = sc.nextDouble();
//		b.Y = sc.nextDouble();
//		b.Z = sc.nextDouble();
		
//		Vector3D c;
//		c = a.add(b);
//		System.out.println(c.X+"\n"+c.Y+"\n"+c.Z);
		
//		Vector3D d;
//		d = a.minus(b);
//		System.out.println(d.X+"\n"+d.Y+"\n"+d.Z);
		
//		double e;
//		e = a.dot(b);
//		System.out.println(e);
		
//		double f;
//		f = a.size();
//		System.out.println(f);
		
//		Vector3D g;
//		g = a.unit();
//		System.out.println(g.X+"\n"+g.Y+"\n"+g.Z);
		
	}

}
