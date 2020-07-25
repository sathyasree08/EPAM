package cleancode;
public class calculate_Interest {
	public double simpleIntrest(double amount,double time,double rate)
	{
		double total=(double)((amount*time*rate)/100);
		return (int)total+amount;
	}
	public double compoundIntrest(double amount,double time,double rate)
	{
		double total=(double)(amount*(Math.pow((1+(rate/100)), time)));
		total=total-amount;
		return (int)total;
	}
}
