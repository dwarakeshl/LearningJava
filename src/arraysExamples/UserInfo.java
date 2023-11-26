package arraysExamples;

import java.util.Scanner;

public class UserInfo {
    String[][] users = { { "pivot@gmail.com", "abcue12" }, { "riya@gmail.com", "sss@12" },
            { "lal@gmail.com", "ath@12" } };
    Scanner sc = new Scanner(System.in);

    void populateUsers() {
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                users[i][j] = sc.next();
            }
        }
    }

    void findUser() {
        System.out.print("Enter user ID: ");
        String inputUserId = sc.next();
        boolean found = false;
        String password = "";

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                if (inputUserId.equals(users[i][j])) {
                    found = true;
                    password = users[i][1]; // Assuming the password is always in the second column
                    System.out.println("User ID found at index [" + i + "][" + j + "]");
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("User ID not found");
        } else {
            System.out.println("Password: " + password);
        }
    }
}