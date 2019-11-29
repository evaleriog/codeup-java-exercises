import java.lang.Math;

public class ServerNameGenerator {
    public static String[] adjetives = {"angry", "scary", "determined", "better", "energetic", "expensive", "super", "tough", "clumsy", "plain"};
    public static String[] nouns = {"van", "computer", "mouse", "keyboard", "cup", "can", "fan", "map", "toe", "book"};

    public static String CreatorName(String[] arr){
        int range = 9 - 0 + 1;
        int randNum = (int)(Math.random() * range) + 0;

        return arr[randNum];
    }

    public static void main(String[] args){
        System.out.println("Here is your server name: ");
        System.out.printf("%s-%s", CreatorName(adjetives), CreatorName(nouns));
    }
}
