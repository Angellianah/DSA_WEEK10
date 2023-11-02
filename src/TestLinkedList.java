public class TestLinkedList {
    private static int i;

    public static void main(String[] args) {

        System.out.println("Tester\t: Reigna Jules Garcia\n");
        // Create instances of Student and Course
        Course course1 = new Course("BSCS", "BS Computer Science");
        Course course2 = new Course("BSIT", "BS Information Technology");
        Course course3 = new Course("BSIS", "BS Information System");
        Course course4 = new Course("BSEMC", "BS Enterainment and Multimedia Computing");

        Student stud1 = new Student("S001","Cory Khong","Female",20,course1,2.5);
        Student stud2 = new Student("S002","Malou Ngay","Female",22,course1,1.3);
        Student stud3 = new Student("S003","Tina Kong","Female",24,course2,1.2);
        Student stud4 = new Student("S004","Sy Bent Thong","Male",18,course1,1.7);
        Student stud5 = new Student("S005", "Phinah Asah","Female",15,course1,2.1);
        Student stud6 = new Student("S006","Keena Good","Female",23,course3,3.5);
        Student stud7 = new Student("S007","Pepe Tsugi","Male",20,course4,2.4);
        Student stud8 = new Student("S008","Malou Wang","Female",19,course1,1.5);

        // Create a linked list of students
        LNode<Student> studentList = new LNode<Student>();

        // Add a student's data at the last node
        studentList.addAtLast(stud1);
        studentList.addAtLast(stud2);
        studentList.addAtLast(stud3);
        studentList.addAtLast(stud4);
        studentList.addAtLast(stud5);
        studentList.addAtLast(stud6);
        studentList.addAtLast(stud7);
        studentList.addAtLast(stud8);

        // LNode Method Call
        System.out.println("Empty\t\t\t:    "+studentList.isEmpty());
        System.out.println("Number of Recors\t:     "+studentList.currentSize());
        studentList.getFirst().viewStudentInfo();
        System.out.println(studentList.getLast().getStudent());

        System.out.println(studentList.traverse());

        //while(i<studentList.currentSize()) {
            //System.out.println(studentList.getNode(i).getStudent());
            //i++
        
        System.out.println(studentList.traverseNode());

    } //end of main
} //end of class