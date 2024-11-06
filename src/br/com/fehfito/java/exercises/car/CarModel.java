package br.com.fehfito.java.exercises.car;

public class CarModel extends Car {

    String modeloAlterado;
    public void alteraModelo(){
        System.out.println("Insira o modelo do seu carro:");
        setModeloAlterado(read.nextLine());
        System.out.println("Você definiu o modelo como " + modeloAlterado + "!");
    }

    public void setModeloAlterado(String modeloAlterado) {
        this.modeloAlterado = modeloAlterado;
    }
}
