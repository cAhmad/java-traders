package fr.ing.interview.javatraders;

import java.util.Arrays;
import java.util.List;

/*
    1. create a method that returns every transaction of 2019 ordered by amount most expensive on top
    2. when amount are the same, order by Trader's name
    3. create a method that returns all Trader's cities, avoid duplicate
 */
public class TransactionTest {

    class Trader {
        private final String name;
        private final String city;

        Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        String getName() {
            return name;
        }

        String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Trader{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    class Transaction {
        private final Trader trader;
        private final int year;
        private final int amount;

        Transaction(Trader trader, int year, int amount) {
            this.trader = trader;
            this.year = year;
            this.amount = amount;
        }

        Trader getTrader() {
            return trader;
        }

        int getYear() {
            return year;
        }

        int getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "trader=" + trader +
                    ", year=" + year +
                    ", amount=" + amount +
                    '}';
        }
    }

    private List<Transaction> givenTransactions() {
        final Trader bob = new Trader("Bob", "New York");
        final Trader alice = new Trader("Alice", "London");
        final Trader jean = new Trader("Jean", "Paris");
        final Trader emilia = new Trader("Emilia", "Brazil");
        final Trader john = new Trader("John", "New York");
        final Trader ophelie = new Trader("Ophélie", "Paris");

        return Arrays.asList(
                new Transaction(bob, 2017, 200),
                new Transaction(alice, 2019, 700),
                new Transaction(jean, 2017, 200),
                new Transaction(ophelie, 2019, 50),
                new Transaction(john, 2018, 350),
                new Transaction(emilia, 2019, 50),
                new Transaction(emilia, 2018, 1_350),
                new Transaction(john, 2017, 10),
                new Transaction(bob, 2018, 90),
                new Transaction(ophelie, 2019, 1_200)
        );
    }
}
