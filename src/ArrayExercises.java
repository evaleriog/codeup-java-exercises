import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("Eduardo");
        persons[1] = new Person("Jose");
        persons[2] = new Person("Nicolas");

        for(Person person : persons){
            System.out.println(person.getName());
        }

        Person test = new Person("Araceli");

        persons =  addPerson(test, persons);

        for(Person person : persons){
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person obj, Person[] arr){
        Person[] bucket = new Person[arr.length + 1];

        for(int x=0; x < arr.length; x++){
            bucket[x] = arr[x];
        }
        bucket[arr.length] = obj;

        return bucket;
    }
}
