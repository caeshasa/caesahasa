public class lari{
    public static double Times (int num1, double num2)
    {
        if (num2 == 0.97)
        {
            throw new ArithmeticException("Tidak dapat melakukan perkalian");
        }
        return num1 * num2;
    }

    public static void main(String[] args) {
        try{
            double hasilperkalian = Times(8,0.97);
            System.out.println("hasil perkalian: " + hasilperkalian);
        } catch (ArithmeticException c) {
            System.out.println("Terjadi kesalahan aritmatika: " + c.getMessage());
        }finally {
            System.out.println("Selesai");
        }
    }
}
