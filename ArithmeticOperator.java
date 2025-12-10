class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int result = a + b;
        System.out.println("Addition: " + result);

        result = a - b;
        System.out.println("Subtraction: " + result);
        result = a * b;
        System.out.println("Multiplication: " + result);
        result = a / b;
        System.out.println("Division: " + result);
        result = a % b;
        System.out.println("Modulus: " + result);

        //shortcut

        int c = 12;
        c += 19; // c = c + 19 //31
        c -= 19; // c = c - 19 //12
        c *= 19; // c = c * 19 //228
        c /= 19; // c = c / 19 //12
        c %= 19; // c = c % 19 
        System.out.println(c);
        //pre increment & post increment
        int d = 3;
        System.out.println(d++); 
        //4
        System.out.println(--d);
        //3
        System.out.println(d++);
        //4
        System.out.println(d--);
        //3
        System.out.println("final : "+d);
    }
}