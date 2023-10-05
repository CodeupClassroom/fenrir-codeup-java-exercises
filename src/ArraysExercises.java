import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] oldArr, Person newPerson){
        Person[] newArr = Arrays.copyOf(oldArr, oldArr.length +1);

        newArr[newArr.length - 1] = newPerson;

        return newArr;
    }
    public static void main(String[] args) {
        Person[] myPersons = new Person[3];

        Person dudeMcDude = new Person("Duderston Dudely");

        Person maamMissmaam = new Person("Maam Msmaam");

        Person leeroyJenkins = new Person("Leeroy Jenkins");

        myPersons[0] = dudeMcDude;
        myPersons[1] = maamMissmaam;
        myPersons[2] = leeroyJenkins;

        for(Person person : myPersons){
            person.sayHello();
        }

     Person[] newPersonsArr =   ArraysExercises.addPerson(myPersons, new Person("Gillers McGilly"));

        for(Person person : newPersonsArr){
            person.sayHello();
        }
    }

}
