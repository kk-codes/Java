class stringPractice{
    public static void main(String[] args) {
        

        String name = "kamal";
        String Name = "kamal";
        String name1 = new String("kamal");
        String name2 = new String("kamal");
        String sample = "KAMAL";
        System.out.println(name.equals(name1)); //checking whether value inside scp and outside scp are same
        System.out.println(name == Name); // checking whether reference of both variable are pointing towards same 
        System.out.println(name1 == name2);// checking whether reference of both variable are same inside and outside scp
        System.out.println(name.toUpperCase()); //convert into uppercase
        System.out.println(sample.toLowerCase());
        System.out.println(sample.charAt(2));
        System.out.println(sample.substring(0, 3));
        System.out.println(sample.isEmpty());
        System.out.println(sample.endsWith("AL"));
    }
}