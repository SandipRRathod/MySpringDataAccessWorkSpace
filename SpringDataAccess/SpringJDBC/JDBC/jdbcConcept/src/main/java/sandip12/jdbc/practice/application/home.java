package sandip12.jdbc.practice.application;

import org.springframework.beans.factory.annotation.Value;


public class home {
	private String FName;
	private String MName;
	private String BName;
	
	
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	
	@Override
	public String toString() {
		return "home [FName=" + FName + ", MName=" + MName + ", BName=" + BName + "]";
	}
	
}
