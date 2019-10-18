
package chap5;

public class Employee {
    private String empId;
    private String empNmae;
    private Address address;
    private Department department;
    private double salary;

    public Employee(String empId, String empNmae) {
        this.empId = empId;
        this.empNmae = empNmae;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNmae() {
        return empNmae;
    }

    public void setEmpNmae(String empNmae) {
        this.empNmae = empNmae;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
