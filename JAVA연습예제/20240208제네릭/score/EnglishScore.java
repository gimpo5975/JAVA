package genericexam2.score;

public class EnglishScore implements Comparable<EnglishScore> {

	// 필드=> 인스턴스 필드 , 객체가 생성되야 메모리에 올라간다
	String name;// 이름
	int score;// 성적

	// 생성자
	public EnglishScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	// 메소드
	@Override
	public int compareTo(EnglishScore o) {
		if (this.score > o.score) {
			return 1;
		} else if (this.score == o.score) {
			return 0;
		} else {
			return -1;
		} // end of if
	}// end of compareTo

	@Override
	public String toString() {
		return name + " , " + score;
	}// end of toString

}// end of class
