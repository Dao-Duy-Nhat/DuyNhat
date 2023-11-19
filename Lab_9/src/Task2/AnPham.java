package Task2;

public abstract class  AnPham {
	protected String tieuDe; 
	protected int soTrang; 
	protected int namXuatBan;
	protected String tacGia;
	protected double giaTien;
	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien) {
		super();
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.giaTien = giaTien;
	}
	@Override
	public String toString() {
		return "AnPham [tieuDe=" + tieuDe + ", soTrang=" + soTrang + ", namXuatBan=" + namXuatBan + ", tacGia=" + tacGia
				+ ", giaTien=" + giaTien + "]";
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public int getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	
	
	 public String xacDinhLoaiAnPham() {
	        return "An Pham Chua Xac Dinh Loai";
	    }
	 
	 public abstract boolean isSachKhamKhao();
	
	
}
