// When does the principal reach the desired amount in your bank account with yearly interest and tax rates?
public class Money
{
  public static int calculateYears(double p, double i,  double tax, double d) {
    int years = 0;
    double taxVal = 0;
    double yrInterest = 0;
    while (!(p >= d)) // while the princ isn't desired amount
    {
    years++; // interator
    yrInterest = (p * i); // calc interest for year.
    taxVal = tax * yrInterest; // calc tax amount to be - from p
    p += yrInterest - taxVal;
    }
    return years;
  }
}
