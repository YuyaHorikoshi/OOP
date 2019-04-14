package ex00;

public class Address{
	private String name;
	private String address;
	private String tel;
	private String emaill;

	Address(String name, String address, String tel, String emaill){

	}

/******************* SETmethod *******************/
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setTel(String tel){
		this.tel = tel;
	}
	public void setEmail(String emaill){
		this.emaill = emaill;
	}

//--- GETmethod 
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getTel(){
		return tel;
	}
	public String getEmail(){
		return emaill;
	}

/******************* toStringmethod *******************/
	public String toString(){
		String str = name +","+ address +","+ tel +","+ emaill;
		return str;
	}

}