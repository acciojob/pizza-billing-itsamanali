package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean isCheeseAdded;
    protected  boolean isToppingsAdded;
    protected  boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg){
            price+=300;
            bill+="Base Price Of The Pizza: 300"+"\n";
        }else {
            price+=400;
            bill+="Base Price Of The Pizza: 400"+"\n";
        }
        isCheeseAdded =false;
        isTakeAwayAdded=false;
        isToppingsAdded=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            isCheeseAdded = true;
            price += 80;
            bill += "Extra Cheese Added: 80"+"\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            isToppingsAdded = true;
            if(isVeg) {
                price+= 70;
                bill += "Extra Toppings For Veg Pizza = 70"+"\n";
            }else{
                price+= 120;
                bill += "Extra Toppings For Non-veg Pizza = 120"+"\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            isTakeAwayAdded=true;
            price+= 20;
            bill += "Paper bag Price = 20"+"\n";
        }
    }

    public String getBill(){
        // your code goes here
        bill+= "Total Price: "+price;
        return this.bill;
    }
}
