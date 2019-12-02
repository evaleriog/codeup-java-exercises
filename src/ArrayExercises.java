import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(numbers));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Person[] persons = new Person[3];
        persons[0] = new Person("Eduardo");
        persons[1] = new Person("Jose");
        persons[2] = new Person("Nicolas");

        for(Person person : persons){
            System.out.println(person.getName());
        }

        Person test = new Person("Araceli");

        persons =  addPerson(test, persons);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(Person person : persons){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person obj, Person[] arr){
        Person[] bucket = Arrays.copyOf(arr, arr.length + 1);
        bucket[arr.length] = obj;

        return bucket;
    }
}
