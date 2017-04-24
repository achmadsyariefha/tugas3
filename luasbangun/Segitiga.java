class Segitiga {
    public int alas, tinggi, keliling;
    private double luas;
    public void setAlas(int alas) {
      this.alas = alas;
    }
    public void setTinggi(int tinggi) {
      this.tinggi = tinggi;
    }
    public void setKeliling() {
      keliling = 3*this.alas;
    }
    public void setLuas() {
      luas = this.alas*this.tinggi/2;
    }
    public int getAlas() {
      return this.alas;
    }
    public int getTinggi() {
      return this.tinggi;
    }
    public int getKeliling() {
      return keliling;
    }
    public double getLuas() {
      return luas;
    }
}
