package School_정답;

import java.util.Arrays;

public class Student {
	int stuNo;
	String stuName;
	String stuId;
	Subject[] subjects;

	Student(int stuNo, String stuName, String stuId) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		String data = stuNo + "\t" + stuName + "\t" + stuId;
		if (subjects != null) {
			data += "\n" + Arrays.toString(subjects) + "\n";
		}
		return data;
	}

	String saveToData() {
		return "%d/%s/%s\n".formatted(stuNo, stuName, stuId);
	}
}
