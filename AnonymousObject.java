class Human{

private String name;
private int age;

public Human()
{
    System.out.println("in constructor");
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


public class AnonymousObject{
    public static void main(String args[])
    {
    // creating a object without any reference is known as anonymous object
       new Human();

    //Calling method using anonymous object

        new Human().show();
    }
}