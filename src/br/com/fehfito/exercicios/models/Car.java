package br.com.fehfito.exercicios.models;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
    String nomeModelo = "";
    private int anoLancamento = 0;
    private double precoMedio = 0;
    private double preco2020 = 0;
    private double preco2021 = 0;
    private double preco2022 = 0;

    Scanner read = new Scanner(System.in);

    public void definePreco(){
        int n = 0;

        while( n>4 || n<1 ){
            System.out.println("Insira a opção desejada:\n" +
                    "1 - Inserir valor para 2020\n" +
                    "2 - Inserir valor para 2021\n" +
                    "3 - Inserir valor para 2022\n"  +
                    "4 - Sair\n");
            n = read.nextInt();
            switch (n){
                case 1:
                    System.out.println("Insira valor para 2020:");
                    setPreco2020(read.nextDouble());
                    n = 0;
                    break;
                case 2:
                    System.out.println("Insira valor para 2021:");
                    setPreco2021(read.nextDouble());
                    n = 0;
                    break;
                case 3:
                    System.out.println("Insira valor para 2022:");
                    setPreco2022(read.nextDouble());
                    n = 0;
                    break;
                case 4:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }
        }
    }

    public void mostraPreco(){
        int n = 0;
        while( n>4 || n<1 ){
            System.out.println("Insira a opção desejada:\n" +
                    "1 - Mostrar valor para 2020\n" +
                    "2 - Mostrar valor para 2021\n" +
                    "3 - Mostrar valor para 2022\n" +
                    "4 - Sair\n");
            n = read.nextInt();
            switch (n){
                case 1:
                    System.out.println("O valor de 2020 é: " + getPreco2020());
                    n = 0;
                    break;
                case 2:
                    System.out.println("O valor de 2021 é: " + getPreco2021());
                    n = 0;
                    break;
                case 3:
                    System.out.println("O valor de 2022 é: " + getPreco2022());
                    n = 0;
                    break;
                case 4:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }
        }
    }

    public void calculaPrecoMedio(){
        DecimalFormat format = new DecimalFormat("#.00");
        precoMedio = (preco2020 + preco2021 + preco2022) / 3;
        System.out.println("O preço médio foi de " + format.format(precoMedio) + "R$");
    }

    public double getPreco2022() {
        return preco2022;
    }

    public double getPreco2021() {
        return preco2021;
    }

    public double getPreco2020() {
        return preco2020;
    }

    public void setPreco2022(double preco2022) {
        this.preco2022 = preco2022;
    }

    public void setPreco2021(double preco2021) {
        this.preco2021 = preco2021;
    }

    public void setPreco2020(double preco2020) {
        this.preco2020 = preco2020;
    }

}
