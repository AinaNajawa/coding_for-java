    //1. Import Scanner
    import java.util.Scanner;
    public class Contoh{
        public static void  main(String args[] ) {

            //2. declaration pembolehubah Scanner
            Scanner input = new Scanner(System.in);  

            //3. Makluman awal aturcara
            System.out.println(" ATURCARA YANG MENENTUKAN TAHAP UMUR");
            
            //4. Papar text pertanyaan
            System.out.println("Taip umur anda dan tekan ENTER:");
            int umur = input.nextInt();

            //5. kawalan if- else-if dengan operetor hubungan dan logik
            if (!(umur>11)){
                System.out.println("Anda masih lagi kanak-kanak");
            }
            else if (umur>= 11 && umur <=18){
                System.out.println("Anda adalah remaja");
            }
            else if (umur >18 && umur <= 35){
                System.out.println("Anda telah dewasa");
            }
            else if (umur == 36 || umur <= 60){
                System.out.println("Anda di pertegahan umur");
            }
        else{
            System.out.println("Anda telah menjadi warga emas");
            input.close();
        }
      }
    }