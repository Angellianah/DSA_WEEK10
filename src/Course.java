public class Course {
    private String code;
    private String description;

    Course(){}
    public Course(String code, String description) {
        this.code = code;
        this.description = description;
    } // end of the constructor

    // Getters and setters for the course attributes
    public String getCode(){return code;}
    public String getDescription(){return description;}
    public void setCode(String code){this.code=code;}
    public void setDescription(String description){this.description=description;}
    public void setCourse(String code, String description) {
        this.code = code;
        this.description = description;
    } // end of method
    public String getCourse() {
        return code+"\t"+description+"\t";
    } // end of method
    public void viewCourseInfo() {
        System.out.println("Code\t\t:   "+code);
        System.out.println("Description\t:  "+description);
    } // end of method
    public String showCourseInfo() {
        return "Code\t\t:   "+code+"\nDescription\t:    "+description; 
    } // end of method
} // end of class
