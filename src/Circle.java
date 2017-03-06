/**
 * Created by qwerty on 02-Mar-17.
 */
public class Circle extends Figure implements Print {

    public double r;

    @Override
    public void print() {
        System.out.println(String.format("Kolo o promieniu: %2f",r));
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    public Circle(double a) throws ArithmeticException
    {
        if(a<=0)
        {
            throw new ArithmeticException("Bledny promien kola");
        }
        r=a;
    }
}
