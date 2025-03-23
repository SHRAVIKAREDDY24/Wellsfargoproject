package com.yourpackage.entities;

public class Client {

    private Long id;

    
    private String name;

   
    private String email;

   
    private String phoneNumber;

   
    private FinancialAdvisor advisor;

    private Portfolio portfolio;

    public Client() {}

    public Client(String name, String email, String phoneNumber, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.advisor = advisor;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public FinancialAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
