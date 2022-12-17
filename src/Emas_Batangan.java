public class Emas_Batangan extends Emas{
    String asal;
    @Override
    public void dataEmas(int id, char bo, String war, int har) {
        super.dataEmas(id, bo, war, har);
    }

    //overloading
    public void dataEmas(int id, char bo, String war, int har, String asl) {
        super.dataEmas(id, bo, war, har);
        this.asal = asl;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
}
