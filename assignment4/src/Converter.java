public class Converter {

	static String Convert(int grade) {
		
		String letterGrade = "";
		
		if (grade > 100 || grade < 0){
			letterGrade = "not a valid grade";
		}
		else if (grade <= 100 & grade >= 88){
			letterGrade = "A";
		}
		else if (grade <= 87 & grade >= 80){
			letterGrade = "B";
		}
		else if (grade <= 67 & grade >= 79){
			letterGrade = "C";
		}
		else if (grade <= 67 & grade >= 60){
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}		
		return letterGrade;
	}
}
