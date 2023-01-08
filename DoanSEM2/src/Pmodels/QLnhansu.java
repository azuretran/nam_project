package Pmodels;

import java.sql.Date;


public class QLnhansu {
	private String MANV;
	public String getMANV() {
		return MANV;
	}
	public void setMANV(String mANV) {
		MANV = mANV;
	}
	public String getHOTENNV() {
		return HOTENNV;
	}
	public void setHOTENNV(String hOTENNV) {
		HOTENNV = hOTENNV;
	}
	public Date getNGAYSINH() {
		return NGAYSINH;
	}
	public void setNGAYSINH(Date nGAYSINH) {
		NGAYSINH = nGAYSINH;
	}
	public String getVITRIHIENTAI() {
		return VITRIHIENTAI;
	}
	public void setVITRIHIENTAI(String vITRIHIENTAI) {
		VITRIHIENTAI = vITRIHIENTAI;
	}
	public String getMAPB() {
		return MAPB;
	}
	public void setMAPB(String mAPB) {
		MAPB = mAPB;
	}
	public String getTHANNHAN() {
		return THANNHAN;
	}
	public void setTHANNHAN(String tHANNHAN) {
		THANNHAN = tHANNHAN;
	}
	public String getMAKN() {
		return MAKN;
	}
	public void setMAKN(String mAKN) {
		MAKN = mAKN;
	}
	public String getMADUAN() {
		return MADUAN;
	}
	public void setMADUAN(String mADUAN) {
		MADUAN = mADUAN;
	}
	private String HOTENNV;
	@Override
	public String toString() {
		return "QLnhansu [MANV=" + MANV + ", HOTENNV=" + HOTENNV + ", NGAYSINH=" + NGAYSINH + ", VITRIHIENTAI="
				+ VITRIHIENTAI + ", MAPB=" + MAPB + ", THANNHAN=" + THANNHAN + ", MAKN=" + MAKN + ", MADUAN=" + MADUAN
				+ "]";
	}
	private Date NGAYSINH;
	public QLnhansu(String mANV, String hOTENNV, Date nGAYSINH, String vITRIHIENTAI, String mAPB, String tHANNHAN,
			String mAKN, String mADUAN) {
		super();
		MANV = mANV;
		HOTENNV = hOTENNV;
		NGAYSINH = nGAYSINH;
		VITRIHIENTAI = vITRIHIENTAI;
		MAPB = mAPB;
		THANNHAN = tHANNHAN;
		MAKN = mAKN;
		MADUAN = mADUAN;
	}
	private String VITRIHIENTAI;
	private String MAPB;
	private String THANNHAN;
	private String MAKN;
	private String MADUAN;
	

}
