class Balok {
    private int panjang, lebar, tinggi, volume, luas;
    public void setPanjang(int panjang) {
    this.panjang = panjang;
    }
    public void setLebar(int lebar) {
    this.lebar = lebar;
    }
    public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
    }
    public void setVolume() {
    volume = this.panjang * this.tinggi * this.lebar;
    }
    public void setLuas() {
    luas = 2 * this.panjang * this.lebar + 2 * this.panjang * this.tinggi + 2 * this.lebar * this.tinggi;
    }
    public int getPanjang() {
    return this.panjang;
    }
    public int getLebar() {
    return this.lebar;
    }
    public int getTinggi() {
    return this.tinggi;
    }
    public int getVolume() {
    return volume;
    }
    public int getLuas() {
    return luas;
    }
}
