package com.example.abuzafarnewton.learninput;

/**
 * Created by Abu Zafar Newton on 10/6/2016.
 */

public class Account  {
    private String userName;
    private String userAccountNumber;
    private double balance;


    //Getters
    public String getUserAccountNumber() {
        return userAccountNumber;
    }
    public String getUserName() {
        return userName;
    }
    public double getBalance() {
        return balance;
    }

    //Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserAccountNumber(String userAccountNumber) {
        this.userAccountNumber = userAccountNumber;
    }


    //Default Constructor
    public Account(String userName, String userAccountNumber) {
        setUserName(userName);
        setUserAccountNumber(userAccountNumber);
    }


    public String Deposite(double ammount){
            if (ammount >=0)
            {
                this.balance+=ammount;
                return "Successfully Deposited ammount of "+this.balance+" Tk";
            }
            else
                return "Invalid Ammount";
    }

    public String Withdraw(double ammount){
        if ((balance>=ammount) && (ammount>=0)){
            this.balance-=ammount;
            return "Successfully Deducted  ammount of "+ammount+" Tk/n"+"Your remaining Balance is "+this.balance+"Tk";
        }
        else
            return "Invalid Ammount";
    }
}
