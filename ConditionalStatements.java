class ConditionalStatements
{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 24;
        int num3 = 9;

        if(num1>num2 && num1>num3)
            System.out.println("num1 is greatest");
        else if(num2 > num3)
             System.out.println("num2 is greatest");
        else
             System.out.println("num3 is greatest");
    }
}