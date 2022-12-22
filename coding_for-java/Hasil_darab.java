    //1. import class
    import java.util.Scanner;
    public class Hasil_darab {
        public static void main(String[] args){

        //2. paparkan output-makluman awal aturcara
        System.out.println("PERMAINAN MATAMETIK-OPERASI TAMBAH");

         //3. declaration pembolehubah Scanner
         Scanner input =new Scanner(System.in);

         //4. Notice pembolehubah dan papar text pertanyaan
         int nom1, nom2;
         String jawab;

         //5. kawalan ulang do while
         do{
            System.out.print("Nombor pertama: ");
            nom1 = input.nextInt();
            System.out.print("Nombor kedua:");
            nom2 = input.nextInt();

            //6. papar output
            System.out.println("Hasil darab:" + nom1 + "x"+ nom2 + "=" + Math.abs(nom2 * nom1));

            //pertanyaan ulang
            System.out.println("Taipkan Y untuk teruskan..");
            jawab = input.next();

            //Ulang selagi syarat ditepati
            }while (jawab.equals("Y") ||jawab.equals("y"));
            input.close();
        }
}
