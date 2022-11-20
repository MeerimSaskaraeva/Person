import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;

public class Driver extends Person implements PersonAble{
    private int superSpeed;
    public Driver(){}


    public Driver(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, int superSpeed) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.superSpeed = superSpeed;
    }

    public int getSuperSpeed() {
        return superSpeed;
    }

    public void setSuperSpeed(int superSpeed) {
        this.superSpeed = superSpeed;
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+" "+"favorite sport is tennis");

    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+" "+"Favorite language is Spanish";
    }

    @Override
    public Month favoriteMouth() {
        int x;
        LocalDate date=LocalDate.now();
        LocalDate month=date.minusMonths(getAge());

        Period period=Period.between(date,month);
        x=period.getMonths();

        return Month.of(-x);

    }

    @Override
    public String getLastName() {

        String[] words=getFullName().split(" ");

        return words[1];

    }

    @Override
    public LocalDate getDateOfBirth() {
        LocalDate date=LocalDate.now();
        LocalDate age= date.minusYears(getAge());

        return age;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getEmail()+" "+getPhoneNumber();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {

        long[] arrayAge = new long[people.length];
        int counter = 0;
        for (Person person : people) {
            arrayAge[counter] = person.getAge();
            counter++;}
        return arrayAge;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "superSpeed=" + superSpeed +
                super.toString()+
                '}';
    }
}
