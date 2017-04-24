class LayangLayang {
  private int panjang, lebar, diagonalA, diagonalB, keliling;
  private double luas;

  public void setPanjang(int panjang){
    this.panjang = panjang;
  }
  public void setLebar(int lebar){
    this.lebar = lebar;
  }
  public void setDiagonalA(int diagonalA){
    this.diagonalA = diagonalA;
  }
  public void setDiagonalB(int diagonalB){
    this.diagonalB = diagonalB;
  }
  public void setKeliling(){
    keliling = (2*this.panjang)+(2*this.lebar);
  }
  public void setLuas(){
    luas = this.diagonalA*this.diagonalB/2;
  }
  public int getPanjang(){
    return this.panjang;
  }
  public int getLebar(){
    return this.lebar;
  }
  public int getDiagonalA(){
    return this.diagonalA;
  }
  public int getDiagonalB(){
    return this.diagonalB;
  }
  public int getKeliling(){
    return keliling;
  }
  public double getLuas(){
    return luas;
  }
}
