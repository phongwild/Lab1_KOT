package phongtaph31865.poly.lab1.Lab2.Bai7

class CBGV {
    private val danhSachGiaoVien: MutableList<Nguoi> = mutableListOf()

    fun themGiaoVien(giaoVien: Nguoi) {
        danhSachGiaoVien.add(giaoVien)
    }

    fun xoaGiaoVien(maSoGV: String) {
        danhSachGiaoVien.removeIf { it.maSoGV == maSoGV }
    }

    fun timKiemGiaoVien(maSoGV: String): Nguoi? {
        return danhSachGiaoVien.find { it.maSoGV == maSoGV }
    }

    fun hienThiDanhSachGiaoVien() {
        for (i in danhSachGiaoVien) {
            println(i)
        }
    }
}