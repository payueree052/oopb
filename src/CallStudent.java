public class CallStudent {
    public static void main(String[] args) {
        Student ayii = new Student();
        System.out.println(">>" + ayii );
        ayii.enrollment();
        ayii.payment();
        ayii.addCourse();
        ayii.dropCourse();
        System.out.println("===============");
        GraduateStudent nadet = new GraduateStudent();
        nadet.enrollment();
        nadet.addCourse();
        nadet.dropCourse();
        nadet.payment();
        nadet.oralExamination();
        nadet.thesisExamination();
    }
}//end class
