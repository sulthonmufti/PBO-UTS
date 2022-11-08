public class Tendik extends Karyawan{
    private int totalLembur,gajilembur,jamlembur;
    public void lembur(int a){
        this.gajilembur=a;
    }
    public void lembur(int a,int b){
        this.gajilembur=a;
        this.jamlembur=b;
        totalLembur=a*b;
    }

    @Override
    public void gajiTotal() {
        System.out.println("gaji                 :"+(gajiPokok+totalLembur));
    }

}
