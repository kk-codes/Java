
class Student{

  int rollNO;
  String name;
  int mark;
}



class ArrayOfObjects
{
    public static void main(String args[])
    {
        Student array[] = new Student[3];

        Student s1 = new Student();
        s1.rollNO = 10;
        s1.name = "Kamal";
        s1.mark = 98;
        Student s2 = new Student();
        s2.rollNO = 11;
        s2.name = "King";
        s2.mark = 98;
        Student s3 = new Student();
        s3.rollNO = 12;
        s3.name = "Kong";
        s3.mark = 98;
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        for(Student element : array)
        {
            System.out.println(element.rollNO+" : "+element.name);
        }
    }
}