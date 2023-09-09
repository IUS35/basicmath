package basicMath;

public class basicMath {

    public static void main(String[] args) {
        int[] myList = {1, 5, 6, 8, 25, 35, 55, 90, 108};
        int enBuyuk = 0;
        int total = 0;
        int multiply = 1;

        for (int number : myList) {
            if (enBuyuk < number) {
                enBuyuk = number;
            }
            if (number % 3 == 0) {
                System.out.println("3 ile tam bölünen sayılar:"+number);
                 
             }
            total = number + total;
            multiply = multiply * number;
        }
        System.out.println("En büyük sayı:" + enBuyuk);
        System.out.println("Toplam:" + total);
        System.out.println("Çarpım:" + multiply);

    }
}
