import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
  public static void TampilanMenu(){
    System.out.println ("Menu Utama");
		System.out.println ("[1] Balok");
		System.out.println ("[2] Tabung");
		System.out.println ("[3] Kubus");
		System.out.println ("[4] Bola");
		System.out.println ("[5] Persegi");
		System.out.println ("[6] Persegi Panjang");
		System.out.println ("[7] Segitiga");
		System.out.println ("[8] Belah Ketupat");
		System.out.println ("[9] Layang-Layang");
		System.out.println ("[10] Trapesium");
		System.out.println ("[11] Jajar Genjang");
		System.out.println ("[12] Lingkaran");
		System.out.println ("[0] Keluar");
  }
  public static void main(String[] args){
      System.out.println("Pengolahan Bangun Ruang dan Bangun Datar");
      BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
      InputBangunDatar input = new InputBangunDatar();
      int pilihan = 0;
      String inputdata = null;
      do{
  			TampilanMenu();
  			System.out.println("Masukkan Pilihan Anda : ");
  			try {
                  inputdata = bufferedreader.readLine();
                  try  {
                      pilihan = Integer.parseInt(inputdata);
                      if (pilihan > 0 && pilihan == 1) {
                          input.InputBalok();
                      }
                      else if (pilihan > 0 && pilihan == 2) {
                          input.InputTabung();
                      }
  					          else if (pilihan > 0 && pilihan == 3) {
                          input.InputKubus();
                      }
  					          else if (pilihan > 0 && pilihan == 4) {
                          input.InputBola();
                      }
  					          else if (pilihan > 0 && pilihan == 5) {
                          input.InputPersegi();
                      }
  					          else if (pilihan > 0 && pilihan == 6) {
                          input.InputPersegiPanjang();
                      }
  					          else if (pilihan > 0 && pilihan == 7) {
                          input.InputSegitiga();
                      }
  					          else if (pilihan > 0 && pilihan == 8) {
                          input.InputBelahKetupat();
                      }
  					          else if (pilihan > 0 && pilihan == 9) {
                          input.InputLayangLayang();
                      }
  					          else if (pilihan > 0 && pilihan == 10) {
                          input.InputTrapesium();
                      }
  					          else if (pilihan > 0 && pilihan == 11) {
                          input.InputJajarGenjang();
                      }
  					          else if (pilihan > 0 && pilihan == 12) {
                          input.InputLingkaran();
                      }
                      else {
                          System.out.println("Terimakasih telah menggunakan aplikasi ini!");
                      }
                  }
                  catch(NumberFormatException e) {
                      System.out.println("Masukan Anda Tidak Sesuai");
                  }
              }
              catch (IOException error) {
                  System.out.println("Inputan anda Bukan Angka " + error.getMessage());
              }

          } while(pilihan > 0);
    }
}
