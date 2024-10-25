import br.com.fehfito.java.exercises.animal.Cat;
import br.com.fehfito.java.exercises.animal.Dog;
import br.com.fehfito.java.exercises.car.CarModel;

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Main {
    public static void main(String[] args) {

        //Atividade 1 - Carro
        CarModel myCar = new CarModel();
        myCar.defineModelo();
        myCar.definePreco();
        myCar.mostraPreco();
        System.out.println("O preço médio foi de R$" + myCar.calculaPrecoMedio() + "!");
        System.out.println("O menor preço é de R$" + myCar.calculaMenorPreco()+ "!");
        System.out.println("O maior preço é de R$" + myCar.calculaMaiorPreco()+ "!");

        //Atividade 2 - Animal
        Dog dog = new Dog();
        dog.makeNoise();
        dog.wagTail();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.scratchFurniture();
        cat.eat();
    }
}