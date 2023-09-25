class mahluk_hidup {
    String nama;


    public mahluk_hidup(String nama){
        this.nama = nama;
    }

    public void warna(){
        System.out.println("Mahluk hidup ini berwarna: ");
    }
}

class Mawar extends mahluk_hidup {
    public Mawar(String nama){
        super(nama);
    }

    public void warna() {
        System.out.println(nama + "mawar ini berwarna: merah");
    }
}

class Melati extends mahluk_hidup {
    public Melati(String nama){
        super (nama);
    }

    @Override
    public void warna (){
        System.out.println(nama + "Melati ini berwarna: putih");
    }
}