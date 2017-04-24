class JajarGenjang {
  private int sisibawah, sisimiring, tinggi, keliling, luas;

  public void setSisiBawah(int sisibawah){
    this.sisibawah = sisibawah;
  }
  public void setSisiMiring(int sisimiring){
    this.sisimiring = sisimiring;
  }
  public void setTinggi(int tinggi){
    this.tinggi = tinggi;
  }
  public void setKeliling(){
    keliling = (2*this.sisibawah) + (2*this.sisimiring);
  }
  public void setLuas(){
    luas = this.sisibawah*this.tinggi;
  }
  public int getSisiBawah(){
    return this.sisibawah;
  }
  public int getSisiMiring(){
    return this.sisimiring;
  }
  public int getTinggi(){
    return this.tinggi;
  }
  public int getKeliling(){
    return keliling;
  }
  public int getLuas(){
    return luas;
  }
}
