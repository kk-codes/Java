

class Human{

private String name;
private int age;

public Human()
{
    //System.out.println("in constructor");
    name = "babu";
    age = 18;
    
}

//Parameterized constructor
public Human(int age,String name)
{
    //System.out.println("in constructor");
    this.age = age;
    this.name = name;
}

public void show()
{ 
    System.out.println(name + " : "+ age);
}

}


public class Constructor{
    public static void main(String args[])
    {
        Human human = new Human();
        human.show();

        Human human2 = new Human(21,"Sheela");
        human2.show();
    }
}