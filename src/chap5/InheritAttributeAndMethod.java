
package chap5;

public class InheritAttributeAndMethod {
    public static void main(String[] args) {
        Animal am = new Animal();
        System.out.println("Animal is a "+am.name);
        System.out.println("Method of Animal : ");
        am.grow(); am.reproduce();
        Plant pl = new Plant();
        System.out.println("Plant is a "+pl.name);
        System.out.println("Method of Plant : ");
        pl.grow(); pl.reproduce();
    }
}
