class Mutable{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("q");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuffer name = new StringBuffer("Vikash");
        StringBuffer name1 = new StringBuffer("Vikash");
        name.setLength(3);
        System.out.println(name);
        name1.trimToSize();
        System.out.println(name1.capacity());
        System.out.println(name.toString().equals(name1.toString()));//.equals doesn't directly work in stringbuffer or StringBUilder

    } 
}