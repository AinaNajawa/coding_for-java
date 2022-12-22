    //import class
    // import java.time.Year;
    import java.util.Scanner;
    public class Konsonanvokal {
        public static void main (String [] arga ) {
            
        //papar output-maluman awal aturcara
        System.out.println("Bilang huruf konsonanvoksl");
        
        //pengisytiharan pemboleh ubah aturcara
        Scanner taip = new Scanner (System.in);
        
        //papar text pernyataan dan istihar pembolehubah
        System.out.println("Taipkan satu perkataan dan tekan ENTER :");
        String perkataan = taip.next();
        char[]hurufv = perkataan.toCharArray();
        int vokal =0;

        //kawalan ulangan for
        for (char h : hurufv ){
            if (h == 'a' || h == 'A' || h == 'E' || h == 'i' || h == 'o' || h == 'o' || h == 'u' || h == 'U'){
                //Penambah
                vokal++;
                taip.close();
            }
        }
        //Paparan output
        System.out.println("Bilangan huruf vokal dalam" + perkataan + "adalah:" + vokal);
        System.out.println("Bilangan huruf kosong dalam" + perkataan + "adalah :" + (hurufv.length - vokal)) ;
        }
    }