class RelationalAndLogical
{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 6;
        boolean bool = a<b;
        boolean bool2 = a>b;
        System.out.println(bool);
        System.out.println(bool2);
        System.out.println("greater than or equal to "+(a>=b)); 
        System.out.println("less than or equal to "+(a<=b)); 
        System.out.println(c==b);
        System.out.println(c!=b);

        //logical operator
        System.out.println("Both conditions are true "+(a<b && b>=c));
        System.out.println("any one conditions is true "+(a>b || b==c));
        boolean result = c==b;
        System.out.println(!result);
    }
}