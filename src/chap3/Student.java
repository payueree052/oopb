package chap3;

public class Student {
    
    private String studentId;
    private String studentName;
    private String faculty;
    private String major;
    
    public Student() {
        System.out.println("Hi defalt constuctor");
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String facuty) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = facuty;
    }

    public Student(String studentId, String studentName, String facuty, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = facuty;
        this.major = major;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 : "+s1);
        showAttribute(s1);
        
        Student s2 = new Student("1001");
        showAttribute(s2);
        
        Student s3 = new Student("1001","Ayii");
        showAttribute(s3);
        
        Student s4 = new Student("1001","ayii","Science");
        showAttribute(s4);
        
        Student s5 = new Student("1001","Ayii","Science","IT");
        showAttribute(s5);
    }

    private static void showAttribute(Student s1) {
        System.out.println("ID : "+s1.studentId);
        System.out.println("Name : "+s1.studentName);
        System.out.println("Facuty : "+s1.faculty);
        System.out.println("Major : "+s1.major);
        System.out.println("-----------------------");
    }
}
