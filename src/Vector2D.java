import java.util.Scanner;
import java.util.Vector;

public class Vector2D
{
	 double X;
	 double Y;
    public Vector2D()
    {
    }
    public Vector2D add(Vector2D V)
    {
        Vector2D result = new Vector2D();
        result.X = X+V.X;
        result.Y = Y+V.Y;
        return result;
    }
    
    public Vector2D minus(Vector2D V)
    {
    	Vector2D result = new Vector2D();
    	result.X = X-V.X;
    	result.Y = Y-V.Y;
    	return result;
    }
    
    public double dot(Vector2D v)
    {
    	double result = v.X*X+v.Y*Y;
    	return result;
    }
    
    public double size()
    {
    	double result = Math.sqrt(X*X+Y*Y);
    	return result;
    }
    
    public Vector2D unit()
    {
    	Vector2D result  = new Vector2D();
    	 double s = size();
    	result.X = X/s;
    	result.Y = Y/s;
    	return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector2D a = new Vector2D();
        a.X = sc.nextDouble();
        a.Y = sc.nextDouble();

        Vector2D b = new Vector2D();
        b.X = sc.nextDouble();
        b.Y = sc.nextDouble();

//        Vector2D c;
//        c = a.unit();
//        System.out.println(c.X+"\n"+c.Y);
    }
}
