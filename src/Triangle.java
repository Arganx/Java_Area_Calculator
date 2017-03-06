import java.util.Locale;

/**
 * Created by qwerty on 02-Mar-17.
 */
public class Triangle extends Figure implements Print {
    public double a,b,c;
    @Override
    public double calculateArea() {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        System.out.println(String.format(Locale.US,"%s %2f %2f %2f","Trojkat, ktorego boki wynosza:",a,b,c));
    }

    public Triangle(double a,double b, double c) throws ArithmeticException
    {
        if(a+b<=c || a+c<=b || b+c<=a || a<=0 || b<=0 || c<=0)
        {
            throw new ArithmeticException("Niespelnione warunki trojkata");
        }
        this.a=a;
        this.b=b;
        this.c=c;
    }
}
