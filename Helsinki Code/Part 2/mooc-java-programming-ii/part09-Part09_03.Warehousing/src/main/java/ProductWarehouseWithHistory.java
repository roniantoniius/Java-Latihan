/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }
    public String history(){
        return this.history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(getBalance()); // sekalian masukin ke history untuk lacak
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        if (super.getBalance() < amount){
            this.history.add(super.getBalance());
            return super.getBalance();
        }
        
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        
        return super.getBalance();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\n" + 
                           "History: " + history() + "\n" + 
                           "Largest amount of product: " + this.history.maxValue() + "\n" + 
                           "Smallest amount of product: " + this.history.minValue() + "\n" + 
                           "Average: " + this.history.average());
    }
    
}