package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private Date createdDate;

    protected Portfolio() {}

    public Portfolio(Client client, String portfolioName, Date createdDate) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
