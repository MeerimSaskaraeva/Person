import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Programmer extends Person implements PersonAble{
    private int  typeSpeed;

    public Programmer(){}


    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, int typeSpeed) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.typeSpeed = typeSpeed;
    }

    public int getTypeSpeed() {
        return typeSpeed;
    }

    public void setTypeSpeed(int typeSpeed) {
        this.typeSpeed = typeSpeed;
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+" "+"favorite sport is tetris");
    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+" "+"Favorite language is France";
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
            counter++;
            for (int i = 0; i < people.length; i++) {
                for (int j = 0; j < people.length; j++)
                    if (people[i].getAge() == arrayAge[j]) {
                    }
            }
        }

        return arrayAge;
    }}
