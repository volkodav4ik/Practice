package com.volkodav4ik;

public class BankAccount {

    private String name;
    private double count;
    private static double comission = 0;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public void add(double money) {
        count = money * 0.995;
        comission += money * 0.005;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public void transfer(BankAccount otherPerson, double money) {
        setCount(count - money);
        otherPerson.setCount(money * 0.99);
        comission += money * 0.01;
    }

    public static double getComission() {
        return comission;
    }

    @Override
    public String toString() {
        return "Имя пользователя: " + name +
                "   денег на счету: " + count;
    }
}
