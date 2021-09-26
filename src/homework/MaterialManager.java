package homework;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MaterialManager {
    private List<Material> materialList;

    public MaterialManager() {
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }

    public void displayMaterial() {
        System.out.println("List of Material is: ");
        for (Material material: materialList
             ) {
            System.out.println(material);
        }
    }
    public void addMaterial(Material material) {
        materialList.add(material);
    }

    public void removeMaterial(Material material) {
        materialList.remove(material);
    }

    public double sumAmountMaterial () {
        double sumAmount = 0;
        for (Material material : materialList
        ) {
            sumAmount = sumAmount + material.getAmount();
        }
        return sumAmount;
    }

    public double sumDiscount() {
        double sumDiscount1 = 0;
        double sumDiscount2 = 0;
        for (Material material: materialList
             ) {
            if (material instanceof Meat) {
                sumDiscount1 = sumDiscount1 + ((Meat)material).getRealMoney();
            }else {
                sumDiscount2 = sumDiscount2 + ((CrispyFlour)material).getRealMoney();
            }

        }
        return sumDiscount1 + sumDiscount2;
    }

    public void fixMaterial() {
        System.out.println("Enter index of material which you want to change: ");
        Scanner inputIndex = new Scanner(System.in);
        int index = inputIndex.nextInt();
        System.out.println("Menu:");
        System.out.println("1. Id");
        System.out.println("2. name");
        System.out.println("3. ManufacturingDate");
        System.out.println("4. cost");
        System.out.println("5. quantity/weight");
        int c = -1;
        while (c != 0) {
            Scanner inputChoice = new Scanner(System.in);
            int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the id you want to change:");
                    Scanner newId = new Scanner(System.in);
                    String nId = newId.nextLine();
                    materialList.get(index).setId(nId);
                    break;
                case 2:
                    System.out.println("Enter the id you want to change:");
                    Scanner newName = new Scanner(System.in);
                    String nName = newName.nextLine();
                    materialList.get(index).setName(nName);
                    break;
                case 3:
                    System.out.println("Enter the ManufacturingDate  you want to change: ");
                    System.out.println("Enter the year:");
                    Scanner year = new Scanner(System.in);
                    int nYear = year.nextInt();
                    System.out.println("Enter the Month:");
                    Scanner month = new Scanner(System.in);
                    int nMonth = month.nextInt();
                    System.out.println("Enter the day:");
                    Scanner day = new Scanner(System.in);
                    int nDay = day.nextInt();

                    Scanner newDate = new Scanner(System.in);
                    materialList.get(index).setManufacturingDate(LocalDate.of(nYear, nMonth, nDay));
                    break;
                case 4:
                    System.out.println("Enter the cost you want to change: ");
                    Scanner newCost = new Scanner(System.in);
                    int nCost = newCost.nextInt();
                    materialList.get(index).setCost(nCost);
                    break;
                case 5:
                    System.out.println("Enter the quantity or weight u want to change");
                    Scanner newNumber = new Scanner(System.in);
                    int nNumber = newNumber.nextInt();
                    if (materialList.get(index) instanceof Meat) {
                        ((Meat)materialList.get(index)).setWeight(nNumber);
                    } else {
                        ((CrispyFlour)materialList.get(index)).setQuantity(nNumber);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("The number you choose is not support, choose again");
                    break;
            }
            displayMaterial();
        }


    }
    }

