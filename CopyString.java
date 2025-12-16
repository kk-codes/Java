class CopyString {

    public static void main(String[] args) {
        String s1 = "work";
        String s2 = s1;

        System.out.println(s2);

        //character by character
        String s3 = "";
        for(int i=0;i<s1.length();i++)
        {
            s3 = s3+s1.charAt(i);
        }
        System.out.println(s3);
    }
}