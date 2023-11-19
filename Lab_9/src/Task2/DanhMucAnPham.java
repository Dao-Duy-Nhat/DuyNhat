package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DanhMucAnPham {
	private List<AnPham> danhSachAnPham;

	public DanhMucAnPham() {
		danhSachAnPham = new ArrayList<>();
	}

	public void themAnPham(AnPham anPham) {
		danhSachAnPham.add(anPham);
	}

	@Override
	public String toString() {
		return "DanhMucAnPham [danhSachAnPham=" + danhSachAnPham + "]";
	}

	public boolean kiemTraTapChiSanXuat(TapChi tapChi, int year) {
		return tapChi.getNamXuatBan() + 10 == year;

	}

	public boolean kiemTraCungLoaiVaTacGia(AnPham anPham1, AnPham anPham2) {
		return anPham1.getClass() == anPham2.getClass() && anPham1.tacGia.equals(anPham2.tacGia);
	}

	public double tongTien() {
		double sum = 0;
		for (AnPham anPham : danhSachAnPham) {
			sum += anPham.getGiaTien();
		}
		return sum;
	}

	public SachKhamKhao sachCoNhieuChuongNhat() {
		SachKhamKhao sachNhieuChuong = null;
		double trangNhieuNhat = 0;
		double tongSoTrang = 0;

		for (AnPham anPham : danhSachAnPham) {
			if (anPham.isSachKhamKhao()) {
				SachKhamKhao sach = (SachKhamKhao) anPham;
				trangNhieuNhat = sach.tongSoTrang();
				if (trangNhieuNhat > tongSoTrang) {
					tongSoTrang = trangNhieuNhat;
					sachNhieuChuong = sach;
					trangNhieuNhat = 0;
				}
			}

		}
		return sachNhieuChuong;
	}
	
	public TapChi timTapChiChoTruoc(String tenTapChi) {
		 TapChi tapChi = null;
		 for (AnPham anPham : danhSachAnPham) {
			if (!anPham.isSachKhamKhao()) {
				TapChi tc = (TapChi) anPham;
				if (tc.getTenTapChi().equalsIgnoreCase(tenTapChi)) {
					tapChi = tc;
				}
			}
		}
		 return tapChi;
	}
	
	 public Set<TapChi> layDanhSachTapChiTheoNam(int namXuatBan) {
	       Set<TapChi> danhSachTapChi = new HashSet<>();
	        for (AnPham anPham : danhSachAnPham) {
	            if (!anPham.isSachKhamKhao() && anPham.namXuatBan == namXuatBan) {
	                TapChi tapChi = (TapChi) anPham;
	                danhSachTapChi.add(tapChi);
	            }
	        }
	        return danhSachTapChi;
	    
	}
	 
	 public void sapXepAnPham() {
	        Collections.sort(danhSachAnPham, new Comparator<AnPham>() {
	            @Override
	            public int compare(AnPham o1, AnPham o2) {
	                int compareByTitle = o1.getTieuDe().compareTo(o2.getTieuDe());
	                if (compareByTitle != 0) {
	                    return compareByTitle;
	                }
	                return Integer.compare(o2.getNamXuatBan(), o1.getNamXuatBan());
	            }
	        });
	    }
	 
	 public void thongKeSoLuongTheoNam() {
	        Map<Integer, Integer> thongKeNamXuatBan = new HashMap<>();
	        for (AnPham anPham : danhSachAnPham) {
	            int namXuatBan = anPham.namXuatBan;
	            thongKeNamXuatBan.put(namXuatBan, thongKeNamXuatBan.getOrDefault(namXuatBan, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> entry : thongKeNamXuatBan.entrySet()) {
	            System.out.println("Năm " + entry.getKey() + ": " + entry.getValue() + " ấn phẩm");
	        }
	    }
	
}