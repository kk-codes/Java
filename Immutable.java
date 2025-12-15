class Immutable{

    public static void main(String[] args) {
        String s1 = "code";
        s1.concat(" word");
        System.out.println(s1);
        s1 = s1.concat(" Word");
        System.out.println(s1);
        System.err.println(s1.compareTo("code wrd"));
    }
}