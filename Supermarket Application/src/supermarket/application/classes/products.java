
package supermarket.application;

import java.util.Date;

/**
 *
 * @author User
 */
public class products {
    private String prod;
    private Date exp;
    private int id;
    private double price;
    private double profit;
    private double exactProfit;
    private double sellPrice;
    private int quantity;

    public products(String prod, Date exp, int id, double price, double profit, double sellPrice, int quantity) {
        this.prod = prod;
        this.exp = exp;
        this.id = id;
        this.price = price;
        this.profit = profit;
        
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.exactProfit=this.sellPrice-this.price;
    }

    
    public products(String prod, Date exp, int id, double price, double sellPrice, int quantity) {
        this.prod = prod;
        this.exp = exp;
        this.id = id;
        this.price = price;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.profit=(this.sellPrice-this.price)/this.price;
        this.exactProfit=this.sellPrice-this.price;
        
    }

    public products(String prod, int id, double price, double sellPrice, int quantity) {
        this.prod = prod;
        this.id = id;
        this.price = price;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
        this.profit=(this.sellPrice-this.price)/this.price;
        this.exactProfit=this.sellPrice-this.price;
    }


    public void setProd(String prod) {
        this.prod = prod;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public void setExactProfit(double exactProfit) {
        this.exactProfit = exactProfit;
        this.sellPrice=this.price+this.exactProfit;
        this.profit=(this.sellPrice-this.price)/this.price;
    }

    public double getExactProfit() {
        return exactProfit;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
        this.profit=(this.sellPrice-this.price)/this.price;
        this.exactProfit=this.sellPrice-this.price;
        
    }

    public void setProfit(double profit) {
        this.profit = profit;
        this.sellPrice=this.price+this.price*profit;
        this.exactProfit=this.sellPrice-this.price;
        
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
        this.profit=(this.sellPrice-this.price)/this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProd() {
        return prod;
    }

    public Date getExp() {
        return exp;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getProfit() {
        return profit;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
