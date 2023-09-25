class kendaraannn {
        String nama;


        public kendaraannn(String nama){
            this.nama = nama;
        }

        public void pintu(){
            System.out.println("kendaraan ini berpintu: ");
        }
    }

    class Dua extends kendaraannn {
        public Dua(String nama){
            super(nama);
        }

        public void pintu() {
            System.out.println(nama + "kendaraan ini berpintu: dua");
        }
    }

    class Empat extends kendaraannn {
        public Empat(String nama){
            super (nama);
        }

        @Override
        public void pintu (){
            System.out.println(nama + "kendaraan ini berpintu: empat");
        }
    }

