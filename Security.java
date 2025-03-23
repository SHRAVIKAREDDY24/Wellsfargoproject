package com.yourpackage.entities;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Security {


    private Long id;

   
    
    private Portfolio portfolio;

    private String name;

    
    private String category;

    
    private LocalDate purchaseDate;

    
    private BigDecimal purchasePrice;

    private int quantity;

    public Security() {}

    public Security(Portfolio portfolio, String name, String category, LocalDate purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getId() { return id; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }
    public BigDecimal getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(BigDecimal purchasePrice) { this.purchasePrice = purchasePrice; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}

