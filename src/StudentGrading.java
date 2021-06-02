import java.util.ArrayList;
import java.util.List;

public class StudentGrading {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) < 38 || (grades.get(i)%5<3)) {
				//System.out.println("No Grades change");
				list.add(grades.get(i));
			}

			else  {
				list.add(grades.get(i)+(5-grades.get(i)%5));
			} 
		}

		return list;
		// Write your code here

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		
		System.out.println(gradingStudents(list));
	}
}
