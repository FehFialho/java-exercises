package br.com.fehfito.java.exercises.sales;

public class Product implements Salable{

    @Override
    public double calcTotalPrice(double price, int amount) {
        if (amount > 9){
            return 0.9 * (price * amount);
        }else{
            return price * amount;
        }
    }
}
