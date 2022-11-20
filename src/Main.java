import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Programmer person1=new Programmer(123456,"Asan Usenov", (byte) 26,'M', "asan@gmail.com","996456765345",2000,60);
        Programmer person2=new Programmer(345213,"Ulan Esenov", (byte) 34,'M', "ulan@gmail.com","996700700700",3000,90);
        Programmer person3=new Programmer(968700,"Akil Amanov", (byte) 43,'M', "akil@gmail.com","996700700000",4000,120);

        Driver person4=new Driver(654123,"Esen Amanov", (byte) 26,'M', "esen@gmail.com","996700000000",2500,130);
        Driver person5=new Driver(879999,"Mirlan Hurlanov", (byte) 45,'M', "mirlan@gmail.com","996788800000",3500,150);
        Driver person6=new Driver(999999,"Uluk Zamanov", (byte) 37,'M', "uluk@gmail.com","996788844000",3500,120);

        Doctor person7=new Doctor(888999,"Piter Penov", (byte) 45,'M', "piter@gmail.com","996700000000",7500,20);
        Doctor person8=new Doctor(333333,"Emma Nuella", (byte) 42,'F', "emma@gmail.com","996700667000",6500,10);
        Doctor person9=new Doctor(555555,"Mira Lirova", (byte) 55,'F', "mira@gmail.com","996700099900",9500,30);

        Person[]people={person1,person2,person3,person4,person5,person6,person7,person8,person9};
        Programmer[]people1={person1,person2,person3};
        Driver[]people2={person4,person5,person6};
        Doctor[]people3={person7,person8,person9};

        Doctor doctor=new Doctor();
        Driver driver=new Driver();
        Programmer programmer=new Programmer();


        for (int i = 0; i < people1.length; i++) {
        people1[i].favoriteSport();
        System.out.println(people1[i].favoriteLanguage());
            System.out.println(people1[i].favoriteMouth());
            System.out.println(people1[i].getLastName());
            System.out.println(people1[i].getDateOfBirth());
            System.out.println(people1[i].getPhoneNumberAndEmail());
            System.out.println(Arrays.toString(people1[i].getPeopleOfAllAges(people1)));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        for (int i = 0; i < people2.length; i++) {
            people2[i].favoriteSport();
            System.out.println(people2[i].favoriteLanguage());
            System.out.println(people2[i].favoriteMouth());
            System.out.println(people2[i].getLastName());
            System.out.println(people2[i].getDateOfBirth());
            System.out.println(people2[i].getPhoneNumberAndEmail());
            System.out.println(Arrays.toString(people2[i].getPeopleOfAllAges(people2)));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        for (int i = 0; i < people3.length; i++) {
            people3[i].favoriteSport();
            System.out.println(people3[i].favoriteLanguage());
            System.out.println(people3[i].favoriteMouth());
            System.out.println(people3[i].getLastName());
            System.out.println(people3[i].getDateOfBirth());
            System.out.println(people3[i].getPhoneNumberAndEmail());
            System.out.println(Arrays.toString(people3[i].getPeopleOfAllAges(people3)));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}