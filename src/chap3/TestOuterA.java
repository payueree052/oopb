package chap3;

class OuterA{
    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;
    
    void outermethod1(){
        System.out.println("OuterA : outerMethod1()");
    }
    static void outerMethod2(){
        System.out.println("OuterA : outerMethod2()");
    }
    static class StaticInner{
        int staticInnerAttribute1 = 15;
        static int staticInnerAttribute2 = 20;
        
        void staticInnerMethod1(){
            System.out.println(staticInnerAttribute1 +","+ staticInnerAttribute2);
            System.out.println(outerAttribute2);
        }
        
        static void staticInnerMethod2(){
            outerMethod2();
        }
    }
}//end class

public class TestOuterA {
    public static void main(String[] args){
        OuterA.StaticInner innerObj = new OuterA.StaticInner();
        innerObj.staticInnerMethod1();
        OuterA.StaticInner.staticInnerMethod2();
    }
}//end class
