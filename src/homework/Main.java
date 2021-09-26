package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Author is Nguyễn Hoàng Duy - C0821H1");
        System.out.println("Manager of Material list");
        MaterialManager materialManager = new MaterialManager();
        Material crispyFlour1 = new CrispyFlour("C01", "Aji-Quick", LocalDate.of(2020, 12, 2), 120000, 22);
        Material crispyFlour2 = new CrispyFlour("C02", "Miwon", LocalDate.of(2020, 12, 7), 60000, 40);
        Material crispyFlour3 = new CrispyFlour("C03", "Bích Chi", LocalDate.of(2021, 2, 2), 4000, 12);
        Material crispyFlour4 = new CrispyFlour("C04", "Ve-dan", LocalDate.of(2021, 6, 2), 15000, 10);
        Material crispyFlour5 = new CrispyFlour("C05", "Mikko", LocalDate.of(2021, 3, 12), 8000, 25);

        Material meat1 = new Meat("M01", "Pork", LocalDate.of(2021, 9, 23), 18000, 3);
        Material meat2 = new Meat("M02", "Chicken", LocalDate.of(2021, 9, 22), 12000, 5);
        Material meat3 = new Meat("M03", "Beef", LocalDate.of(2021, 9, 25), 30000, 4);
        Material meat4 = new Meat("M04", "Lamb", LocalDate.of(2021, 9, 26), 32000, 12);
        Material meat5 = new Meat("M05", "Fish", LocalDate.of(2021, 9, 21), 15000, 22);

        List<Material> materialList = new ArrayList<>();
        materialManager.setMaterialList(materialList);
        System.out.println("Add material to list");
        materialManager.addMaterial(crispyFlour1);
        materialManager.addMaterial(crispyFlour2);
        materialManager.addMaterial(crispyFlour3);
        materialManager.addMaterial(crispyFlour4);
        materialManager.addMaterial(crispyFlour5);
        materialManager.addMaterial(meat1);
        materialManager.addMaterial(meat2);
        materialManager.addMaterial(meat3);
        materialManager.addMaterial(meat4);
        materialManager.addMaterial(meat5);
        System.out.println("The list of Material: ");
       materialManager.displayMaterial();
        System.out.println("check price of meat1");
        System.out.println(((Meat) meat1).getExpiryDate());
        System.out.println(((Meat)((Meat) meat1)).getRealMoney());
        System.out.println("Tổng tiền chưa discount");
        System.out.println(materialManager.sumAmountMaterial());
        System.out.println("tổng tiền đã điscount");
        System.out.println(materialManager.sumDiscount());
        System.out.println("Tiền chênh lệch ngày hôm nay");
        System.out.println(materialManager.sumAmountMaterial() - materialManager.sumDiscount());

        materialManager.removeMaterial(meat1);
        materialManager.displayMaterial();

        System.out.println("Fix list of Material:");
        materialManager.fixMaterial();

    }

}
