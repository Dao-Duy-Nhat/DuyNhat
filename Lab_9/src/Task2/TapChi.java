package Task2;

public class TapChi extends AnPham {
	private String tenTapChi;

	public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String tenTapChi) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.tenTapChi = tenTapChi;
	}

	public String getTenTapChi() {
		return tenTapChi;
	}

	public void setTenTapChi(String tenTapChi) {
		this.tenTapChi = tenTapChi;
	}
	
	

	

	@Override
	public String toString() {
		return "TapChi [tenTapChi=" + tenTapChi + ", tieuDe=" + tieuDe + ", soTrang=" + soTrang + ", namXuatBan="
				+ namXuatBan + ", tacGia=" + tacGia + ", giaTien=" + giaTien + "]";
	}

	@Override
	public String xacDinhLoaiAnPham() {
		return "Tạp chí";
	}

	@Override
	public boolean isSachKhamKhao() {
		return false;
	}

	
}