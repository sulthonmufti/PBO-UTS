//NAMA : Muhammad Sulthon Mufti
//NIM : 2100018213
//KELAS : D


public class Main {
    public static void main(String[] args) {

        Dosen dsn = new Dosen();

        dsn.setNama("Reza Sukandar");
        dsn.setNip("99876");
        dsn.setTtl("Magelang, 29 Januari 1997");
        dsn.setJurusan("TIF");
        dsn.setAlamat("Magelang");
        dsn.setJenisKelamin("Laki - laki");
        dsn.setSks(24);
        dsn.setTahunMasuk(2012);
        dsn.setNidn("54321");

        System.out.println("DATA DOSEN : ");
        System.out.println("Namav                 :"+dsn.getNama());
        System.out.println("NIP                   :"+dsn.getNip());
        System.out.println("NIDN                  :"+dsn.getNidn());
        System.out.println("Jenis Kelamin         :"+dsn.getJenisKelamin());
        System.out.println("Alamat                :"+dsn.getAlamat());
        System.out.println("Tempat, tanggal lahir : "+dsn.getTtl());
        System.out.println("Tahun masuk           :"+dsn.getTahunMasuk());
        System.out.println("Jabatan               :"+dsn.getJurusan());
        dsn.gajiTotal();

        System.out.println("=================================================================");

        Tendik tndk = new Tendik();
        tndk.setNama("Asih Sulaisih");
        tndk.setNip("6785435");
        tndk.setTtl("Bantul,19 Oktober 1993");
        tndk.setAlamat("Bantul");
        tndk.setJenisKelamin("Perempuan");
        tndk.setTahunMasuk(2014);
        tndk.lembur(50000);
        tndk.lembur(50000,20);

        System.out.println("\nTENAGA PENDIDIK (PENDIK) :");
        System.out.println("Nama                 :"+tndk.getNama());
        System.out.println("NIP                  :"+tndk.getNip());
        System.out.println("Jenis Kelamin        :"+tndk.getJenisKelamin());
        System.out.println("Alamat               :"+tndk.getAlamat());
        System.out.println("TTL                  :"+tndk.getTtl());
        System.out.println("Tahun Masuk          :"+tndk.getTahunMasuk());
        tndk.gajiTotal();;



    }
}