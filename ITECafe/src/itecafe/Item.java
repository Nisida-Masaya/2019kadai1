/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

/**
 *
 * @author kbc19a25
 */
public class Item {
    private int No;
    private String name;
    private int price;  

    public Item(int No, String name, int price) {
        this.No = No;
        this.name = name;
        this.price = price;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
