package ru.job4j.loop;

/**
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version $Id$
 * @since 12.9.19
 */
public class Paint {
    public String rightTrl(int height){
        //буфер для результата.
        StringBuilder screen=new StringBuilder();
        //ширина будет равна высоте.
        int width=height;
        //внешний цикл двигается по строкам.
        for (int row=0;row!=height;row++){
            //внутренний цикл определяет положение ячейки в строке.
            for(int column=0;column!=width;column++){
                //если строка равна ячейке, то рисуем галочку.
                //в данном случае строка определяет сколько галок будет в строке
                if (row>=column) {
                    screen.append("^");
                }else{
                    screen.append(" ");
                }
            }
            //добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        //получаем результат.
        return screen.toString();
    }
    public String leftTrl(int height){
        StringBuilder screen = new StringBuilder();
        int width=height;
        for (int row=0;row!=height;row++){
            for(int column=0;column!=width;column++){
                if(row>=width-column-1){
                    screen.append("^");
                }else{
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public String pyramid(int height){
        StringBuilder screen=new StringBuilder();
        int width=2*height-1;
        for(int row=0;row!=height;row++){
            for(int column=0;column!=width;column++){
                if(row>=height-column-1 && row+height-1>=column){
                    screen.append("^");
                }else{
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public static void main(String[]args){
        Paint paint=new Paint();
        String rsl=paint.pyramid(4);
        System.out.println(rsl);
    }
}

