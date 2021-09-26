package homework;

import java.time.LocalDate;
import java.util.Date;

public class CrispyFlour extends Material implements Discount{
    private int quantity;


    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, int cost, int quantity) {
        super(id, name, cost);
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    public LocalDate getExpiryDate() {
       return getManufacturingDate().plusYears(1);
    }

    public double getRealMoney() {
        LocalDate now =  LocalDate.now();
        if(getExpiryDate().equals(now.plusMonths(2)) || getExpiryDate().isBefore(now.plusMonths(4))) {
            return getAmount() * 80/100;
        } else if (getExpiryDate().equals(now.plusMonths(4)) || getExpiryDate().isBefore(now.plusMonths(4))) {
            return getAmount() * 60/100;
        } else {
            return getAmount() * 95/100;
        }

    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                "} " + super.toString();
    }
}
