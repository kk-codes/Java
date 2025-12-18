

class Facebook{
    // private String id = "priya_sweety";
    // private String password = "password";

    private String id ;
    private String password;

    public String getId()
    {
        return id;
    }
   //accepting current object as parameter
    // public void setId(String id,Facebook fb)
    // {
    //     fb.id = id;
    // }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getPassword()
    {
        return password;
    }
    // public void setPassword(String password,Facebook fb)
    // {
    //     fb.password = password;
    // }
    //java gives this keyword to mention the current running object
    public void setPassword(String password)
    {
        this.password = password;
    }

}
public class ThisKeyword{
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        // fb.id = "priya_sweety";
        // fb.password = "password";
         //passing method calling object as argument
        // fb.setId("priya_sweety",fb);
        // fb.setPassword("password",fb);
        fb.setId("priya_sweety");
        fb.setPassword("password");
        System.out.println(fb.getId() + " : " + fb.getPassword());
    }

}