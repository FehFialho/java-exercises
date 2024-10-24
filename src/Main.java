import br.com.fehfito.exercicios.models.Car;

public class Main {
    public static void main(String[] args) {
        Car fusca = new Car();
        fusca.definePreco();
        fusca.mostraPreco();
        fusca.calculaPrecoMedio();
    }
}