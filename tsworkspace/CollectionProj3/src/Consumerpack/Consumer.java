package Consumerpack;

public class Consumer {
	private int Cust_id;
	private String Cust_name;
	private int Phone;
	private String DOP;
	private int modelid;
	private String payment_info;
	private int billamt;
	
	
	public Consumer(int cust_id, String cust_name, int phone, String dOP)
    {
		super();
		Cust_id = cust_id;
		Cust_name = cust_name;
		Phone = phone;
		DOP = dOP;
		this.modelid = 0;
		this.payment_info = null;
		this.billamt=0;
	}
	public int getCust_id() {
		return Cust_id;
	}
	public void setCust_id(int cust_id) {
		Cust_id = cust_id;
	}
	public String getCust_name() {
		return Cust_name;
	}
	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getDOP() {
		return DOP;
	}
	public void setDOP(String dOP) {
		DOP = dOP;
	}
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getPayment_info() {
		return payment_info;
	}
	public void setPayment_info(String payment_info) {
		this.payment_info = payment_info;
	}
	public int getBillamt() {
		return billamt;
	}
	public void setBillamt(int billamt) {
		this.billamt = billamt;
	}
	
	public void printbill()
	{   System.out.println("**********Bill***********");
		System.out.println(Cust_id);
		System.out.println(Cust_name);
		System.out.println(Phone);
		System.out.println(modelid);
		System.out.println(DOP);
		System.out.println(billamt);
		System.out.println(payment_info);
	}

}
