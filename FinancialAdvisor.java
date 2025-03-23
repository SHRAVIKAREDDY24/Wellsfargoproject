package com.yourpackage.entities;

import java.util.List;

public class FinancialAdvisor {

    private Long id;

    
    private String name;

    
    private String email;

    private String password;


    private List<Client> clients;

    public FinancialAdvisor(List<Client> clients) {
        this.clients = clients;
    }

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
