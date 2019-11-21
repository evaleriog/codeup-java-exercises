import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        Scanner in  = new Scanner(System.in);

        while(i <= 15){
            System.out.print(i + " ");
            i++;
        }

        System.out.print("\n");
        System.out.println("---------------------");

        int num2 = 0;

        do{
            System.out.println(num2);
            num2 += 2;

        }while(num2 <= 100);

        System.out.println("---------------------");

        num2 = 100;

        do{
            System.out.println(num2);
            num2 -= 5;

        }while(num2 >= -10);

        System.out.println("---------------------");

        long num3 = 2L;

        do{
            System.out.println(num3);
            num3 = num3 * num3;

        }while(num3 < 1000000L);

        System.out.println("---------------------");

        for(int x = 5; x < 16; x++){
            System.out.print(x + " ");
        }

        System.out.print("\n");
        System.out.println("---------------------");

        for(int x = 0; x <= 100; x++){
            System.out.println(x);
        }

        System.out.println("---------------------");

        for(long x = 2L; x < 1000000L; x *= x){
            System.out.println(x);
        }

        System.out.println("---------------------");

        for(int y = 0; y <= 100; y++){
            if(y % 5 == 0 && y % 3 ==0){
                System.out.println("FizzBuzz.");
            }else if(y % 5 == 0) {
                System.out.println("Buzz");
            }else if(y % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(y);
            }
        }

        System.out.println("---------------------");
        System.out.println("What number would you like to go up to? ");
        int userNumber = in.nextInt();

        System.out.println("number | squared | cubed \n------ | ------- | ----- ");
        for(int z = 1; z <= userNumber; z++){
            System.out.printf("%-6d | %-7d | %-5d%n", z, z*z, z*z*z);
        }

        System.out.println("---------------------");
        int grade = 0;
        do{
            System.out.println("Enter your grade or -1 to exit: ");
            grade = in.nextInt();

            if(grade >= 97 && grade <= 100){
                System.out.printf("Based on your numerical grade of %d, your letter grade is A+",grade);
            }else if(grade >= 93 && grade <= 96){
                System.out.printf("Based on your numerical grade of %d, your letter grade is A",grade);
            }else if(grade >= 90 && grade <= 92){
                System.out.printf("Based on your numerical grade of %d, your letter grade is A-",grade);
            }else if(grade >= 87 && grade <= 89){
                System.out.printf("Based on your numerical grade of %d, your letter grade is B+",grade);
            }else if(grade >= 83 && grade <= 86){
                System.out.printf("Based on your numerical grade of %d, your letter grade is B",grade);
            }else if(grade >= 80 && grade <= 82){
                System.out.printf("Based on your numerical grade of %d, your letter grade is B-",grade);
            }else if(grade >= 77 && grade <= 79){
                System.out.printf("Based on your numerical grade of %d, your letter grade is C+",grade);
            }else if(grade >= 73 && grade <= 76){
                System.out.printf("Based on your numerical grade of %d, your letter grade is C",grade);
            }else if(grade >= 70 && grade <= 72){
                System.out.printf("Based on your numerical grade of %d, your letter grade is C-",grade);
            }else if(grade >= 67 && grade <= 69){
                System.out.printf("Based on your numerical grade of %d, your letter grade is D+",grade);
            }else if(grade >= 63 && grade <= 66){
                System.out.printf("Based on your numerical grade of %d, your letter grade is D",grade);
            }else if(grade >= 60 && grade <= 62){
                System.out.printf("Based on your numerical grade of %d, your letter grade is D-",grade);
            }else if(grade >=0 && grade <= 59){
                System.out.printf("Based on your numerical grade of %d, your letter grade is F",grade);
            }

            System.out.print("\n");

        }while(grade != -1);



    }
}
