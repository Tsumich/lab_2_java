package org.example;

public class Bell {
    private boolean flag = false;

    public void sound(){
        if(flag){
            System.out.println("dong");
        }else{
            System.out.println("ding");
        }
        flag = !flag;
    }
}
