public class Manager extends Employee implements  Training, Interview{
    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Attend Training Manager " +getName());

    }

    @Override
    public void conductInterview() {
        System.out.println("Conduct Interview Manager " +getName());

    }
}
