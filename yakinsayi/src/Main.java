import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.print("Dizi : {");
        for (int i=0;i<list.length;i++){
            if (i==list.length-1){
                System.out.print(list[i]+"}");
            }else
                System.out.print(list[i]+",");
        }
        System.out.println("Bir sayı giriniz : ");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        int kucuk=0,buyuk=0;
        ArrayList<Integer> kucukler=new ArrayList<Integer>();
        ArrayList<Integer> buyukler=new ArrayList<Integer>();

        System.out.println("Girilen sayı : "+sayi);
        for (int i:list){
            if (i<sayi){
                kucukler.add(i);
            }
            else if (i>sayi)
                buyukler.add(i);
        }
        int kucukler_buyuk=kucukler.get(0);
        for(int a:kucukler){
            if (a>kucukler_buyuk)
                kucukler_buyuk=a;
        }
        int buyukle_kucuk=buyukler.get(0);
        for (int a:buyukler){
            if (a<buyukle_kucuk)
                buyukle_kucuk=a;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+kucukler_buyuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+buyukle_kucuk);
    }
}
