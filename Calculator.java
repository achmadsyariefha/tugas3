import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    static float bilangan1 = 1, bilangan2 = 2;
    static double total = 0;
    public static void Menu(){
      System.out.println("Menu Utama");
  		System.out.println("1. Penjumlahan");
  		System.out.println("2. Pengurangan");
  		System.out.println("3. Perkalian");
  		System.out.println("4. Pembagian");
  		System.out.println("0. keluar");
    }

    public static void Addition(){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String inputNumber1 = null;
      String inputNumber2 = null;
      System.out.print("Masukan Bilangan Ke-1 = ");
      try {
          inputNumber1 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }
      System.out.print("Masukan Bilangan Ke-2 = ");
      try {
          inputNumber2 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }

      try {
        bilangan1 = Float.parseFloat(inputNumber1);
        bilangan2 = Float.parseFloat(inputNumber2);
        total = bilangan1 + bilangan2;
        System.out.println(bilangan1+" + "+bilangan2+" = "+total);
      }
      catch(NumberFormatException e) {
        System.out.println("Masukan Anda Tidak Sesuai");
      }
    }

    public static void Reduction(){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String inputNumber1 = null;
      String inputNumber2 = null;
      System.out.print("Masukan Bilangan Ke-1 = ");
      try {
          inputNumber1 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }
      System.out.print("Masukan Bilangan Ke-2 = ");
      try {
          inputNumber2 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }

      try {
        bilangan1 = Float.parseFloat(inputNumber1);
        bilangan2 = Float.parseFloat(inputNumber2);
        total = bilangan1 - bilangan2;
        System.out.println(bilangan1+" - "+bilangan2+" = "+total);
      }
      catch(NumberFormatException e) {
        System.out.println("Masukan Anda Tidak Sesuai");
      }
    }

    public static void Product(){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String inputNumber1 = null;
      String inputNumber2 = null;
      System.out.print("Masukan Bilangan Ke-1 = ");
      try {
          inputNumber1 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }
      System.out.print("Masukan Bilangan Ke-2 = ");
      try {
          inputNumber2 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }

      try {
        bilangan1 = Float.parseFloat(inputNumber1);
        bilangan2 = Float.parseFloat(inputNumber2);
        total = bilangan1 * bilangan2;
        System.out.println(bilangan1+" * "+bilangan2+" = "+total);
      }
      catch(NumberFormatException e) {
        System.out.println("Masukan Anda Tidak Sesuai");
      }
    }

    public static void Division(){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String inputNumber1 = null;
      String inputNumber2 = null;
      System.out.print("Masukan Bilangan Ke-1 = ");
      try {
          inputNumber1 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }
      System.out.print("Masukan Bilangan Ke-2 = ");
      try {
          inputNumber2 = bufferedReader.readLine();
      }
      catch (IOException error) {
        System.out.println("Masukan Anda Bukan Angka");
      }

      try {
        bilangan1 = Float.parseFloat(inputNumber1);
        bilangan2 = Float.parseFloat(inputNumber2);
        total = bilangan1 / bilangan2;
        System.out.println(bilangan1+" / "+bilangan2+" = "+total);
      }
      catch(NumberFormatException e) {
        System.out.println("Masukan Anda Tidak Sesuai");
      }
    }

    public static void main(String[] args){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String inputChoice = null;
      int choice = 0;
      do {
        Menu();
        System.out.println("Masukkan Pilihan Anda : ");
        try {
          inputChoice = bufferedReader.readLine();
          try{
            choice = Integer.parseInt(inputChoice);
            if (choice > 0 && choice == 1) {
              Addition();
            }
            else if (choice > 0 && choice == 2) {
              Reduction();
            }
            else if (choice > 0 && choice == 3) {
              Product();
            }
            else if (choice > 0 && choice == 4) {
              Division();
            }
            else {
              System.out.println("Terimakasih telah menggunakan aplikasi ini.....");
            }
          }
            catch(NumberFormatException e) {
              System.out.println("Masukan Anda Tidak Sesuai");
            }
          }
          catch(IOException error) {
            System.out.println("Masukan Anda Bukan Angka");
          }
        }
        while(choice > 0);
    }
}
