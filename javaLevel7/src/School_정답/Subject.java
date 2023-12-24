package School_정답;

public class Subject {
	int stuNo;
	String subName;
	int score;
	
	Subject(int stuNo, String subName, int score) {
		this.stuNo = stuNo;
		this.subName = subName;
		this.score = score;
	}

	@Override
	public String toString() {
		return subName+" "+score+"점 "; 
	}
	
	String saveToData() {
		return "%d/%s/%d\n".formatted(stuNo,subName,score);
	}
	
}
