class Calculator
{
    public int add(int n1, int n2 , int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
     public double add(double n1, int n2)
    {
        return n1+n2;
    }
     public double add(int n1, double n2)
    {
        return n1+n2;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
    int num1 = 7;
    int num2 = 8;
    int num3 = 9;
    double num4 = 5.5;
    Calculator calculator = new Calculator();

    System.out.println(calculator.add(num1, num2));
    System.out.println(calculator.add(num1, num2, num3));
    System.out.println(calculator.add(num4, num2));
    System.out.println(calculator.add(num1, num4));
    }
    
    
    
}
