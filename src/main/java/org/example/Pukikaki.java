package org.example;


public class Pukikaki {
    public static void main(String[] args) {
//        Button btn = new Button();
//        btn.click();
//        btn.click();
//
//        Balance bal = new Balance();
//        bal.addLeft(10);
//        bal.result();
//        bal.addRight(20);
//        bal.result();
//        bal.addLeft(10);
//        bal.result();
//


//
//        OddEvenSeparator sep = new OddEvenSeparator();
//        sep.addNumber(2);
//        sep.addNumber(6);
//        sep.addNumber(7);
//        sep.addNumber(0);
//
//        sep.addNumber(3);
//        sep.addNumber(7);
//        sep.addNumber(11);
//        sep.addNumber(8);
//        sep.printArray();
//        sep.even();
//        sep.odd();



        Table table = new Table(3, 4);
        System.out.println("Строк: " + table.rows());
        System.out.println("Столбцов: " + table.cols());

        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(0, 3, 4);

        table.setValue(1, 0, 5);
        table.setValue(1, 1, 6);
        table.setValue(1, 2, 7);
        table.setValue(1, 3, 8);

        table.setValue(2, 0, 9);
        table.setValue(2, 1, 10);
        table.setValue(2, 2, 11);
        table.setValue(2, 3, 12);

        System.out.println("Значение в (1, 2): " + table.getValue(1, 2));
        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Среднее: " + table.average());


    }

}
