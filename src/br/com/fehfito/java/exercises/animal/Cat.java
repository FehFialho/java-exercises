package br.com.fehfito.java.exercises.animal;

public class Cat extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Meow!");
    }

    public void scratchFurniture(){
        System.out.println("O gato está arranhando os móveis!");
    }
}