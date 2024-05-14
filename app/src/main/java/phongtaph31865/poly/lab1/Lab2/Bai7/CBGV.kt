package phongtaph31865.poly.lab1.Lab2.Bai7

class CBGV {
//    var luongCung: Float
//    var lThuong: Float?
//    var lPhat: Float?
//    var lThucLinh: Float = 0f
    //get() = luongCung + (lThuong ?: 0f) - (lPhat ?: 0f)
    private val danhSachGiaoVien: MutableList<Nguoi> = mutableListOf()

//    constructor(
//        hoTen: String,
//        tuoi: Int,
//        queQuan: String,
//        maSoGV: String,
//        luongCung: Float,
//        lThuong: Float?,
//        lPhat: Float?
//    ) : super(hoTen, tuoi, queQuan, maSoGV) {
//        this.luongCung = luongCung
//        this.lThuong = lThuong
//        this.lPhat = lPhat
//        this.lThucLinh = luongCung + (lThuong ?: 0f) - (lPhat ?: 0f)
//    }


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