class Student
{
    private int rollNo;
    private String name;
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    } 
    public void setName(String name)
    {
        this.name = name;
    }
    public int getRollNo()
    {
        return this.rollNo;
    }
    public String getName()
    {
        return this.name;
    }
}

class College{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setRollNo(101);
        s1.setName("Ankita");
        s2.setRollNo(102);
        s2.setName("pupa");
        System.out.println("RollNo= "+s1.getRollNo()+"  Name= "+s1.getName());
        
    }
}





























public class College {
    
}
