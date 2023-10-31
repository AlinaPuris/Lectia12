public class Employee {
    private String name;
    private int age;
    private String department;
    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return department;
    }
}
