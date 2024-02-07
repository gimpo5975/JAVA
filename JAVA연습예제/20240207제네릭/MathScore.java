package genericExam;

public class MathScore implements Comparable<MathScore> {

	// 1) 필드
	String name;
	int score;

	// 2) 생성자
	public MathScore(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(MathScore o) {
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
