class Pallindrom{
    public static void main(String[] args) {
        
        String word = "racecar";
        String rev = "";
        for(int i= word.length()-1;i>=0;i--)
        {
            rev += word.charAt(i);
        }
        System.out.println(rev);
        System.out.println("Is the given word is pallindrom: "+word.equals(rev));
    }
}