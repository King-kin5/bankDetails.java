import  java.util.Scanner;

/**
 * banksystem
 */
public class banksystem {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("how many numbers of customer do you want to input?");
            int n = sc.nextInt();
            bankDetails C[] = new bankDetails[n];
            for (int i = 0; i < C.length; i++) {
                C[i] = new bankDetails();
                C[i].openaccount();
            }
            int ch;
            do {
                System.out.println("\n Bank application");
                System.out.println("1.Display all account details \n2.Search by account number\n3.Deposit the amount\n4.withdraw the amount\n5.Exit");
                System.out.println("Enter your choice:");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;
                    case 2:
                        System.out.println(("enter account number you want to search:"));
                        String account_no = sc.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(account_no);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed! account does not exist");
                        }
                        break;
                    case 3:
                        System.out.println("Enter account_no");
                        account_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(account_no);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("search failed!account does not exist");
                        }
                        break;
                    case 4:
                        System.out.println("enter account no");
                        account_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(account_no);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(("search failed!account does not exist"));
                        }
                        break;
                    case 5:
                        System.out.println("byeeee");
                        break;
                }
            } while (ch != 5);
        }
    }
}