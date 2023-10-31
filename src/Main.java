// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Training p=new Programmer( "Vasile" , 25);
        p.attendTraining();
        Manager m=new Manager("Ion", 30);
        m.attendTraining();m.conductInterview();

        Training[] attenders = {};
        MeetingRoom meetingRoom = new MeetingRoom();

        Programmer p2 = new Programmer( "Valeria", 27 );
        Programmer p3 = new Programmer("Maria", 25 );
        Programmer p4 = new Programmer( "Andrea", 31 );
        Manager m2= new Manager("Alex",45);

        Employee[] employers = new Employee[]{p2,p3,p4,m2};
        for (Employee employer: employers){
           if (employer instanceof Training) {
                Training trainer = (Training) employer;
                trainer.attendTraining();
            }  if(employer instanceof Interview) {
                Interview interviewer=(Interview) employer;
                interviewer.conductInterview();
            }
        }
    }
}