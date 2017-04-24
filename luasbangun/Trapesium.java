class Trapesium {
  private int sisiatas, sisibawah, sisimiring, tinggi, keliling;
  private double luas;

  public void setSisiAtas(int sisiatas){
    this.sisiatas = sisiatas;
  }
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
    keliling = this.sisiatas + this.sisibawah + (2*this.sisimiring);
  }
  public void setLuas(){
    luas = (this.sisiatas + this.sisibawah)*this.tinggi/2;
  }
  public int getSisiAtas(){
    return this.sisiatas;
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
  public double getLuas(){
    return luas;
  }
}
