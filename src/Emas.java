public class Emas {
    public int id_emas;
    protected char bobot;
    protected String warna;
    protected int harga;

    public void dataEmas (int id, char bo, String war, int har){
        setId_emas(id);
        setBobot(bo);
        setWarna(war);
        setHarga(har);
    }

    public void cetakEmas(){
        System.out.println("Id Emas: "+getId_emas());
        System.out.println("Bobot: "+getBobot());
        System.out.println("Warna: "+getWarna());
        System.out.println("Harga: "+getHarga());
    }

    public int updateEmas(int no, int id, char bo, String war, int har){
        setId_emas(id);
        setBobot(bo);
        setWarna(war);
        setHarga(har);
        return no;
    }
    public int getId_emas() {
        return id_emas;
    }

    public void setId_emas(int id_emas) {
        this.id_emas = id_emas;
    }

    public char getBobot() {
        return bobot;
    }

    public void setBobot(char bobot) {
        this.bobot = bobot;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}