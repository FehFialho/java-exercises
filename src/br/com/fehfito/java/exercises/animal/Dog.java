package br.com.fehfito.java.exercises.animal;

public class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Woof Woof!");
    }

    public void wagTail(){
        System.out.println("O cachorro está abanando o rabo!");
    }
}
