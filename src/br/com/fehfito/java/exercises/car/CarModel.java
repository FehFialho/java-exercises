package br.com.fehfito.java.exercises.car;

public class CarModel extends Car {
    String nomeModelo = "";
    public void defineModelo(){
        System.out.println("Insira o modelo do seu carro:");
        setNomeModelo(read.nextLine());
        System.out.println("Você definiu o modelo como " + nomeModelo + "!");
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
}
