package org.example;

public class Balance {
    private int right = 0;
    private int left = 0;

    public void addRight(int mass){
        right += mass;
    }

    public void addLeft(int mass){
        left += mass;
    }

    public void result(){
        if(right == left){
            System.out.println("=");
        }else if(right > left){
            System.out.println("R");
        }else{
            System.out.println("L");
        }

    }

}
