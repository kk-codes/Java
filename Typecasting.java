class TypeCasting
{
    public static void main(String[] args) {
        //Type conversion
        byte by = 127;
        int in = by;
        System.out.println(in);
        //Type casting
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);
        //Type promotion
        byte aa= 10;
        byte bb =20;
        int c = aa * bb;
        System.out.println(c);
    }
}