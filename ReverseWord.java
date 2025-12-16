class ReverseWord{
    public static void main(String[] args) {
       String word = "Think Twice";
       String revWord = "";
       String array[]=word.split(" ");
       for(int i=array.length-1;i>=0;i--)
       {
            revWord+=array[i]+" ";
       }
       System.out.println(revWord);
    }
}