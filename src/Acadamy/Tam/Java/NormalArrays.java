package Acadamy.Tam.Java;

import java.util.ArrayList;

public class NormalArrays {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printArrayListIteams() {
        System.out.println("Total List Size# " + groceryList.size());
        if (groceryList.size() > 0) {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((1 + i) + "." + groceryList.get(i));
            }
        } else {
            System.out.println("there are not items to be printed.");
        }
    }

    public void addArrayItem(String iteam) {
        groceryList.add(iteam);
        System.out.println("Added# " + iteam + "At Position# " + groceryList.indexOf(iteam));
    }

    public void removeArrayItem(int position) {
        System.out.println("iteam removed# " + groceryList.get(position));
        groceryList.remove(position);
    }

    public void removeArrayItem(String itemName) {
        if (itemExists(itemName) >= 0) {
            System.out.println("iteam removed# " + groceryList.get(itemExists(itemName)));
            groceryList.remove(itemExists(itemName));
        }
    }

    public void findByItem(String item) {
        if (itemExists(item) > 0) {
            System.out.println("item founded# " + groceryList.get(itemExists(item)) +
                    "At postion#  " + (groceryList.indexOf(item) + 1));
        } else {
            System.out.println("item not found# " + item);
        }
    }

    private void modifyGroceryItem(int position, String itemName) {
        groceryList.set(position, itemName);
        System.out.println("Grocery Item# " + (position + 1) + "has been added");
    }

    public void modifyGroceryItem(String olditem, String itemName) {
        if (itemExists(olditem) >= 0) {
            int oldItemPostion = itemExists(olditem);
            groceryList.set(itemExists(olditem), itemName);
            System.out.println("Grocery Item# " + (olditem + 1) + " has been added");
        } else {
            System.out.println("item not found.");
        }
    }

    private int itemExists(String item) {
        return groceryList.indexOf(item);
    }

}
