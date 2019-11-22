import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String question = "";
        do{
            System.out.println("Talk to Bob");
            question = in.nextLine();
            question = question.trim();

            if(question.endsWith("?")){
                System.out.println("Sure.");
            }else if(question.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(question.equals("")){
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("Whatever.");
            }
        }while(!question.equalsIgnoreCase("exit"));
    }
}
