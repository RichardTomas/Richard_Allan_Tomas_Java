package com.company;

// based on class activity on Sept. 28 (Wed)
public class Accounts {
    public static void main(String[] args) {

//      Address for account1
        Address addressToShipTo = new Address("7419 Sierra Lane", "Unit 224", "Pikesville", "MD", "21208");
        Address addressToBill = new Address("14 Cemetery Ave", "Apt 44", "Fresh Meadows", "NY", "11365");

//      Address for account2
        Address anotherAddressToShipTo = new Address("17 Indian Spring Dr", "Suite 10", "Livingston", "NJ", "07039");
        Address anotherAddressToBill = new Address("136 Pineknoll Street", "Apt 23", "Prattville", "AL", "36067");

//      Customer constructors
        Customer account1 = new Customer("Johnnie", "Warren", "jwarren@msn.com", "718-709-1118", addressToShipTo, addressToBill, true);
        Customer account2 = new Customer("Walter", "Guerrero", "wguerrero@hotmail.com", "616-562-2008", anotherAddressToShipTo, anotherAddressToBill, false);
        System.out.println(account1);
        System.out.println(account2);
    }
}
