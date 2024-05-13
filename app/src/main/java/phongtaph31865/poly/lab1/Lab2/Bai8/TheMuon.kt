package phongtaph31865.poly.lab1.Lab2.Bai8

class TheMuon(
    val maPhieuMuon: Int,
    val ngayMuon: Int,
    val hanTra: Int,
    val soHieuSach: String,
    val sinhVien: SinhVien
) {
    override fun toString(): String {
        return "TheMuon(maPhieuMuon=$maPhieuMuon, ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach', sinhVien=$sinhVien)"
    }

}
