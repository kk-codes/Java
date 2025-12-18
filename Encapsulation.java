

class Facebook{
    // private String id = "priya_sweety";
    // private String password = "password";

    private String id ;
    private String password;

    public String getId()
    {
        return id;
    }
    public void setId(String i)
    {
        id = i;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String pass)
    {
        password = pass;
    }

}
public class Encapsulation{
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        // fb.id = "priya_sweety";
        // fb.password = "password";
        fb.setId("priya_sweety");
        fb.setPassword("password");
        System.out.println(fb.getId() + " : " + fb.getPassword());
    }

}