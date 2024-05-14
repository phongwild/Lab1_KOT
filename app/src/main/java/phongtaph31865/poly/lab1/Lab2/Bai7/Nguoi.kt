package phongtaph31865.poly.lab1.Lab2.Bai7

open class Nguoi {
    var hoTen: String = ""
    var tuoi: Int = 0
    var queQuan: String = ""
    var maSoGV: String = ""

    constructor(hoTen: String, tuoi: Int, queQuan: String, maSoGV: String) {
        this.hoTen = hoTen
        this.tuoi = tuoi
        this.queQuan = queQuan
        this.maSoGV = maSoGV
    }

    override fun toString(): String {
        return "Họ tên: $hoTen\nTuổi: $tuoi\nQuê quán: $queQuan\nMã số GV: $maSoGV"
    }
}