    //1. import class
    import java.util.Scanner;
    public class Permainan {
        public static void  main(String []args ) {

        //2. papar output-makluman awal aturcara
        System.out.println("PERMAINAN MATAMETIK-OPERASI TAMBAH");

        //3. declaration pembolehubah Scanner
        Scanner input =new Scanner(System.in);
        
        //4. Notice pembolehubah dan papar text pertanyaan
        int nom1 = (int)(Math.random () * 101);
        int nom2 = (int)(Math.random () * 101);

        System.out.print("Nyatakan jawapan" + nom1 +"+"+ nom2 + " = ");
        int jawapan = input.nextInt();

        //5. kawalan ulangan guna while
        while (nom1 + nom2 != jawapan){

        //6. papar ouput jika jawapan dan ulang
        System.out.print("jawapan anda salah ! Sila cuba../n Nyatakan jawapan"+ nom1 + "+" + nom2 + "=");
        jawapan = input.nextInt();
        }
        input.close();

        //7. papar output jika jawapan betul
        System.out.println("Tahniah, Jawapan Anda Betul");
        }
}