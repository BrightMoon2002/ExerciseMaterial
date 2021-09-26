package homework;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                "} " + super.toString();
    }

    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);

    }
    public double getRealMoney() {
        LocalDate now2 = LocalDate.now();
        if(getExpiryDate().equals(now2.plusDays(3)) || getExpiryDate().isBefore(now2.plusDays(5))) {
            return getAmount() * 70/100;
        } else if (getExpiryDate().equals(now2.plusMonths(5)) || getExpiryDate().isBefore(now2.plusMonths(5))) {
            return getAmount() * 50/100;
        } else {
            return getAmount() * 90/100;
        }
    }
}
