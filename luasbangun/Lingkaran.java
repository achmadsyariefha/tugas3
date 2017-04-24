class Lingkaran {
  private int jarijari;
  private double keliling, luas;

  public void setJariJari(int jarijari) {
      this.jarijari = jarijari;
  }
  public void setKeliling(){
    keliling = 2*Math.PI*this.jarijari;
  }
  public void setLuas() {
      luas = Math.PI*Math.pow(this.jarijari, 2);
  }
  public int getJariJari() {
      return this.jarijari;
  }
  public double getKeliling(){
    return keliling;
  }
  public double getLuas() {
      return luas;
  }
}
