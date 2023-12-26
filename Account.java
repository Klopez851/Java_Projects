/* Filename: Account.java
 * Author: Lajla Husejnovic, Keidy Lopez
 * Created On: 16 Nov 2023
 * Purpose:
 * Notes:
 */

import java.util.Random;

public class Account {
    //=============//
    //  VARIABLES  //
    //=============//

    private String lastname;
    private String firstname;
    private char sex;
    private int dob;
    private int SSN;
    private int accountNum;
    private char accountType;
    private int person;
    private double balance;
    private boolean visited = false;
    private static final double rate = 0.05;
    public static int numOfChecking=0,numOfSaving=0,numOfStudents=0,numOfemployee=0;

    //================//
    //  CONSTRUCTORS  //
    //================//

    // Constructor when an account is opened with an initial balance.
    public Account(String lastname, String firstname, char sex, int dob, char accountType, int person, double balance) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.dob = dob;
        this.SSN = randomSSN();
        this.accountNum = randomAccountNum();
        this.accountType = accountType;
        this.person = person;
        this.balance = balance;
        updateAccountCount();
    }

    // Constructor when an account is opened without an initial balance.
    public Account(String lastname, String firstname, char sex, int dob, char accountType, int person) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.dob = dob;
        this.SSN = randomSSN();
        this.accountNum = randomAccountNum();
        this.accountType = accountType;
        this.person = person;
        this.balance = 0.00;
        updateAccountCount();
    }

    //=======================//
    //  GETTERS AND SETTERS  //
    //=======================//

    public String getLastname() {
            return lastname;
    }
    public void setLastname(String newLastName) {
        lastname = newLastName;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String newFirstName) {
        firstname = newFirstName;
    }

    public char getSex() {
        return sex;
    }
    public void setSex(char s) {
        sex = s;
    }

    public int getDob() {
        return dob;
    }
    public void setDob(int newDob) {
        dob = newDob;
    }

    public int getSSN() {
        return SSN;
    }
    public void setSSN(int newSSN) {
        SSN = newSSN;
    }

    public int getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(int newAccountNum) {
        accountNum = newAccountNum;
    }

    public char getAccountType() {
        return accountType;
    }
    public void setAccountType(char newType) {
        accountType = newType;
    }

    public int getPerson() {
        return person;
    }
    public void setPerson(int newPerson) {
        person = newPerson;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public boolean getChecked(){
        return visited;
    }
    public void setChecked(boolean status){
        visited= status;
    }

    //==================//
    //  PUBLIC METHODS  //
    //==================//

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - (withdrawAmount+1);
            System.out.println("Withdrawal was a success");
        }
        else {
            System.out.println("Sorry, your balance is only " + getBalance());
        }
    }

    public void interest() {
        double interestAmount = balance * rate;
        balance = balance + interestAmount;
    }

    public String display() {
        return "Account Information:\nLastname: " + getLastname() + "\nFirstname: " + getFirstname() + "\nSex: " + getSex() + "\nDOB: " +
                getDob() + "\nSSN (Last 4 Digits): " + getLast4SSN() + "\nAccount Number: " + getAccountNum() + "\nAccount Type: " +
                getAccountType() + "\nPerson: " + getPosition() + "\nBalance: $" + getBalance();
    }

    public int sumOfAllAccounts(){
        return (numOfemployee+numOfStudents);
    }

    //===================//
    //  PRIVATE METHODS  //
    //===================//

    private int randomSSN() {
        Random random = new Random();
        return random.nextInt(899999999) + 100000000;
    }

    private int randomAccountNum() {
        Random random = new Random();
        return random.nextInt(899999999) + 100000000;
    }

    private String getLast4SSN(){
        int ssn = getSSN();
        return(Integer.toString(ssn).substring(5,9));
    }

    private void updateAccountCount(){
        if (this.accountType == 'c')numOfChecking+=1;
        else if (this.accountType == 's')numOfSaving+=1;
        if(this.person == 1)numOfStudents+=1;
        else if (this.person == 2 || this.person == 3)numOfemployee+=1;
    }

    private String getPosition(){
        if(this.person == 1)return "Student";
        else if (this.person == 2) return "staff";
        return "faculty";
    }
}