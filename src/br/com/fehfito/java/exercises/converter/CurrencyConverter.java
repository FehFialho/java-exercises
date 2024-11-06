package br.com.fehfito.java.exercises.converter;

public class CurrencyConverter implements FinancialConversion{

    private double convertedValue;

    public double dolarToReal(double value){
        convertedValue = value * 5.71;
        return convertedValue;
    }
}
