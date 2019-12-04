package codeup;
import java.util.Scanner;
import java.lang.Math;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        boolean response;

        String[][] matrix = {
                {"---", "---", "---"},
                {"---", "---", "---"},
                {"---", "---", "---"}
        };
        System.out.println("Welcome to Tic Tac Toe");

        do{

            displayMoves(matrix);
            match(matrix);
            System.out.println("Do you want to play another game of Tic Tac Toe? (Y/N)");
            String another = sc.nextLine();
            another = another.trim();

            if(another.equalsIgnoreCase("y")){
                response = true;
                System.out.println("Perfect...let's meet our new players then.....");
            }else {
                response = false;
                System.out.println("This was fun...thanks for playing....");
            }

        }while(response);


    }

    public static void match(String[][] arr){
        String checkX = "-x-";
        String checkO = "-o-";
        boolean isOver;
        int turn = (int)(Math.random() * ((2 - 1) + 1)) + 1;

        System.out.println("Please enter the name for player 1:");
        String playerOne = sc.nextLine();
        playerOne = playerOne.trim();

        System.out.println("Please enter the name for player 2:");
        String playerTwo = sc.nextLine();
        playerTwo = playerTwo.trim();

        System.out.printf("Looks like we have %s and %s today for a match of Tic Tae Toe..%n", playerOne, playerTwo);
        System.out.printf("All right %s....you will be the x...%n", playerOne);
        System.out.printf("and of course that means... %s....you will be the o...%n", playerTwo);

        do{
            if(turn == 1){
                System.out.printf("%n%s enter your move....", playerOne);
                checkMove(arr,checkX);
                displayMoves(arr);
                isOver = checkWin(arr, checkX, playerOne);
                turn = 2;
            }else{
                System.out.printf("%n%s enter your move....", playerTwo);
                checkMove(arr,checkO);
                displayMoves(arr);
                isOver = checkWin(arr, checkO, playerTwo);
                turn = 1;
            }

        }while(!isOver);

    }

    public static String[][] checkMove(String[][] arr, String mark){

        String[] possibleMoves = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C"};
        String move = sc.nextLine();
        move = move.trim().toUpperCase();
        boolean possible = false;

        for(String oneMove : possibleMoves){
            if(move.equals(oneMove)){
                possible = true;
                break;
            }
        }

        if(possible && checkSpace(move,arr)){
            changeMove(move, arr, mark);
        }else{
            System.out.println("Not a correct move...Try again...");
            checkMove(arr,mark);
        }

        return arr;
    }

    public static String[][] changeMove(String move, String[][] arr, String mark){
        switch (move){
            case "1A":
                arr[0][0] = mark;
                break;
            case "1B":
                arr[0][1] = mark;
                break;
            case "1C":
                arr[0][2] = mark;
                break;
            case "2A":
                arr[1][0] = mark;
                break;
            case "2B":
                arr[1][1] = mark;
                break;
            case "2C":
                arr[1][2] = mark;
                break;
            case "3A":
                arr[2][0] = mark;
                break;
            case "3B":
                arr[2][1] = mark;
                break;
            case "3C":
                arr[2][2] = mark;
                break;
        }

        return arr;
    }

    public static boolean checkSpace(String move, String[][] arr){
        boolean canYou = true;

        switch (move){
            case "1A":
                if( arr[0][0].equals("-x-") || arr[0][0].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "1B":
                if( arr[0][1].equals("-x-") || arr[0][1].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "1C":
                if( arr[0][2].equals("-x-") || arr[0][2].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "2A":
                if( arr[1][0].equals("-x-") || arr[1][0].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "2B":
                if( arr[1][1].equals("-x-") || arr[1][1].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "2C":
                if( arr[1][2].equals("-x-") || arr[1][2].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "3A":
                if( arr[2][0].equals("-x-") || arr[2][0].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "3B":
                if( arr[2][1].equals("-x-") || arr[2][1].equals("-o-") ){
                    canYou = false;
                }
                break;
            case "3C":
                if( arr[2][2].equals("-x-") || arr[2][2].equals("-o-") ){
                    canYou = false;
                }
                break;
        }

        return canYou;
    }

    public static boolean checkWin(String[][] arr, String mark, String player){
        boolean win = false;
        String winMark;

        if(mark.equals("-x-")){
            winMark = "*x*";
        }else {
            winMark = "*o*";
        }

        if(arr[0][0] == mark && arr[0][1] == mark && arr[0][2] == mark){
            win = true;
            arr[0][0] = winMark;
            arr[0][1] = winMark;
            arr[0][2] = winMark;
        }else if(arr[1][0] == mark && arr[1][1] == mark && arr[1][2] == mark){
            win = true;
            arr[1][0] = winMark;
            arr[1][1] = winMark;
            arr[1][2] = winMark;
        }else if(arr[2][0] == mark && arr[2][1] == mark && arr[2][2] == mark) {
            win = true;
            arr[2][0] = winMark;
            arr[2][1] = winMark;
            arr[2][2] = winMark;
        }else if(arr[0][0] == mark && arr[1][0] == mark && arr[2][0] == mark){
            win = true;
            arr[0][0] = winMark;
            arr[1][0] = winMark;
            arr[2][0] = winMark;
        }else if(arr[0][1] == mark && arr[1][1] == mark && arr[2][1] == mark) {
            win = true;
            arr[0][1] = winMark;
            arr[1][1] = winMark;
            arr[2][1] = winMark;
        }else if(arr[0][2] == mark && arr[1][2] == mark && arr[2][2] == mark){
            win = true;
            arr[0][2] = winMark;
            arr[1][2] = winMark;
            arr[2][2] = winMark;
        }else if(arr[0][0] == mark && arr[1][1] == mark && arr[2][2] == mark){
            win = true;
            arr[0][0] = winMark;
            arr[1][1] = winMark;
            arr[2][2] = winMark;
        }else if(arr[0][2] == mark && arr[1][1] == mark && arr[2][0] == mark){
            win = true;
            arr[0][2] = winMark;
            arr[1][1] = winMark;
            arr[2][0] = winMark;
        }

        if(win == true){
            displayMoves(arr);
            System.out.printf("%nCongratulations %s, you won the match.......%n", player);

            for(int x = 0; x < arr.length; x++){
                for(int y =0; y < arr.length; y++){
                    arr[x][y] = "---";
                }
            }
        }

        return win;
    }

    public static void displayMoves(String[][] arr){
        System.out.println("   A   B   C");
        for(int x = 0; x < arr.length; x++){
            System.out.printf("%d ", x+1);
            for(int y =0; y < arr.length; y++){
                System.out.printf("%3s ", arr[x][y]);
            }
            System.out.println();
        }
    }
}


