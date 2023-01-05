
public class Fraction
{
	int N, D;
	
	public Fraction add(Fraction f)
	{ Fraction result  = new Fraction();
	result.N = N*f.D+f.N*D; 
	result.D = D*f.D;		
		return result;
	}
	
	public Fraction sub(Fraction f)
	{
		Fraction result = new Fraction();
		result.N = N*f.D+f.N*D;
		result.D = D*f.D;
		return result;
	}
	
	public Fraction mul(Fraction f)
	{
		
	}
}
