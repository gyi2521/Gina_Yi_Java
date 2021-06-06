package com.company;

public class CustomerComposition {
    public static void main(String[] args) {

        Customer account = new Customer();
        account.setFirstName("Gina");
        account.setLastName("Yi");
        account.setEmail("gy@gmail.com");
        account.setPhoneNumber("404-222-3333");
        account.setRewardsMember(true);

        Address shippingAddress = new Address();
        shippingAddress.setStreet1("2232 Lincoln Blvd.");
        shippingAddress.setStreet2("Suite 232");
        shippingAddress.setCity("Dunwoody");
        shippingAddress.setState("GA");
        shippingAddress.setZip("30022");

        account.setShippigAddress(shippingAddress);

        Address billingAddress = new Address();
        billingAddress.setStreet1("1142 Montreal Rd");
        billingAddress.setStreet2("Suite 543");
        billingAddress.setCity("Atlanta");
        billingAddress.setState("GA");
        billingAddress.setZip("30318");

        account.setBillingAddress(billingAddress);

        System.out.println("Customer Name: " + account.getFirstName() + " " + account.getLastName());
        System.out.println("Email Address: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Shipping Address: " + account.getShippigAddress());
        System.out.println("Billing Address: " + account.getBillingAddress());
        System.out.println("Rewards member? " + account.getRewardsMember());


    }
}
