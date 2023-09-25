import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan nilai siswa");
            int nilai = input.nextInt();

            if (nilai < 0){
                throw new IllegalArgumentException("nilai tidak boleh lebih dari 100.");
            }
            int nilaiUTS = nilai / 8;
            System.out.println("Nilai siswa:" + nilaiUTS);
        } catch (java.util.InputMismatchException c)
        {
            System.out.println("Tidak bisa menghitung nilai uts.");
        }
        catch (IllegalArgumentException c){
            System.out.println("kesalahan: " + c.getMessage());
        }
        finally {
            input.close();
            System.out.println("Selesai.");
        }
    }

}
