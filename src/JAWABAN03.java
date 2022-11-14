import java.util.Scanner;

public class JAWABAN03 {
    public class tes {
        static int JumlahTopLevel = 0;
        static int JumlahMiddleLevel = 0;
        static int JumlahRegularStaff = 0;
        static int JumlahStaff = 0;

        static boolean success = false;

        public static void main(String[] args) {
            String[] businfo = {"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};

            for (int i=0; i <200; i++) {
                NIK();
            }
        }

        static void CekNIKPegawaiKFC(String NIK){
            //cek apakah nik kurang dari 10 figit
            if (NIK.length() <= 10){
                //Dinyatakan benar jika kurang dari 10 digit
                //Cek apakah NIK mengandung huruf c01
                //Jika iya maka bis Top level bertambah 1 penumpang
                if (NIK.contains("C01")){
                    success=true;
                    JumlahTopLevel++;
                } else if (NIK.contains("J02")){
                    success=true;
                    JumlahMiddleLevel++;
                } else if (NIK.contains("N03")) {
                    success=true;
                    JumlahRegularStaff++;

                } else if (NIK.contains("P04")) {
                    success=true;
                    JumlahStaff++;

                } else {
                    success=false;
                    System.out.println("Maaf NIK anda tidak terdaftar, silahkan coba lagi");
                }
            }else {
                success=false;
                System.out.println("NIK tidak valid");

            }
            static void NIK() {

                Scanner inputReg = new Scanner(System.in);
                System.out.println("masukan nik registrasi");
                String NIK = inputReg.nextLine();

                CekNIKPegawaiKFC(nik);

                if (success) {
                    printresult();
                }
            }
            static void printresult(){
                System.out.println("jum;ah penumpang bus 01-TopLevel = " + JumlahTopLevel);
                System.out.println("jumlah penumpang bus 02-MidLevel = " + JumlahMiddleLevel);
                System.out.println("Jumlah penumpang bus 03-RegStaff = " + JumlahRegularStaff);
                System.out.println("Jumlah penumpang bus 04-Staff = " + JumlahStaff);
            }

            }
        }
    }
