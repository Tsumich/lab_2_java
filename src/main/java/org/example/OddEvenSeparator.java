package org.example;

public class OddEvenSeparator {
    private int max_lenght = 5;
    private int[] myArray = new int[max_lenght];
    private int last_num = 0;

    private void reCreateArray(){
        max_lenght += 5;
        int[] new_myArray = new int[max_lenght];
        for (int i=0; i< myArray.length; i++){
            new_myArray[i] = myArray[i];

        }
        myArray = new_myArray;
    }

    public void addNumber(int number){
        if(last_num >= myArray.length){
            System.out.println("Закончилось место");
            reCreateArray();
        }else{
            myArray[last_num] = number;
            last_num ++;
        }
    }

    public void even(){
        System.out.println("Вывожу четные числа");
        for(int i=0; i< last_num; i++){
            if(myArray[i] % 2 == 0) System.out.println(myArray[i]);
        }
    }

    public void odd(){
        System.out.println("Вывожу нечетные числа");
        for(int i=0; i< last_num; i++){
            if(myArray[i] % 2 != 0) System.out.println(myArray[i]);
        }
    }

    public void printArray(){
        for(int i=0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
