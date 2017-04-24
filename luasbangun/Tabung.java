class Tabung {
    private int tinggi, jarijari;
    private double volume, luas;
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public void setJariJari(int jarijari) {
        this.jarijari = jarijari;
    }
    public void setVolume() {
        volume =  Math.PI * Math.pow(this.jarijari, 2) * this.tinggi;
    }
    public void setLuas() {
        luas = 2 * Math.PI * this.jarijari * (this.jarijari + this.tinggi);
    }
    public int getJariJari() {
        return this.jarijari;
    }
    public int getTinggi() {
        return this.tinggi;
    }
    public double getVolume() {
        return volume;
    }
    public double getLuas() {
        return luas;
    }
}
