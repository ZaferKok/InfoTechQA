package infoTechPackage.Day5;

public class A2_WhileLoop {

    public static void main(String[] args) {

        for(int i=100;i>=50;i=i-10){
            System.out.print(i+",");
        }

        int i=0;
        while (i<=50){
            System.out.print(i+",");
            i++;
        }
        System.out.println("-----------------------");
        i--;
        while (i<=100){
            System.out.print(i+",");
            i=i+10;
        }

        //while loop kullanarak 3-13 arası tüm tek sayiları ekrana yazdirin

            for(int j=3;j<14;j++){
                if(j%2==1){
                  System.out.print(j+",");
                }
                j++;
                System.out.print(j+",");
            }
        //3 basamaklı sayilardan 15/20/90A tam bölünebilen rakamları yazdırın
        for(int k=100;k<1000;k++){
            if(k%15==0 && k%20==0 && k%90==0){
                System.out.println(k+",");
            }
        }
        int j=100;
        while (j<1000){
            //j%180==0 yazabiliriz
            if(j%15==0 && j%20==0 && j%90==0){
                System.out.println(j+",");
            }
            j++;
        }







    }
}
