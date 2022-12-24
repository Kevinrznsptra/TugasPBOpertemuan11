import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int pilih;
        double total;
        Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Sepatu spt = new Sepatu();
        Bio des = new Bio() {
            @Override
            public void jk() {
                System.out.println("Nama           : " + nama);
            }
            @Override
            public void alamat() {
                System.out.println("ID             : " + id);
            }
        };
        des.jk();
        des.alamat();
        System.out.println("Pegawai yang Bekerja Pada Hari ini");

        System.out.println("=======================");
        System.out.println(" SILAHKAN PESAN SEPATU ");
        System.out.println("=======================");
        System.out.println("Masukkan merk sepatu : ");
        String merk = br.readLine();
        System.out.println("Masukkan tipe sepatu : ");
        String tipe = br.readLine();
        System.out.println("Masukkan ukuran sepatu : ");
        String ukuran = br.readLine();
        System.out.println("Masukkan warna sepatu : ");
        String warna = br.readLine();
        System.out.println("Masukkan harga sepatu : ");
        double harga = Double.parseDouble(br.readLine());

        spt.setMerk(merk);
        spt.setTipe(tipe);
        spt.setUkuran(ukuran);
        spt.setWarna(warna);
        spt.setHarga(harga);

        //output
        System.out.println("=====================================================");
        System.out.println("|               STRUCK PEMBELIAN SEPATU             |");
        System.out.println("=====================================================");
        System.out.println("Merk Sepatu                      : "+    spt.getMerk());
        System.out.println("Tipe Sepatu                      : "+ spt.getTipe());
        System.out.println("Ukuran Sepatu                    : "+ spt.getUkuran());
        System.out.println("Warna Sepatu                     : "+ spt.getWarna());
        System.out.println("Harga Sepatu Diskon             =  Rp."+ spt.getHarga() );
        spt.keterangan();

        System.out.println("==========================");
        System.out.println("   MENU CARA PEMBAYARAN   ");
        System.out.println("1. CASH                   ");
        System.out.println("2. DEBIT                  ");
        System.out.println("========================================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih = input.nextInt();
        System.out.println();
        if (pilih == 1) {
            Pembayaransepatu pk = new Pembayaransepatu(0);
            total = spt.hargaDsikon()+ pk.bayarsepatu;
            System.out.println("Total Bayar : " + total);
        } else if (pilih == 2) {
            Pembayaransepatu pk = new Pembayaransepatu(3000);
            total = spt.hargaDsikon()+ pk.bayarsepatu;
            System.out.println("Total Bayar : " + total);
        }
    }

}



