public class DemoObjectOrientedDelia {
    public static void main(String[] args) {

        int jmlh_looping =5; //Proses mendeklarasikan variabel
        int bil1 = 5;
        int bil2 = 2;
        DemoObjectOriented demo = new DemoObjectOriented();
        demo.helloWorld(jmlh_looping);
        System.out.println("-Pemanggilan Fungsi Tambah-");
        System.out.println("Hasil Operasi Tambah : " + demo.tambah(bil1,
                bil2));
    }
}
