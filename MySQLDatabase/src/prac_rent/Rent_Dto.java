package prac_rent;

public class Rent_Dto {
	private String rentdate;
	private int numseq;
	private int booknum;
	private int membernum;
	private int discount;
	public String getRentdate() {
		return rentdate;
	}
	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}
	public int getNumseq() {
		return numseq;
	}
	public void setNumseq(int numseq) {
		this.numseq = numseq;
	}
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public int getMembernum() {
		return membernum;
	}
	public void setMembernum(int membernum) {
		this.membernum = membernum;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
