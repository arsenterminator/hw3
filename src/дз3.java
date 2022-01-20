public class дз3 {
    public static void main(String[] args) {
        double[] array = {1.5, -2.4, 45.5, -2.3, 3.4, 244.5, -45.5
                , 8.5, -45.6, 0.6, 45.4, 5.9, -23.4, -34.3, 34.8};
        boolean isNegative = false;
        double summa = 0;
        int length  = 0;
        for (double number : array) {
            if (number < 0) {
                isNegative = true;
            } else if(isNegative){
                if(number > 0){
                    summa = summa + number;
                    length++ ;
                }
            }
        }
        System.out.println("Среднее арифметическое положительных чисел = "+summa / length);
    }
}
