package org.kh.object1;

public class Member {
      private String id;
	  private String pw;
	  private String email;
	  private int birth;
	  private int tel;
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getPw() {
		return pw;
	}




	public void setPw(String pw) {
		this.pw = pw;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getBirth() {
		return birth;
	}




	public void setBirth(int birth) {
		this.birth = birth;
	}




	public int getTel() {
		return tel;
	}




	public void setTel(int tel) {
		this.tel = tel;
	}




	
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel=" + tel + "]";
	}
}
