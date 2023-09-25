public class mainpeop {
    public static void main(String[] args) {
        humans orang = new humans();
        orang.setNama("Caesa");
        orang.setDOB("3 November 2004");
        orang.setPekerjaan("Mahasiswa");
        orang.setJenis_kelamin("Perempuan");

        System.out.println("data orang");
        System.out.println("Nama: " + orang.getNama());
        System.out.println("DOB: " + orang.getDOB());
        System.out.println("Pekerjaan: "+ orang.getPekerjaan());
        System.out.println("jenis_kelamin: "+ orang.getJenis_kelamin());

    }
}
