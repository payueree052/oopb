
package chap5;

public class CallEmployee {
    public static void main(String[] args) {
        Employee em = new Employee("135", "Payueree Nawae");
        em.setSalary(25000);
        em.setAddress(new Address("293/44 Mueng Songklha"));
        em.setDepartment(new Department("1", "Software Devolopment"));
        System.out.println("Name : "+em.getEmpNmae());
        System.out.println("Salary : "+em.getSalary());
        System.out.println("Address : "+em.getAddress().getRegisterAddress());
        System.out.println("Deparment : "+em.getDepartment().getDepName());
    }
}
