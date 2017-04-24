class BelahKetupat {
    private int sisi, diagonal, keliling;
    private double luas;
    public void setSisi(int sisi) {
      this.sisi = sisi;
    }
    public void setDiagonal(int diagonal) {
      this.diagonal = diagonal;
    }
    public void setKeliling() {
      keliling = 4*this.sisi;
    }
    public void setLuas() {
      luas = this.diagonal*this.diagonal/2;
    }
    public int getSisi() {
      return this.sisi;
    }
    public int getDiagonal(){
      return this.diagonal;
    }
    public int getKeliling() {
      return keliling;
    }
    public double getLuas() {
      return luas;
    }
}
