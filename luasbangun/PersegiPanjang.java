class PersegiPanjang {
    private int panjang, lebar, keliling, luas;
    public void setPanjang(int panjang) {
      this.panjang = panjang;
    }
    public void setLebar(int lebar) {
      this.lebar = lebar;
    }
    public void setKeliling() {
      keliling = 2 * this.panjang + 2 * this.lebar;
    }
    public void setLuas() {
      luas = this.panjang * this.lebar;
    }
    public int getPanjang() {
      return this.panjang;
    }
    public int getLebar() {
      return this.lebar;
    }
    public int getKeliling() {
      return keliling;
    }
    public int getLuas() {
      return luas;
    }
}
