public class Dosen extends Karyawan{
    private String nidn,jurusan;
    private int sks;

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks*100000;
    }

    @Override
    public void gajiTotal() {
        System.out.println("gaji                  :"+(gajiPokok+sks));
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
