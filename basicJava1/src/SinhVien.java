public class SinhVien {
    String ten;

    static String truong = "HCMUS";

    public void hienThi() {
        String lop = "20bit";

        System.out.println("Ten: " + ten);
        System.out.println("Truong: " + truong);
        System.out.println("Lop: " + lop);
        System.out.println("Dia chi: " + ThongTin.diachi);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.ten = "Nguyen Van A";
        sv.hienThi();
    }


    class ThongTin {
        static String diachi = "Nguyen Van Cu, Q5, HCM";
    }

}
