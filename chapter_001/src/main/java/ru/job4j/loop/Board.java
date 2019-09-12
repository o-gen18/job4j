package ru.job4j.loop;

public class Board {
    public static void paint(int width,int height){
        for(int row=0;row<height;row++){
            for(int cell=0;cell<width;cell++){
                //условие проверки,что писать пробел или Х
                //сумма индексов матрицы (row+cell)равна четному числу
                //т.е. делится на 2 без остатка
                if((row+cell)%2==0) {
                    //печатаем X - width раз.
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            //добавляем перевод на новую строку.
            System.out.println();
        }
    }
    public static void main(String[]args){
        paint(3,3);
        System.out.println();
        paint(5,4);
    }
}
