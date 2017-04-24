class Persegi {
    private int sisi, keliling, luas;
    public void setSisi(int sisi) {
      this.sisi = sisi;
    }
    public void setKeliling() {
      keliling = 4*this.sisi;
    }
    public void setLuas() {
      luas = this.sisi*this.sisi;
    }
    public int getSisi() {
      return this.sisi;
    }
    public int getKeliling() {
      return keliling;
    }
    public int getLuas() {
      return luas;
    }
}
