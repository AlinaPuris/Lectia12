public class Programmer extends Employee implements Training{
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void attendTraining() {
        System.out.println("Attend Training Programmer " +getName());

    }
}
