package com.yourpackage.entities;


import java.security.Security;
import java.util.List;


public class Portfolio {


    private Long id;

    private Client client;

   
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getId() { return id; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public List<Security> getSecurities() { return securities; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}
