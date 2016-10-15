package productpack;

public class Product {
	private int prodid;
	private String prodname;
	private String proddesc;
	private int prodprice;
	
	public Product(int prodid, String prodname, String proddesc, int prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.proddesc = proddesc;
		this.prodprice = prodprice;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getProddesc() {
		return proddesc;
	}

	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	
	

}
