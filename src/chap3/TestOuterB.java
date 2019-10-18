package chap3;

class OuterB{
    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;
    
    void outermethod1(){
        System.out.println("OuterB : outerMethod1()");
    }
    static void outerMethod2(){
        System.out.println("OuterB : outerMethod2()");
    }
    class MemberInner{
        int MemberAttribute = 15;
        
        void MemberInnerMethod(){
            System.out.println(MemberAttribute);
            System.out.println(outerAttribute1 +","+ outerAttribute2);
            outermethod1();
            outerMethod2();
        }
    }
}//end class

public class TestOuterB {
    public static void main(String[] args){
        OuterB outObj = new OuterB();
        OuterB.MemberInner innerObj = outObj.new MemberInner();
        innerObj.MemberInnerMethod();
    }
}//end class
