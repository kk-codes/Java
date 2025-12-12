

public class Array {
public static void main(String[] args) {

    int array[] = {3,4,5,6};
    int array1[] = new int[4];
    int array2[];

    array2 = new int[3];

    array1[0] = 2;
    array1[1] = 4;
    array1[2] = 6;
    array1[3] = 9;

    for(int i=0;i<4;i++)
    {
        System.out.print(array[i]+" ");
    }
    System.out.println();
    for(int i=0;i<4;i++)
    {
        System.out.print(array1[i]+" ");
    }
    System.out.println();
    for(int i=0;i<array2.length;i++)
    {
        System.out.print(array2[i]+" ");
    }
}    
}
