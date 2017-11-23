package model;

import java.time.LocalDate;

public class Outcome {
    private long id;
    private String type;
    private String description;
    private double amount;
    private LocalDate data;

    public Outcome(long id, String type, String description, double amount, LocalDate data) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.data = data;
    }

    public Outcome(String type, String description, double amount, LocalDate data) {
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.data = data;
    }

    public Outcome() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Outcome{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", data=" + data +
                '}';
    }
}
