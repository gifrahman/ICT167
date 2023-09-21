public class Student 
{
    protected String firstName;  // student first name
    protected String lastName;   // student last name
    protected long id;           // student id
    protected Date d = new Date();
    public Student() 
    {
        this.firstName = "";
        this.lastName = "";
        this.id = 00000000;
        this.d = new Date(0,0,0);
    }

    public Student(String firstName, String lastName, long id, int day, int month, int year) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.d = new Date(day,month,year);
    }

    /* set the first name of this Student */
    public void setfirstName(String firstName) 
    {this.firstName = firstName;}

    /* set the last name of this Student */
    public void setlastName(String lastName) 
    {this.lastName = lastName;}

    /* set the id number of this Student */ 
    public void setid(long id)
    {this.id = id;}

    /* Returns the first name of this Student */
    public String getfirstName() 
    {return firstName;}

    /* Returns the last name of this Student */
    public String getlastName() 
    {return lastName;}

    /* Returns the id number of this Student */
    public long getid()
    {return id;}
       
    private CourseStudent ReportGrade(String[] metadata)
    {
        System.out.println("there's no grade here");
        return new CourseStudent();
    }
    
    private ResearchStudent ReportGradeforG(String[] metadata)
    {
        System.out.println("there's no grade here");
        return new ResearchStudent();
    }
    
    @Override
    public String toString()
    {return id+"\t"+firstName+" "+lastName;}
    
    public boolean equals(Student stu)
    {
        if(id == stu.id && firstName.equals(stu.firstName) && lastName.equals(stu.lastName))
        {
            System.out.println("Student with ID "+ id + " is same as " + stu.id);
            System.out.println("Student with Full Name "+ firstName + " " + lastName + " is same as " + stu.firstName + " "+ stu.lastName);
            return true;
        }
        else
        {return false;}
    }
}
