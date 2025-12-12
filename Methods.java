
class Computer{
    public void musicPlayer()
    {
        System.out.println("Music playing");
    }
    public String pen(int cost)
    {
        if(cost>=10)
            return "pen";
        return "No pen for you";
    }
}

public class Methods {
    public static void main(String args[])
    {
        Computer computer = new Computer();

        computer.musicPlayer();
        int price = 10;
        String pen = computer.pen(price);
        System.out.println(pen);
    }
    
}
