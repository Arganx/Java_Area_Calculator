/**
 * Created by qwerty on 02-Mar-17.
 */
public class Square extends Figure implements Print {
    public double a,b;
    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a+2*b;
    }

    @Override
    public void print()
    {
        System.out.println(String.format("%s %2f %2f","Kwadrat o bokach: ",a,b));
    }

    public Square(double a,double b) throws ArithmeticException
    {
        if(a<=0||b<=0)
        {
            throw new ArithmeticException("Wymiary kwadratu nie dodatnie");
        }
        this.a=a;
        this.b=b;
    }
}
