class ReverseString{
    public static void main(String[] args) {
        String normal = "what is this?";
        String reverse = "";
        for(int i=normal.length()-1;i>=0;i--)
        {
            reverse+=normal.charAt(i);
        }
        System.out.println(reverse);
    }
}