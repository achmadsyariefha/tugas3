class Bola {
    private int jarijari;
    private double volume, luas;
    public void setJariJari(int jarijari) {
      this.jarijari = jarijari;
    }
    public void setVolume() {
      volume = (4/3)*Math.PI*Math.pow(jarijari, 3);
    }
    public void setLuas() {
      luas = 4*Math.pow(jarijari, 2);
    }
    public int getJariJari() {
      return this.jarijari;
    }
    public double getVolume() {
      return volume;
    }
    public double getLuas() {
      return luas;
    }
}
