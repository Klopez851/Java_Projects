/* Filename: driver.java
 * Author: Lajla Husejnovic, Keidy Lopez
 * Created On: 17 Oct 2023
 */

import java.util.Arrays;
import java.util.Scanner;
public class driver {
    //returns index of account object that matches account number given, or -1 if no matching index is found
    public static int linearSearch(Account[] accounts, int accountNum) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNum() == accountNum) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(Account[] accounts, String lastname) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getLastname().equalsIgnoreCase(lastname)) {
                return i;
            }
        }
        return -1;
    }

    //makes an array 1 size smaller and copies all elements except for the element we want to remove to the new array
    public static Account[] removeIndex(Account[] accounts, int indexToRemove) {
        Account[] newAccounts = new Account[accounts.length - 1];
        for (int i = 0; i <= newAccounts.length; i++) {
            if (i < indexToRemove) {
                newAccounts[i] = accounts[i];
            } else if (i == indexToRemove) {
                if (accounts[i].getAccountType() == 's') Account.numOfSaving -= 1;
                else Account.numOfChecking -= 1;

                if (accounts[i].getPerson() == 1) Account.numOfStudents -= 1;
                else Account.numOfemployee -= 1;

                continue;
            } else if (i > indexToRemove) {
                newAccounts[i - 1] = accounts[i];
            }

        }
        return newAccounts;
    }

    //uses bubble sort algorithm to sort an array
    public static void bubbleSort(Account[] accounts) {
        for (int j = 0; j < accounts.length; j++) {
            for (int i = 1; i < accounts.length; i++) {
                if (accounts[i] == null) {
                    break;
                }
                if (accounts[i - 1].getFirstname().compareToIgnoreCase(accounts[i].getFirstname()) > 0) {
                    Account temp = accounts[i - 1];
                    accounts[i - 1] = accounts[i];
                    accounts[i] = temp;
                } else continue;
            }

        }
    }

    public static void selectionSort(Account[] accounts) {
        int len = accounts.length;

        for (int i = 0; i < len; i++) {
            int iMin = i;
            for (int j = i; j < len; j++) {
                if (accounts[j] != null && accounts[iMin] != null && accounts[j].getAccountNum() < accounts[iMin].getAccountNum()) {
                    iMin = j;
                }
            }

            Account temporary = accounts[iMin];
            accounts[iMin] = accounts[i];
            accounts[i] = temporary;
        }
    }

    public static void inserionSort(Account[] accounts) {
        for (int i = 1; i < accounts.length; i++) {
            Account key = accounts[i];
            int j = i;
            // Shift larger values to the right
            while (j > 0 && accounts[j - 1].getLastname().compareTo(key.getLastname()) > 0) {
                accounts[j] = accounts[j - 1];
                j--;
            }
            accounts[j] = key;
        }
    }

    public static int binarySearch(Account[] accounts, String lastName) {
        bubbleSort(accounts);
        int left = 0;
        int right = accounts.length - 1;

        while (left <= right) {
            int middle = (left+right) / 2;
            if (accounts[middle] != null) {
                int compareResult = lastName.compareToIgnoreCase(accounts[middle].getLastname());
                if (compareResult == 0) {
                    return middle;
                }

                if (compareResult > 0) {
                    left = middle + 1;
                }
                else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    //creates new account array of desired size and copies information of old array int new arrsy
    public static Account[] dynamicallyChange(Account[] accounts, int newSize) {
        //returns copy of array while filling spaces with null to get array to desired size
        Account[] account = Arrays.copyOf(accounts, newSize);
        return account;
    }

    public static void main(String[] args) {
        //creating variables to initiate accounts and giving them random values unless specified otherwise
        String lastname1 = "lastname1", lastname2 = "lastname2", lastname3 = "lastname3", lastname4 = "lastname4",
                lastname5 = "lastname5", lastname6 = "lastname6", lastname7 = "lastname7", lastname8 = "lastname8",
                lastname9 = "lastname9", lastname10 = "lastname10", lastname11 = "lastname11", lastname12 = "lastname12",
                lastname13 = "lastname13", lastname14 = "lastname14", lastname15 = "lastname15", firstname1 = "firstnameA",
                firstname2 = "firstnameB", firstname3 = "firstnameC", firstname4 = "firstnameD", firstname5 = "firstnameE",
                firstname6 = "firstnameF", firstname7 = "firstnameG", firstname8 = "firstnameH", firstname9 = "firstnameI",
                firstname10 = "firstnameJ", firstname11 = "firstnameK", firstname12 = "firstnameL",
                firstname13 = "firstnameM", firstname14 = "firstnameN", firstname15 = "firstnameO";
        char female = 'F', male = 'M';
        int dob1 = 10011001, dob2 = 22222222, dob3 = 33333333, dob4 = 44444444, dob5 = 55555555, dob6 = 6666666, dob7 = 77777777,
                dob8 = 88888888, dob9 = 99999999, dob10 = 10101010, dob11 = 11111111, dob12 = 12121212, dob13 = 13131313,
                dob14 = 14141414, dob15 = 15151515, option, arraySize = 15;
        char accountType1 = 's', accountType2 = 'c';
        int person1 = 1, person2 = 2, person3 = 3;
        double balance = 5.00;
        boolean flag = true;
        Account[] accounts = new Account[arraySize];
        Scanner cin = new Scanner(System.in);

        //creating student, staff, and faculty accounts with previous created variables
        Account studentAccount1 = new Account(lastname1, firstname1, female, dob1, accountType2, person1, balance);
        Account studentAccount2 = new Account(lastname2, firstname2, male, dob2, accountType2, person1);
        Account studentAccount3 = new Account(lastname3, firstname3, female, dob3, accountType2, person1);
        Account studentAccount4 = new Account(lastname4, firstname4, male, dob4, accountType1, person1, balance);
        Account studentAccount5 = new Account(lastname5, firstname5, female, dob5, accountType1, person1);
        Account facultyAccount1 = new Account(lastname6, firstname6, female, dob6, accountType2, person2, balance);
        Account facultyAccount2 = new Account(lastname7, firstname7, male, dob7, accountType2, person2);
        Account facultyAccount3 = new Account(lastname8, firstname8, female, dob8, accountType2, person2);
        Account facultyAccount4 = new Account(lastname9, firstname9, male, dob9, accountType1, person2, balance);
        Account facultyAccount5 = new Account(lastname10, firstname10, female, dob10, accountType1, person2);
        Account staffAccount1 = new Account(lastname11, firstname11, male, dob11, accountType2, person3, balance);
        Account staffAccount2 = new Account(lastname12, firstname12, female, dob12, accountType2, person3, balance);
        Account staffAccount3 = new Account(lastname13, firstname13, male, dob13, accountType2, person3);
        Account staffAccount4 = new Account(lastname14, firstname14, female, dob14, accountType1, person3, balance);
        Account staffAccount5 = new Account(lastname15, firstname15, male, dob15, accountType1, person3);

        //populating accounts array with previously created account objects
        accounts[1] = studentAccount1;
        accounts[0] = studentAccount2;
        accounts[3] = studentAccount3;
        accounts[2] = studentAccount4;
        accounts[4] = studentAccount5;

        accounts[5] = facultyAccount1;
        accounts[7] = facultyAccount2;
        accounts[6] = facultyAccount3;
        accounts[8] = facultyAccount4;
        accounts[10] = facultyAccount5;

        accounts[9] = staffAccount1;
        accounts[14] = staffAccount2;
        accounts[12] = staffAccount3;
        accounts[13] = staffAccount4;
        accounts[11] = staffAccount5;

        //program loop
        while (flag) {
            //displays options and validates input
            do {
                System.out.println("\nMENU\n");
                System.out.println("1. Display all accounts");
                System.out.println("2. Total number of accounts");
                System.out.println("3. Open an account with some initial deposit");
                System.out.println("4. Open an account with no deposit");
                System.out.println("5. Add interest to all accounts");
                System.out.println("6. Display all student account whose balance is less than $100");
                System.out.println("7. Display all employee accounts where balance is more than $5,000");
                System.out.println("8. Linear search an account by last name");
                System.out.println("9. Display all saving accounts sorted");
                System.out.println("10. Display sorted list of all accounts by account number");
                System.out.println("11. Binary search an account by last name");
                System.out.println("12. Exit");
                System.out.print("\nEnter the number corresponding to the action you'd like to take: ");
                option = cin.nextInt();

                if (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 &&
                        option != 8 && option != 9 && option != 10 && option != 11 && option != 12) {
                    System.out.println("\nInvalid option, try again.\n");
                }
            } while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 &&
                    option != 8 && option != 9 && option != 10 && option != 11 && option != 12);

            switch (option) {
                case 1:
                    //displays all accounts
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) {
                            System.out.println("\n" + accounts[i].display() + "\n");
                        } else break;
                    }
                    break;

                case 2:
                    // total number of accounts
                    boolean flag1 = true;
                    while (flag1) {
                        int submenu2;
                        do {
                            System.out.println("1. Total number of accounts");
                            System.out.println("2. Number of saving accounts");
                            System.out.println("3. Number of checking accounts");
                            System.out.println("4. Number of student accounts");
                            System.out.println("5. Number of employee accounts");
                            System.out.println("6. Back to main menu");
                            System.out.print("Enter the number corresponding to the action you'd like to take: ");
                            submenu2 = cin.nextInt();

                            if (submenu2 != 1 && submenu2 != 2 && submenu2 != 3 && submenu2 != 4 && submenu2 != 5 && submenu2 != 6) {
                                System.out.println("Invalid option, try again.\n");
                            }
                        } while (submenu2 != 1 && submenu2 != 2 && submenu2 != 3 && submenu2 != 4 && submenu2 != 5 && submenu2 != 6);

                        switch (submenu2) {
                            case 1:
                                //displays total number of accounts
                                System.out.println("Total number of accounts: " + accounts[0].sumOfAllAccounts() + "\n");
                                break;
                            case 2:
                                //displays number of saving accounts
                                System.out.println("Number of Savings accounts: " + Account.numOfSaving + "\n");
                                break;
                            case 3:
                                //displays numbers of checcking accounts
                                System.out.println("Number of Checking accounts: " + Account.numOfChecking + "\n");
                                break;
                            case 4:
                                //displays number of student accounts
                                System.out.println("Number of Student Accounts: " + Account.numOfStudents + "\n");
                                break;
                            case 5:
                                //displays number of employee accounts
                                System.out.println("Number of Employee accounts: " + Account.numOfemployee + "\n");
                                break;
                            case 6:
                                //breaks out of submenu
                                System.out.print("Bringing you back to the main menu. . .\n");
                                flag1 = false;
                                break;
                            default:
                                System.out.println("No action corresponds with that number. Try again.\n");
                        }
                    }
                    break;

                case 3:
                    // open an account with some initial deposit
                    System.out.println("Enter the requested information to open an account.\n");

                    System.out.print("Last name: ");
                    String lastnameNew = cin.next();

                    System.out.print("First name: ");
                    String firstnameNew = cin.next();

                    char genderNew;
                    do {
                        System.out.print("Gender (F or M): ");
                        genderNew = cin.next().charAt(0);
                        if (genderNew != 'F' && genderNew != 'M') {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (genderNew != 'F' && genderNew != 'M');

                    System.out.println("Date of Birth(mmddyyyy): ");
                    int dobNew = cin.nextInt();

                    char accountTypeNew;
                    do {
                        System.out.println("Account Type (s or c): ");
                        accountTypeNew = cin.next().charAt(0);
                        if (accountTypeNew != 's' && accountTypeNew != 'c') {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (accountTypeNew != 's' && accountTypeNew != 'c');

                    int personTypeNew;
                    do {
                        System.out.print("Person (1 = Student, 2 = Faculty, 3 = Staff): ");
                        personTypeNew = cin.nextInt();
                        if (personTypeNew != 1 && personTypeNew != 2 && personTypeNew != 3) {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (personTypeNew != 1 && personTypeNew != 2 && personTypeNew != 3);

                    System.out.println("Enter initial deposit amount: ");
                    double balanceNew = cin.nextDouble();
                    Account createdAccountInitial = new Account(lastnameNew, firstnameNew, genderNew, dobNew,
                            accountTypeNew, personTypeNew, balanceNew);

                    // checks if there is space in array to add account, if not then array size is doubled, and account
                    // is added after
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = createdAccountInitial;
                            System.out.println("Account successfully created!\n");
                            break;
                        } else if (i == (accounts.length - 1) && accounts[i] != null) {
                            accounts = dynamicallyChange(accounts, accounts.length * 2);
                            accounts[i + 1] = createdAccountInitial;
                            for(int x=0; x<accounts.length;x++){
                                if(accounts[x]!=null) {
                                    System.out.println(accounts[x].display());
                                }
                                else break;
                            }
                            System.out.println("Account successfully created!\n");
                            break;
                        }
                    }
                    break;

                case 4:
                    // open an account with no deposit
                    System.out.println("Enter the requested information to open an account.\n");
                    System.out.print("Last name: ");
                    String lastnameNew2 = cin.next();
                    System.out.print("First name:");
                    String firstnameNew2 = cin.next();

                    char genderNew2;
                    do {
                        System.out.print("Gender (F or M): ");
                        genderNew2 = cin.next().charAt(0);
                        if (genderNew2 != 'F' && genderNew2 != 'M') {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (genderNew2 != 'F' && genderNew2 != 'M');

                    System.out.println("Date of Birth(mmddyyyy): ");
                    int dobNew2 = cin.nextInt();

                    char accountTypeNew2;
                    do {
                        System.out.println("Account Type (s or c): ");
                        accountTypeNew2 = cin.next().charAt(0);
                        if (accountTypeNew2 != 's' && accountTypeNew2 != 'c') {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (accountTypeNew2 != 's' && accountTypeNew2 != 'c');

                    int personTypeNew2;
                    do {
                        System.out.print("Person (1 = Student, 2 = Faculty, 3 = Staff): ");
                        personTypeNew2 = cin.nextInt();
                        if (personTypeNew2 != 1 && personTypeNew2 != 2 && personTypeNew2 != 3) {
                            System.out.println("Invalid option, try again.\n");
                        }
                    } while (personTypeNew2 != 1 && personTypeNew2 != 2 && personTypeNew2 != 3);

                    Account createdAccount = new Account(lastnameNew2, firstnameNew2, genderNew2, dobNew2, accountTypeNew2, personTypeNew2);
                    // checks if there is space in array to add account, if not then array size is doubled, and account
                    // is added after
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            accounts[i] = createdAccount;
                            System.out.println("Account Successfully Created!\n");
                            break;
                        } else if (i == (accounts.length - 1) && accounts[i] != null) {
                            accounts = dynamicallyChange(accounts, accounts.length * 2);
                            accounts[i + 1] = createdAccount;
                            System.out.println("Account Successfully Created!\n");
                            break;
                        }
                    }
                    break;

                case 5:
                    //adds interest to ALL accounts
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) {
                            accounts[i].interest();
                        } else break;

                    }
                    System.out.println("Interest successfully added.\n");
                    break;

                case 6:
                    // Display all student account whose balance is less than $500
                    int count = 0;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            break;
                        }
                        if (accounts[i].getPerson() == 1) {
                            if (accounts[i].getBalance() < 100.00) {
                                if (accounts[i].getChecked()==false) {
                                    accounts[i].setBalance(accounts[i].getBalance() - 5.00);
                                    accounts[i].setChecked(true);
                                    System.out.println(accounts[i].getFirstname() + " " + accounts[i].getLastname() + "\n");
                                    count += 1;
                                }
                                else {
                                    accounts[i].setBalance(accounts[i].getBalance());
                                    System.out.println(accounts[i].getFirstname() + " " + accounts[i].getLastname() + "\n");
                                    count += 1;
                                }
                            }
                        }
                    }
                    if (count == 0) System.out.println("No student found.\n");
                    break;

                case 7:
                    // Display all employee accounts where balance is more than $5,000
                    int count1 = 0;
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            break;
                        }
                        if (accounts[i].getPerson() == 2 || accounts[i].getPerson() == 3) {
                            if (accounts[i].getBalance() > 5000.00) {
                                System.out.println(accounts[i].getFirstname() + " " + accounts[i].getLastname());
                                count1 += 1;
                            }

                        }
                    }
                    if (count1 == 0) System.out.println("No employee found.\n");
                    break;

                case 8:
                    // Display account information - linear search last name
                    int submenu8, accountIndex;
                    String holderLast;
                    long startTime = System.currentTimeMillis();
                    do {
                        System.out.print("Enter account holder's last name: ");
                        holderLast = cin.next();

                        accountIndex = linearSearch(accounts, holderLast);
                        if (accountIndex == -1) System.out.print("Account not found.\n");
                    } while (accountIndex == -1);
                    long endTime = System.currentTimeMillis();
                    System.out.println("Time taken to do the linear search: " + (endTime - startTime) + "milliseconds");
                    boolean flag2 = true;
                    while (flag2) {
                        do {
                            System.out.println("1. Check balance");
                            System.out.println("2. Withdraw money");
                            System.out.println("3. Deposit money");
                            System.out.println("4. Add interest");
                            System.out.println("5. Close the account");
                            System.out.println("6. Back to main menu");
                            System.out.print("\nEnter the number corresponding to the action you'd like to take: ");
                            submenu8 = cin.nextInt();

                            if (submenu8 != 1 && submenu8 != 2 && submenu8 != 3 && submenu8 != 4 && submenu8 != 5 && submenu8 != 6) {
                                System.out.println("Invalid option, try again.\n");
                            }
                        } while (submenu8 != 1 && submenu8 != 2 && submenu8 != 3 && submenu8 != 4 && submenu8 != 5 && submenu8 != 6);
                        switch (submenu8) {
                            case 1:
                                // checks account's balance
                                System.out.println("Account's balance is: " + accounts[accountIndex].getBalance() + "\n");
                                break;

                            case 2:
                                // withdraws money from account
                                double amount1;
                                System.out.println("Amount: ");
                                amount1 = cin.nextDouble();
                                accounts[accountIndex].withdraw(amount1 + 1.00);
                                System.out.println(amount1 + " withdrawn from your account.\n");
                                break;

                            case 3:
                                // deposits money into account
                                double amount;
                                System.out.println("Amount: ");
                                amount = cin.nextDouble();
                                accounts[accountIndex].deposit(amount);
                                System.out.println(amount + " deposited into your account.\n");
                                break;

                            case 4:
                                // adds interest to account
                                accounts[accountIndex].interest();
                                System.out.println("Interest successfully added.\n");
                                break;

                            case 5:
                                // closes account
                                accounts = removeIndex(accounts, accountIndex);
                                System.out.println("Your account has been closed. Bringing you back to main menu.\n");
                                flag2 = false;
                                break;

                            case 6:
                                //breaks out of submenu
                                System.out.println("Bringing you back to the main menu. . .\n");
                                flag2 = false;
                                break;

                            default:
                                System.out.println("No action corresponds with that number. Try again.\n");
                        }
                    }
                    break;

                case 9:
                    // Display savings accounts using bubble sort
                    startTime = System.currentTimeMillis();
                    bubbleSort(accounts);
                    endTime = System.currentTimeMillis();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            break;
                        }
                        if (accounts[i].getAccountType() == 's') {
                            System.out.println(accounts[i].getFirstname());
                        } else continue;
                    }
                    System.out.println("Time taken to sort: " + (endTime - startTime) + " milliseconds.");
                    break;

                case 10:
                    // display sorted list of all accounts by account number using selection sort
                    startTime = System.currentTimeMillis();
                    selectionSort(accounts);
                    endTime = System.currentTimeMillis();
                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i] != null) {
                            System.out.println("\n" + accounts[i].display() + "\n");
                        } else break;
                    }
                    System.out.println("Time taken to do selection sort: " + (endTime - startTime) + " milliseconds.");
                    break;

                case 11:
                    // binary search an account by last name
                    int submenu11, accountIndex11;
                    String holderLast11;
                    do {
                        System.out.print("Enter account holder's last name: ");
                        holderLast11 = cin.next();
                        startTime = System.currentTimeMillis();
                        accountIndex11 = binarySearch(accounts, holderLast11);
                        endTime = System.currentTimeMillis();
                        if (accountIndex11 == -1) System.out.print("Account not found.\n");
                    } while (accountIndex11 == -1);
                    System.out.println("Time taken to do binary search: " + (endTime - startTime) + " milliseconds.");

                    boolean flag11 = true;
                    while (flag11) {
                        do {
                            System.out.println("1. Check balance");
                            System.out.println("2. Withdraw money");
                            System.out.println("3. Deposit money");
                            System.out.println("4. Change last name");
                            System.out.println("5. Change account type");
                            System.out.println("6. Close (delete) the account");
                            System.out.println("7. Back to main menu");
                            System.out.print("\nEnter the number corresponding to the action you'd like to take: ");
                            submenu11 = cin.nextInt();

                            if (submenu11 != 1 && submenu11 != 2 && submenu11 != 3 && submenu11 != 4 && submenu11 != 5 && submenu11 != 6 && submenu11 != 7) {
                                System.out.println("Invalid option, try again.\n");
                            }
                        } while (submenu11 != 1 && submenu11 != 2 && submenu11 != 3 && submenu11 != 4 && submenu11 != 5 && submenu11 != 6 && submenu11 != 7);

                        switch (submenu11) {
                            case 1:
                                // checks account's balance
                                System.out.println("Account's balance is: " + accounts[accountIndex11].getBalance() + "\n");
                                break;

                            case 2:
                                // withdraws money from account
                                double amount1;
                                System.out.println("Amount: ");
                                amount1 = cin.nextDouble();
                                accounts[accountIndex11].withdraw(amount1 + 1.00);
                                System.out.println(amount1 + " withdrawn from your account.\n");
                                break;

                            case 3:
                                // deposits money into account
                                double amount;
                                System.out.println("Amount: ");
                                amount = cin.nextDouble();
                                accounts[accountIndex11].deposit(amount);
                                System.out.println(amount + " deposited into your account.\n");
                                break;

                            case 4:
                                // changes holder's last name
                                String changeLast;
                                System.out.print("New last name: ");
                                changeLast = cin.next();
                                accounts[accountIndex11].setLastname(changeLast);
                                System.out.println("Account holder's last name has been changed to: " + changeLast);
                                break;

                            case 5:
                                // changes account type
                                char accountTypeNew5;
                                do {
                                    System.out.println("Account Type (s or c): ");
                                    accountTypeNew5 = cin.next().charAt(0);
                                    if (accountTypeNew5 != 's' && accountTypeNew5 != 'c') {
                                        System.out.println("Invalid option, try again.\n");
                                    }
                                } while (accountTypeNew5 != 's' && accountTypeNew5 != 'c');
                                accounts[accountIndex11].setAccountType(accountTypeNew5);
                                if (accountTypeNew5 == 's') {
                                    System.out.println("Account type has been changed to savings.");
                                }
                                else {
                                    System.out.println("Account type has been changed to checking.");
                                }

                            case 6:
                                // delete account
                                accounts = removeIndex(accounts, accountIndex11);
                                System.out.println("Your account has been closed. Bringing you back to main menu.\n");
                                flag2 = false;
                                break;

                            case 7:
                                // back to main menu
                                System.out.println("Bringing you back to the main menu. . .\n");
                                flag11 = false;
                                break;

                            default:
                                System.out.println("No action corresponds with that number. Try again.\n");
                        }
                    }
                    break;

                case 12:
                    //stops program
                    System.out.print("Thank you for banking with Bank Of Saint Anselm!");
                    flag = false;
                    System.exit(0);
                    break;

                default:
                    System.out.print("No Matching Case.\n");
            }
        }
    }
}