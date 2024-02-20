package memeber;

public class Member {

	// #field
	private int memberId;
	private String memberName;

	// #constructor
	public Member() {
	};

	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}// end of constructor

	// method
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberId + " = " + memberName;
	}// end of toString

}// end of class
