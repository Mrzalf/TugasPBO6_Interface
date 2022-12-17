public class Penggadai {
    public int id_penggadai;
    public String nama;

    public void tambahData(int id, String name){
        this.id_penggadai = id;
        this.nama = name;

    }

    public int updateData(int no, int id, String name){
        this.id_penggadai = id;
        this.nama = name;
        return no+1;
    }

    public int getId_penggadai() {
        return id_penggadai;
    }

    public String getNama() {
        return nama;
    }


}
