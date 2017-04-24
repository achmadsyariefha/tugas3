class Kubus {
    private int sisi, volume, luas;
    public void setSisi(int sisi) {
      this.sisi = sisi;
    }
    public void setVolume() {
      volume = this.sisi*this.sisi*this.sisi;
    }
    public void setLuas() {
      luas = 6*this.sisi;
    }
    public int getSisi() {
      return this.sisi;
    }
    public int getVolume() {
      return volume;
    }
    public int getLuas() {
      return luas;
    }
}
