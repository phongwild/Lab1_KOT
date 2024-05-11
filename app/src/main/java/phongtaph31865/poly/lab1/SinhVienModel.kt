package phongtaph31865.poly.lab1

class SinhVienModel(var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null
    constructor( tenSV: String,  mssv: String,  diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }
    fun getTT() : String{
        var totNghiep : String
        if (daTotNghiep == null){
            totNghiep = "Chua co du lieu"
        }else{
            if (daTotNghiep!!){
                totNghiep = "Da tot nghiep"
            }else{
                totNghiep = "Chua tot nghiep"
            }
        }
        var sTuoi: String
        if (tuoi == null){
            sTuoi = "Chua co du lieu"
        }else{
            sTuoi = tuoi.toString()
        }
        return "Ten: $tenSV, mssv: $mssv, Diem TB: $diemTB , \n Tot nghiep: $daTotNghiep, Tuoi: $tuoi"
    }
}
