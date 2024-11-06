package br.com.fehfito.java.exercises.car;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {

    private double precoMedio = 0;
    private double precoAno1 = 0;
    private double precoAno2 = 0;
    private double precoAno3 = 0;

    String modelo;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    Scanner read = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("00.00");

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco());
        System.out.println("Maior Preço: " + calculaMaiorPreco());
    }

    public void definePreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
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
                    System.out.println("O valor de 2020 é: " + getPrecoAno1());
                    n = 0;
                    break;
                case 2:
                    System.out.println("O valor de 2021 é: " + getPrecoAno2());
                    n = 0;
                    break;
                case 3:
                    System.out.println("O valor de 2022 é: " + getPrecoAno3());
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

    public String calculaPrecoMedio(){
        precoMedio = (precoAno1 + precoAno2 + precoAno3) / 3;

        return df.format(precoMedio);
    }

    public double calculaMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }
}