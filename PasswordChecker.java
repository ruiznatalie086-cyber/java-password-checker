import java.util.Scanner;

    //creating function that checks the strength of passwords
    public static void main(String[] args){
        //reading what user types
        Scanner scanner = new Scanner (System.in);

        int score = 0; //tracks score

        /*Password has to have a score out of 5!
        0-2 Weak >;(
        3-4 Medium :/
        5 STRONG :)
        */
        while (score < 5) { //created loop that keeps going until the score is 5

            //Show this message to user and store it into variable
            System.out.print("Please enter your password here: ");
            String password = scanner.nextLine();

            score = 0; //resets score each time

            //If password is at least 8 character then add 1
            if (password.length() >= 8) score++;

            //If password has uppercase letters then add 1
            if (password.matches(".*[A-Z].*")) score++;

            //If password has lowercase letters then add 1
            if (password.matches(".*[a-z].*")) score++;

            //If password has numbers then add 1
            if (password.matches(".*[0-9].*")) score++;

            //If password has special symbols then add 1
            if (password.matches(".*[~!@#$%^&*(){}].*")) score++;

            //If their score is less than 2
            if (score <= 2) {
                System.out.println("WEAK >;(");
            } else if (score <= 4) {
                System.out.println("Medium :/");//If their score is 3 or 4
            } else {
                System.out.println("STRONG! :)"); //If score is 5
            }

            if (score < 5) { //have them try again till they get 5 points
                System.out.println("Try again! You need a stronger password.\n");
            }
        }
        System.out.println("Strong password has been accepted!! ;) "); //Finally getting a passing password

    }

