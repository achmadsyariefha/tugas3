import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBangunDatar {
  private static BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
  public void InputBalok() {
    int panjang, lebar, tinggi;
    Balok balok = new Balok();
    System.out.println("Masukkan Panjang Balok : ");
    String inputdataPanjang = null;
    try {
      inputdataPanjang = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    System.out.println("Masukkan Lebar Balok : ");
    String inputdataLebar = null;
    try {
      inputdataLebar = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    System.out.println("Masukkan Tinggi Balok : ");
    String inputdataTinggi = null;
    try {
      inputdataTinggi = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    panjang = Integer.parseInt(inputdataPanjang);
    lebar = Integer.parseInt(inputdataLebar);
    tinggi = Integer.parseInt(inputdataTinggi);
    balok.setPanjang(panjang);
    balok.setLebar(lebar);
    balok.setTinggi(tinggi);
    balok.setVolume();
    balok.setLuas();
    System.out.println("Panjang balok = "+ balok.getPanjang());
    System.out.println("Lebar balok = "+ balok.getLebar());
    System.out.println("Tinggi balok = "+ balok.getTinggi());
    System.out.println("Volume balok = "+ balok.getVolume());
    System.out.println("Luas permukaan balok = "+ balok.getLuas());

  }

  public void InputTabung() {
    int jarijari, tinggi;
    Tabung tabung = new Tabung();
    System.out.println("Masukkan Jari Jari Tabung : ");
    String inputdataJariJari = null;
    try {
      inputdataJariJari = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    System.out.println("Masukkan Tinggi Tabung : ");
    String inputdataTinggi = null;
    try {
      inputdataTinggi = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    jarijari = Integer.parseInt(inputdataJariJari);
    tinggi = Integer.parseInt(inputdataTinggi);
    tabung.setJariJari(jarijari);
    tabung.setTinggi(tinggi);
    tabung.setVolume();
    tabung.setLuas();
    System.out.println("Jari jari tabung = "+ tabung.getJariJari());
    System.out.println("Tinggi tabung = "+ tabung.getTinggi());
    System.out.println("Volume tabung = "+ tabung.getVolume());
    System.out.println("Luas permukaan tabung = "+ tabung.getLuas());
  }

  public void InputKubus() {
    int sisi;
    Kubus kubus = new Kubus();
    System.out.println("Masukkan Sisi Kubus : ");
    String inputdataSisi = null;
    try {
      inputdataSisi = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    sisi = Integer.parseInt(inputdataSisi);
    kubus.setSisi(sisi);
    kubus.setVolume();
    kubus.setLuas();
    System.out.println("Sisi Kubus = "+ kubus.getSisi());
    System.out.println("Volume kubus = "+ kubus.getVolume());
    System.out.println("Luas permukaan kubus = "+ kubus.getLuas());
  }

  public void InputBola() {
    int jarijari;
    Bola bola = new Bola();
    System.out.println("Masukkan Jari Jari Bola : ");
    String inputdataJariJari = null;
    try {
      inputdataJariJari = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    jarijari = Integer.parseInt(inputdataJariJari);
    bola.setJariJari(jarijari);
    bola.setVolume();
    bola.setLuas();
    System.out.println("Jari Jari Bola = "+ bola.getJariJari());
    System.out.println("Volume Bola = "+ bola.getVolume());
    System.out.println("Luas permukaan Bola = "+ bola.getLuas());
  }

  public void InputPersegi() {
    int sisi;
    Persegi persegi = new Persegi();
    System.out.println("Masukkan Sisi Persegi : ");
    String inputdataSisi = null;
    try {
      inputdataSisi = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    sisi = Integer.parseInt(inputdataSisi);
    persegi.setSisi(sisi);
    persegi.setLuas();
    persegi.setKeliling();
    System.out.println("Sisi Persegi = "+ persegi.getSisi());
    System.out.println("Luas Persegi = "+ persegi.getLuas());
    System.out.println("Keliling Persegi = "+ persegi.getKeliling());
  }

  public void InputPersegiPanjang() {
    int panjang, lebar;
    PersegiPanjang persegipanjang = new PersegiPanjang();
    System.out.println("Masukkan Panjang Persegi Panjang : ");
    String inputdataPanjang = null;
    try {
      inputdataPanjang = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    System.out.println("Masukkan Lebar Persegi Panjang : ");
    String inputdataLebar = null;
    try {
      inputdataLebar = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    panjang = Integer.parseInt(inputdataPanjang);
    lebar = Integer.parseInt(inputdataLebar);
    persegipanjang.setPanjang(panjang);
    persegipanjang.setLebar(lebar);
    persegipanjang.setLuas();
    persegipanjang.setKeliling();
    System.out.println("Panjang Persegi Panjang = "+ persegipanjang.getPanjang());
    System.out.println("Lebar Persegi Panjang = "+ persegipanjang.getLebar());
    System.out.println("Luas Persegi Panjang = "+ persegipanjang.getLuas());
    System.out.println("Keliling Persegi Panjang = "+ persegipanjang.getKeliling());
  }

  public void InputSegitiga(){
    int alas, tinggi;
    Segitiga segitiga = new Segitiga();
    System.out.println("Masukkan Alas Segitiga : ");
		String inputdataAlas = null;
		try{
			inputdataAlas = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Segitiga : ");
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
			alas = Integer.parseInt(inputdataAlas);
			tinggi = Integer.parseInt(inputdataTinggi);
			segitiga.setAlas(alas);
      segitiga.setTinggi(tinggi);
      segitiga.setLuas();
      segitiga.setKeliling();
      System.out.println("Alas Segitiga = "+segitiga.getAlas());
      System.out.println("Tinggi Segitiga = "+segitiga.getTinggi());
			System.out.println("Luas Segitiga = "+segitiga.getLuas());
      System.out.println("Keliling Segitiga = "+ segitiga.getKeliling());
  }

  public void InputBelahKetupat(){
    int sisi, diagonal;
    BelahKetupat belahketupat = new BelahKetupat();
    System.out.println("Masukkan Panjang Sisi Belah Ketupat : ");
		String inputdataSisi = null;
		try{
			inputdataSisi = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Ketupat : ");
		String inputdataDiagonal = null;
		try{
			inputdataDiagonal = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
			sisi = Integer.parseInt(inputdataSisi);
			diagonal = Integer.parseInt(inputdataDiagonal);
			belahketupat.setSisi(sisi);
      belahketupat.setDiagonal(diagonal);
			belahketupat.setLuas();
      belahketupat.setKeliling();
      System.out.println("Sisi Belah Ketupat = "+ belahketupat.getSisi());
      System.out.println("Diagonal Belah Ketupat = "+ belahketupat.getDiagonal());
      System.out.println("Luas Belah Ketupat = "+ belahketupat.getLuas());
      System.out.println("Keliling Belah Ketupat = "+ belahketupat.getKeliling());

  }

  public void InputLayangLayang(){
    int panjang, lebar, diagonalA, diagonalB;
    LayangLayang layanglayang = new LayangLayang();
    System.out.println("Masukkan Panjang Layang-Layang : ");
		String inputdataPanjang = null;
		try{
			inputdataPanjang = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan lebar Layang-Layang : ");
		String inputdataLebar = null;
		try{
			inputdataLebar = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Pertama Layang-Layang : ");
		String inputdataDiagonalPertama = null;
		try{
			inputdataDiagonalPertama = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Diagonal Kedua Layang-Layang : ");
		String inputdataDiagonalKedua = null;
		try{
			inputdataDiagonalKedua = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
			panjang = Integer.parseInt(inputdataPanjang);
			lebar = Integer.parseInt(inputdataLebar);
			diagonalA = Integer.parseInt(inputdataDiagonalPertama);
			diagonalB = Integer.parseInt(inputdataDiagonalKedua);
      layanglayang.setPanjang(panjang);
      layanglayang.setLebar(lebar);
      layanglayang.setDiagonalA(diagonalA);
      layanglayang.setDiagonalB(diagonalB);
      layanglayang.setLuas();
      layanglayang.setKeliling();
      System.out.println("Panjang Layang-Layang = "+ layanglayang.getPanjang());
      System.out.println("Lebar Layang-Layang = "+ layanglayang.getLebar());
      System.out.println("Diagonal Pertama Layang-Layang = "+ layanglayang.getDiagonalA());
      System.out.println("Diagonal Kedua Layang-Layang = "+ layanglayang.getDiagonalB());
			System.out.println("Luas Layang-Layang = "+ layanglayang.getLuas());
      System.out.println("Keliling Layang-Layang = "+ layanglayang.getKeliling());
  }

  public void InputTrapesium(){
    int sisiatas, sisibawah, sisimiring, tinggi;
    Trapesium trapesium = new Trapesium();
    System.out.println("Masukkan Sisi Atas Trapesium : ");
		String inputdataSisiAtas = null;
		try{
			inputdataSisiAtas = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Bawah Trapesium : ");
		String inputdataSisiBawah = null;
		try{
			inputdataSisiBawah = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Miring Trapesium : ");
		String inputdataSisiMiring = null;
		try{
			inputdataSisiMiring = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Trapesium : ");
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
			sisiatas = Integer.parseInt(inputdataSisiAtas);
			sisibawah = Integer.parseInt(inputdataSisiBawah);
			sisimiring = Integer.parseInt(inputdataSisiMiring);
			tinggi = Integer.parseInt(inputdataTinggi);
      trapesium.setSisiAtas(sisiatas);
      trapesium.setSisiBawah(sisibawah);
      trapesium.setSisiMiring(sisimiring);
      trapesium.setTinggi(tinggi);
			trapesium.setLuas();
      trapesium.setKeliling();
      System.out.println("Sisi Atas Trapesium = "+trapesium.getSisiAtas());
      System.out.println("Sisi Bawah Trapesium = "+trapesium.getSisiBawah());
      System.out.println("Sisi Miring Trapesium = "+trapesium.getSisiMiring());
      System.out.println("Tinggi Trapesium = "+trapesium.getTinggi());
			System.out.println("Luas Trapesium = "+ trapesium.getLuas());
      System.out.println("Keliling Trapesium = "+ trapesium.getKeliling());
  }

  public void InputJajarGenjang(){
    int sisibawah, sisimiring, tinggi;
    JajarGenjang jajargenjang = new JajarGenjang();
    System.out.println("Masukkan Sisi Bawah Jajar Genjang : ");
		String inputdataSisiBawah = null;
		try{
			inputdataSisiBawah = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan " + error.getMessage());
		}
		System.out.println("Masukkan Sisi Miring Jajar Genjang : ");
		String inputdataSisiMiring = null;
		try{
			inputdataSisiMiring = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
		System.out.println("Masukkan Tinggi Jajar Genjang : ");
		bufferedreader = new BufferedReader (new InputStreamReader(System.in));
		String inputdataTinggi = null;
		try{
			inputdataTinggi = bufferedreader.readLine();
		}
		catch (IOException error) {
			System.out.println("Inputan anda Bukan Angka " + error.getMessage());
		}
			sisibawah = Integer.parseInt(inputdataSisiBawah);
			sisimiring = Integer.parseInt(inputdataSisiMiring);
			tinggi = Integer.parseInt(inputdataTinggi);
      jajargenjang.setSisiBawah(sisibawah);
      jajargenjang.setSisiMiring(sisimiring);
      jajargenjang.setTinggi(tinggi);
      jajargenjang.setKeliling();
      jajargenjang.setLuas();
      System.out.println("Sisi Bawah Jajar Genjang = "+jajargenjang.getSisiBawah());
      System.out.println("Sisi Miring Jajar Genjang = "+jajargenjang.getSisiMiring());
      System.out.println("Tinggi Jajar Genjang = "+jajargenjang.getTinggi());
			System.out.println("Luas Jajar Genjang = "+ jajargenjang.getLuas());
      System.out.println("Keliling Jajar Genjang = "+ jajargenjang.getKeliling());
  }

  public void InputLingkaran(){
    Lingkaran lingkaran = new Lingkaran();
    int jarijari;
    System.out.println("Masukkan Jari Jari Lingkaran : ");
    String inputdataJariJari = null;
    try {
      inputdataJariJari = bufferedreader.readLine();
    }
    catch (IOException error){
      System.out.println("Inputan anda Bukan Angka" + error.getMessage());
    }
    jarijari = Integer.parseInt(inputdataJariJari);
    lingkaran.setJariJari(jarijari);
    lingkaran.setLuas();
    lingkaran.setKeliling();
    System.out.println("Jari Jari Lingkaran = "+ lingkaran.getJariJari());
    System.out.println("Luas Lingkaran = "+ lingkaran.getLuas());
    System.out.println("Keliling Lingkaran = "+ lingkaran.getKeliling());
  }
}
