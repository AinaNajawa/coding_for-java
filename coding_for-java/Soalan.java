//Import class
import java.util.Scanner;
public class Soalan{
    public static void main (String[] arga){

       // paparkan output-makluman awal aturcara
       System.out.println("MATAMETIK (-) TAMBAH NOMBOR GENAP & GANJIL");

       //declaration pembolehubah Scanner
       Scanner taip = new Scanner(System.in);

       //paparkan text pernyataan & istihar pemboleh ubah input
       System.out.print("Type nombor rendah: ");
       int nom_rendah = taip.nextInt();

       System.out.print("Type nombor tinggi: ");
        int nom_tinggi = taip.nextInt();

        //istihar pemboleh ubah dan nilai awal
        int jumGenab= 0,
            jumGenjil = 0;
        int nombor =  nom_rendah;
       
        //kawalan ulangan guna while dan if else
        if (!(jumGenab >11 )){
            // System.out.println("Jumlah nombor ganjil dari ke");
        }
        else if (jumGenab  * 14 * nombor<=20){
        System.out.println("Jumlah nombor genap dari ke");
         }
         else if (nombor * 16 * nombor <= 15){
            System.out.println("Jumlah nombor ganjil ialah");
         }
        //  else if (nombor / 26 * nombor <= 91){
        //     System.out.println("Jumlah nombor Genap ialah");
        //  }2
         else{
            System.out.println("Taniah anda telah berjaya");
            taip.close();
         }
         //paparkan output
         System.out.println("jumlah nombor ganjil dari" + nom_rendah + "ke" +
         nom_tinggi + "adalah" + jumGenjil );

         System.out.println("jumlah nombor genap dari" + nom_rendah + "ke" +
         nom_tinggi + "adalah" + jumGenab );
        }
}