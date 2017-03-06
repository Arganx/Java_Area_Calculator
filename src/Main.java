import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        boolean still =true;
        double a,b,c;
        Scanner scanner;
        while(still) {
            System.out.println("Kalkulator pol i obwodow figur\n1) Kwadrat\n2) Trojkat\n3) Kolo\nAby zakonczyc nacisnij dowolny klawisz");
           scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj wymiary kwadratu");
                    scanner = new Scanner(System.in);
                    a = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    b = scanner.nextDouble();
                    try {
                        Square kwadrat = new Square(a, b);
                        boolean cos = true;
                        while(cos) {
                            System.out.println("Utworzono kwadrat co chcesz zrobic?\n1) Podaj pole\n2) Podaj obwod\n3) Wyswietl dane o figurze\nInaczej zakoncz");
                            scanner = new Scanner(System.in);
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println(kwadrat.calculateArea());;
                                    break;
                                case 2:
                                    System.out.println(kwadrat.calculatePerimeter());;
                                    break;
                                case 3:
                                    kwadrat.print();
                                default:
                                    cos=false;
                                    break;
                            }
                        }
                    }catch (ArithmeticException exep)
                    {
                        System.out.println("Wymiary kwadratu musza byc dodatnie");
                        //System.exit(1);
                    }
                    break;
                case 2:
                    System.out.println("Podaj wymiary trojkata");
                    scanner = new Scanner(System.in);
                    a = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    b = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    c = scanner.nextDouble();

                    try {
                        Triangle trojkat = new Triangle(a,b,c);
                        boolean cos = true;
                        while(cos) {
                            System.out.println("Utworzono trojkat co chcesz zrobic?\n1) Podaj pole\n2) Podaj obwod\n3) Wyswietl dane o figurze\nInaczej zakoncz");
                            scanner = new Scanner(System.in);
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println(trojkat.calculateArea());;
                                    break;
                                case 2:
                                    System.out.println(trojkat.calculatePerimeter());;
                                    break;
                                case 3:
                                    trojkat.print();
                                default:
                                    cos=false;
                                    break;
                            }
                        }
                    }catch (ArithmeticException exep)
                    {
                        System.out.println("Wymiary trojkata musza byc dodatnie i musi zostac spelniona wlasnosc trojkata");
                        System.exit(1);
                    }
                    break;
                case 3:
                    System.out.println("Podaj promien kola");
                    scanner = new Scanner(System.in);
                    a = scanner.nextDouble();
                    scanner = new Scanner(System.in);
                    try {
                        Circle kolo = new Circle(a);
                        boolean cos = true;
                        while(cos) {
                            System.out.println("Utworzono kolo co chcesz zrobic?\n1) Podaj pole\n2) Podaj obwod\n3) Wyswietl dane o figurze\nInaczej zakoncz");
                            scanner = new Scanner(System.in);
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println(kolo.calculateArea());;
                                    break;
                                case 2:
                                    System.out.println(kolo.calculatePerimeter());;
                                    break;
                                case 3:
                                    kolo.print();
                                default:
                                    cos=false;
                                    break;
                            }
                        }
                    }catch (ArithmeticException exep)
                    {
                        System.out.println("Promien kola musi byc dodatni");
                      //  System.exit(1);
                    }
                    break;
                    default:
                        System.exit(0);

            }
        }
        //Scanner scanner = new Scanner(System.in);
        //int a=scanner.nextInt();
        //System.out.println(a);
        /*
        Triangle trojkat = new Triangle(2, 3, 4);
        trojkat.print();
        System.out.println(trojkat.calculatePerimeter());
        System.out.println(trojkat.calculateArea());
        Square kwadrat = new Square(3, 2);
        kwadrat.print();
        try {
            Square kwadrat2 = new Square(2, 0);

        }catch (ArithmeticException a)
        {
            System.out.println("Wyjatek");
        }
        */
    }
}