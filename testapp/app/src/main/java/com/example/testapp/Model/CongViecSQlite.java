package com.example.testapp.Model;

public class CongViecSQlite {
    private String tieude;
    private String ghichu;
    private String email;
    private String ngaybatdau;
    private String giobatdau;
    private String gioketthuc;
    private String tennhan;
    private String trangthai;
    private String nhacnho;
    private String id;

    public CongViecSQlite() {
    }

    public CongViecSQlite(String tieude, String ghichu, String email, String ngaybatdau,
                          String giobatdau, String gioketthuc, String tennhan, String trangthai,
                          String nhacnho, String id) {
        this.tieude = tieude;
        this.ghichu = ghichu;
        this.email = email;
        this.ngaybatdau = ngaybatdau;
        this.giobatdau = giobatdau;
        this.gioketthuc = gioketthuc;
        this.tennhan = tennhan;
        this.trangthai = trangthai;
        this.nhacnho = nhacnho;
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getGiobatdau() {
        return giobatdau;
    }

    public void setGiobatdau(String giobatdau) {
        this.giobatdau = giobatdau;
    }

    public String getGioketthuc() {
        return gioketthuc;
    }

    public void setGioketthuc(String gioketthuc) {
        this.gioketthuc = gioketthuc;
    }

    public String getTennhan() {
        return tennhan;
    }

    public void setTennhan(String tennhan) {
        this.tennhan = tennhan;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getNhacnho() {
        return nhacnho;
    }

    public void setNhacnho(String nhacnho) {
        this.nhacnho = nhacnho;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
