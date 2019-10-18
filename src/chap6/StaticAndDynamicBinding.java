package chap6;

public class StaticAndDynamicBinding {

    public static void main(String[] args) {
        Personnel ps = new Personnel();
        System.out.println(ps.name + ".");
        ps.printName();

        Personnel man = new Manager();
        System.out.println(man.name + ".");
        man.printName();

        Personnel sta = new Staff();
        System.out.println(sta.name + ".");
        sta.printName();
        
        
    }
}
