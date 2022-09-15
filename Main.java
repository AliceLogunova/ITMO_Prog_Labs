public class Main {
    public static void main(String[] args){
        //пункт 1: массив типа short, заполненный числами от 16 до 5 (в порядке убывания)
        short [] c = new short[12];
        short num = 16;
        for (int i = 0; i < 12; i ++){
            c[i] = num;
            num -= 1;
        }
        // пункт 2: массив типа float, заполненный раномными числа из диапазона от -7.0 до 15.0
        float [] x = new float[17];
        for (int i = 0; i < 17; i ++)
            x[i] = ((float)(Math.random() * 23.0f - 7.0f)); // генерация случайного числа типа float из
                                                            // диапазона от -7.0 до 15.0


        // пункт 3: заполнение двумерного массива 12х17 с ссыланием на предыдущие массивы
        double [][] arr = new double [12][17];
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 17; j++){
                if (c[i] == 5)
                    arr[i][j] = (Math.sqrt(0.5 * (1 - (Math.pow(Math.E,Math.cos(x[j]))))));
                if ((c[i] == 6) || (c[i] == 7) || (c[i] == 8) || (c[i] == 9) || (c[i] == 10) || (c[i] == 13))
                    arr[i][j] = (Math.sin(Math.atan(1/Math.pow(Math.E,Math.abs(x[i])))));
                else
                    arr[i][j] = (Math.pow(Math.E,Math.tan(Math.tan(Math.pow(x[i]/2,x[j])))));
            }
        }
        // вывод отформатированного (числа с 5-ью знакаами после запятой) заполненного двумерного массива
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 17; j++){
                System.out.printf("%.5f ", arr[i][j]);
            }System.out.println("");
        }
    }
}