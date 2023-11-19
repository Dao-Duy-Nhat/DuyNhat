package Task2;

import java.util.ArrayList;
import java.util.List;

public class SachKhamKhao extends AnPham {
	private String linhVuc;
	private List<ChuongSach> chuongSach;

	public SachKhamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, double giaTien, String linhVuc) {
		super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
		this.linhVuc = linhVuc;
		this.chuongSach = new ArrayList<>();
		
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}

	

	@Override
	public String toString() {
		return "SachKhamKhao [linhVuc=" + linhVuc + ", chuongSach=" + chuongSach + ", tieuDe=" + tieuDe + ", soTrang="
				+ soTrang + ", namXuatBan=" + namXuatBan + ", tacGia=" + tacGia + ", giaTien=" + giaTien + "]";
	}

	public List<ChuongSach> getChuongSach() {
		return chuongSach;
	}

	public void setChuongSach(List<ChuongSach> chuongSach) {
		this.chuongSach = chuongSach;
	}
	
	 public void themChuong(ChuongSach chuong) {
	        chuongSach.add(chuong);
	    }

	@Override
	public String xacDinhLoaiAnPham() {
		return "Sách tham khảo";
	}

	@Override
	public boolean isSachKhamKhao() {
		return true;
	}
	
	public int tongSoTrang() {
		int sum = 0;
		for (ChuongSach cs : chuongSach) {
			sum += cs.getSoTrang();
		}
		return sum;
	}
	
	
}
