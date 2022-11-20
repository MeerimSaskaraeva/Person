import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {

    void favoriteSport();

    String favoriteLanguage();

    Month favoriteMouth();

    String getLastName();

    LocalDate getDateOfBirth();

    String getPhoneNumberAndEmail();

    long[] getPeopleOfAllAges(Person[] people);

}
