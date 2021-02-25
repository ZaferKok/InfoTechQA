package infoTechPackage.Day2;

import java.util.Scanner;

public class A3_IfQuestions {

    public static void main(String[] args) {
// Sondan 3. rakamı tek ve 4 ten büyük olan müşteri olup olmadığını belirleyin.
        // 2586932
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen SSN'ninizi giriniz");
        int a = scan.nextInt();
        int aa = a % 1000 / 100;
        int aaa = aa % 2; // even = çift rakam demektir. odd = tek rakam demektir.
        System.out.println(aaa);

        if (aaa == 1 && aa>=5) {
            System.out.println("Bugün organizasyona katılabilirsiniz!");
        }
        else if (aaa == 1 && aa<5){
            System.out.println("Siz yarın katılabilirsiniz!");
        }
        else if (aaa != 1) {
            System.out.println("Bugün oraganizasyona katılma hakkınız yoktur");
        }
        else
            System.out.println("Sistemde kayıtlı olmayan müşteri");
    }
}
