package Day7;

import java.util.*;

public class Tictactoe {
    public static char userTurn;
    public static char computerTurn;
    public static int userPos;
    public static int computerPos;
    public static char exitCode = '0';
    public static char user = '1';
    public static int turnCount;
    public static char[] gameArray = new char[10];
    public static Scanner scanner = new Scanner(System.in);


    public static void ticTacToe() {
        for (int i = 0; i < gameArray.length; i++) {

            gameArray[i] = ' ';
        }
    }

    public static char user(Scanner scanner) {
        System.out.println("Enter your choice  X or O only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void showBoard() {

        System.out.println(gameArray[0] + " | " + gameArray[1] + " | " + gameArray[2]);
        System.out.println(gameArray[3] + " | " + gameArray[4] + " | " + gameArray[5]);
        System.out.println(gameArray[6] + " | " + gameArray[7] + " | " + gameArray[8]);
    }

    public static void moveLocation() {
        if (user == '1') {
            System.out.print("\nSelect the position in board from range [0 - 8] : ");
            userPos = scanner.nextInt();

            switch (userPos) {
                case 0:
                    if (gameArray[0] == ' ') {
                        gameArray[0] = userTurn;
                    }
                    break;

                case 1:
                    if (gameArray[1] == ' ') {
                        gameArray[1] = userTurn;
                    }
                    break;

                case 2:
                    if (gameArray[2] == ' ') {
                        gameArray[2] = userTurn;
                    }
                    break;

                case 3:
                    if (gameArray[3] == ' ') {
                        gameArray[3] = userTurn;
                    }
                    break;

                case 4:
                    if (gameArray[4] == ' ') {
                        gameArray[4] = userTurn;
                    }
                    break;

                case 5:
                    if (gameArray[5] == ' ') {
                        gameArray[5] = userTurn;
                    }
                    break;

                case 6:
                    if (gameArray[6] == ' ') {
                        gameArray[6] = userTurn;
                    }
                    break;

                case 7:
                    if (gameArray[7] == ' ') {
                        gameArray[7] = userTurn;
                    }
                    break;

                case 8:
                    if (gameArray[8] == ' ') {
                        gameArray[8] = userTurn;
                    }
                    break;

                default:
                    System.out.println("Invalid Position ! Restart game");
                    return;
            }
            winner(userTurn);
        } else if (user == '2') {
            turnCount = turnCount + 1;
            System.out.println("Computer turn");
            if (turnCount == 2 || turnCount == 3 || turnCount == 4)
                blockUser();
            else
                comLocation();
            winner(computerTurn);
        }
    }

    public static void comLocation() {
        boolean flag = false;
        while (true) {
            Random rand = new Random();
            computerPos = rand.nextInt(9);
            switch (computerPos) {
                case 0:
                    if (gameArray[0] == ' ') {
                        gameArray[0] = computerTurn;
                        flag = true;
                    }
                    break;

                case 1:
                    if (gameArray[1] == ' ') {
                        gameArray[1] = computerTurn;
                        flag = true;
                    }
                    break;

                case 2:
                    if (gameArray[2] == ' ') {
                        gameArray[2] = computerTurn;
                        flag = true;
                    }
                    break;

                case 3:
                    if (gameArray[3] == ' ') {
                        gameArray[3] = computerTurn;
                        flag = true;
                    }
                    break;

                case 4:
                    if (gameArray[4] == ' ') {
                        gameArray[4] = computerTurn;
                        flag = true;
                    }
                    break;

                case 5:
                    if (gameArray[5] == ' ') {
                        gameArray[5] = computerTurn;
                        flag = true;
                    }
                    break;

                case 6:
                    if (gameArray[6] == ' ') {
                        gameArray[6] = computerTurn;
                        flag = true;
                    }
                    break;

                case 7:
                    if (gameArray[7] == ' ') {
                        gameArray[7] = computerTurn;
                        flag = true;
                    }
                    break;

                case 8:
                    if (gameArray[8] == ' ') {
                        gameArray[8] = computerTurn;
                        flag = true;
                    }
                    break;

            }
            if (flag == true) {
                break;
            }

        }
    }

    public static void winner(char symbol) {

        if (gameArray[0] != ' ' && gameArray[0] == gameArray[1] && gameArray[1] == gameArray[2]) {
            if (gameArray[0] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer WINS THE GAME\n");
            }
            exitCode = '1';

        } else if (gameArray[3] != ' ' && gameArray[3] == gameArray[4] && gameArray[4] == gameArray[5]) {
            if (gameArray[3] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[7] != ' ' && gameArray[6] == gameArray[7] && gameArray[7] == gameArray[8]) {
            if (gameArray[7] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[6] != ' ' && gameArray[0] == gameArray[3] && gameArray[3] == gameArray[6]) {
            if (gameArray[6] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[1] != ' ' && gameArray[1] == gameArray[4] && gameArray[4] == gameArray[7]) {
            if (gameArray[1] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[5] != ' ' && gameArray[2] == gameArray[5] && gameArray[5] == gameArray[8]) {
            if (gameArray[5] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[4] != ' ' && gameArray[0] == gameArray[4] && gameArray[4] == gameArray[8]) {
            if (gameArray[4] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\nComputer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        } else if (gameArray[2] != ' ' && gameArray[2] == gameArray[4] && gameArray[4] == gameArray[6]) {
            if (gameArray[2] == symbol) {
                System.out.println("\n\nPLAYER ONE WINS THE GAME\n");
            } else {
                System.out.println("\n\n Computer ONE WINS THE GAME\n");
            }
            exitCode = '1';
        }
    }

    public static void blockUser() {
        if ((gameArray[0] == userTurn && gameArray[1] == userTurn) || (gameArray[0] == computerTurn && gameArray[1] == computerTurn)) {
            gameArray[2] = computerTurn;
        } else if (gameArray[3] == userTurn && gameArray[4] == userTurn) {
            gameArray[5] = computerTurn;
        } else if ((gameArray[6] == userTurn && gameArray[7] == userTurn) || (gameArray[6] == computerTurn && gameArray[7] == computerTurn)) {
            gameArray[8] = computerTurn;
        } else if ((gameArray[0] == userTurn && gameArray[3] == userTurn) || (gameArray[0] == computerTurn && gameArray[3] == computerTurn)) {
            gameArray[6] = computerTurn;
        } else if (gameArray[1] == userTurn && gameArray[4] == userTurn) {
            gameArray[7] = computerTurn;
        } else if ((gameArray[2] == userTurn && gameArray[5] == userTurn) || (gameArray[2] == computerTurn && gameArray[5] == computerTurn)) {
            gameArray[8] = computerTurn;
        } else if (gameArray[0] == userTurn && gameArray[4] == userTurn) {
            gameArray[8] = computerTurn;
        } else if (gameArray[2] == userTurn && gameArray[4] == userTurn) {
            gameArray[6] = computerTurn;
        } else if (gameArray[0] == userTurn && gameArray[2] == userTurn) {
            gameArray[1] = computerTurn;
        } else if (gameArray[3] == userTurn && gameArray[5] == userTurn) {
            gameArray[4] = computerTurn;
        } else if (gameArray[6] == userTurn && gameArray[8] == userTurn) {
            gameArray[7] = computerTurn;
        } else if (gameArray[0] == userTurn && gameArray[6] == userTurn) {
            gameArray[3] = computerTurn;
        } else if (gameArray[1] == userTurn && gameArray[7] == userTurn) {
            gameArray[4] = computerTurn;
        } else if (gameArray[2] == userTurn && gameArray[8] == userTurn) {
            gameArray[5] = computerTurn;
        } else if (gameArray[0] == userTurn && gameArray[8] == userTurn) {
            gameArray[4] = computerTurn;
        } else if (gameArray[2] == userTurn && gameArray[6] == userTurn) {
            gameArray[4] = computerTurn;
        } else
            comLocation();
    }

    public static void main(String[] args) {
        ticTacToe();
        userTurn = user(scanner);
        computerTurn = (userTurn == 'X') ? 'O' : 'X';
        showBoard();
        int Toss;
        int wonToss;
        System.out.println("Choose\n 0. Heads\n 1. Tails\nEnter you choice [0-1] : ");
        Toss = scanner.nextInt();
        Random rand1 = new Random();
        wonToss = rand1.nextInt(2);

        if (wonToss == Toss) {
            System.out.println("You won the toss");
            while (true) {
                moveLocation();
                System.out.println("Your board");
                showBoard();
                winner(userTurn);
                if (exitCode == '1') {
                    break;
                }
                comLocation();
                System.out.println("Computer Board");
                showBoard();
                winner(computerTurn);
                if (exitCode == '1') {
                    break;
                }
            }
        } else {
            System.out.println("Computer won the toss");
            while (true) {
                comLocation();
                System.out.println("Computer Board");
                showBoard();
                winner(computerTurn);
                if (exitCode == '1') {
                    break;
                }
                System.out.println("Your Turn");
                moveLocation();
                System.out.println("Your board");
                showBoard();
                winner(userTurn);
                if (exitCode == '1') {
                    break;
                }
            }
        }

    }
}
