import br.com.fehfito.java.exercises.animal.Cat;
import br.com.fehfito.java.exercises.animal.Dog;
import br.com.fehfito.java.exercises.bankaccount.BankAccount;
import br.com.fehfito.java.exercises.bankaccount.CheckingAccount;
import br.com.fehfito.java.exercises.car.CarModel;
import br.com.fehfito.java.exercises.converter.CurrencyConverter;
import br.com.fehfito.java.exercises.primenumbers.PrimeNumber;
import br.com.fehfito.java.exercises.roomcalc.RectangularRoomCalculator;
import br.com.fehfito.java.exercises.sales.Product;

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.calcTotalPrice(10, 1));
        System.out.println(product.calcTotalPrice(10, 10));

        RectangularRoomCalculator rectangularRoomCalculator = new RectangularRoomCalculator();
        System.out.println(rectangularRoomCalculator.calcArea(10, 20));


        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println(currencyConverter.dolarToReal(10));

        // Atividade 1- Carro
        CarModel myCar = new CarModel();
        myCar.definirModelo("Teste");
        myCar.definePreco(26000,29000,33000);
        myCar.mostraPreco();
        myCar.exibirInfo();
        System.out.println("O preço médio foi de R$" + myCar.calculaPrecoMedio() + "!");
        System.out.println("O menor preço é de R$" + myCar.calculaMenorPreco()+ "!");
        System.out.println("O maior preço é de R$" + myCar.calculaMaiorPreco()+ "!");

        // Atividade 2- Animal
        Dog dog = new Dog();
        dog.makeNoise();
        dog.wagTail();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.scratchFurniture();
        cat.eat();

        // Atividade 3- Conta Bancária
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.checkBalance();
        bankAccount.deposit();
        bankAccount.withdraw();
        CheckingAccount checkingAccount = new CheckingAccount(1000, 20);
        checkingAccount.deposit();
        checkingAccount.applyMonthlyFee();

        // Atividade 4- Números Primos
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrime(5));
        System.out.println(primeNumber.isPrime(4));
        System.out.println(primeNumber.isPrime(7));
    }
}