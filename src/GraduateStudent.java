public class GraduateStudent extends Student{
    private String studyLevel;
    private String thesisAdiser;
    
    public void oralExamination() {
        System.out.println("oralExamination");
    }
    public void thesisExamination() {
        System.out.println("thesisExamination");
    }

    @Override
    public void payment() {
        super.payment(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("payment by credit");
    }

    
}//end class
