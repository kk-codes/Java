
class Mobile{
    String brand;
    static String name;
    int price;

    static{
        System.out.println("In static block");
    }
    public Mobile()
    {
        System.out.println("In contructor");
    }

    void show()
    {
        System.out.println(brand+" : "+name+" : "+price);
    }
     static void display(Mobile mob)
    {
        System.out.println("In display method");
        System.out.println(mob.brand+" : "+name+" : "+mob.price);
    }
}
public class StaticExample
{
    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("Mobile");
        // Mobile mob = new Mobile();

        // mob.brand = "apple";
        // mob.price = 1500;
        // Mobile.name = "Smart phone";

        // Mobile mob1 = new Mobile();
        // mob1.brand = "Samsung";
        // mob1.price = 1300;
        // Mobile.name = "smart phone";

        //   Mobile.name = "phone";
        // mob1.show();
        // mob.show();

        // Mobile.display(mob);

    }
}