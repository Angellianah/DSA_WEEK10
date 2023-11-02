public class Student {
    //data fields
    private String id, name, gender;
    private int age;
    private double gpa;
    private Course course;

    //constructors
    Student(){}
    public Student(String id,String name,String gender,int age,Course course,
    double gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    } //end of the constructor

    // Getters and setters for the student attributes
    public String getId(){return id;}
    public String getName(){return name;}
    public String getGender(){return gender;}
    public int getAge(){return age;}
    public double getGpa(){return gpa;}
    public void setCourse(Course course){this.course=course;}
    public void setId(String id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setGender(String gender){this.gender=gender;}
    public void setAge(int age){this.age=age;}
    public void setGpa(double gpa){this.gpa=gpa;}
    public Course getCourse(){return course;}

    public void setStudent(String id,String name,String gender,int age,
    Course course,double gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    } // end of method

    public String getStudent() {
        return id+"\t"+name+"\t"+gender+"\t"+age+"\t"+course.getCode()+"\t"+gpa+"\t";
    } // end of method

    public void viewStudentInfo() {
        System.out.println("Id\t: "+id);
        System.out.println("Name\t:     "+name);
        System.out.println("Gender\t:   "+gender);
        System.out.println("Age\t:"+age);
        System.out.println("Course\t:   "+course.getCode());
        System.out.println("GPA\t:"+gpa);
    } // end of method

    public String showStudentInfo() {
        return "Id\t:"+id+
                    "\nName\t:  "+name+
                    "\nGender\t: "+gender+
                    "\nAge\t:   "+age+
                    "\nCourse\t: "+course.getCode()+
                    "\nGPA\t:   "+gpa;
    }
}