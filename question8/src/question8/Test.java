package question8;

public class Test {

	public static void main(String[] args) {
		CourseRegistration user = new CourseRegistration("Peter", 5001, 58, 1005, true);
		boolean validMarks = user.validateMarks();
		boolean validCourseId = user.validateCourseId();
		if (validMarks && validCourseId) 
			user.calculateCourseFee();
		CourseRegistration user1 = new CourseRegistration("Peter", 5001, 68, 1006, true);
		validMarks = user1.validateMarks();
		validCourseId = user1.validateCourseId();
		if (validMarks && validCourseId) 
			user.calculateCourseFee();
		CourseRegistration user2 = new CourseRegistration("Peter", 5001, 78, 1005, false);
		validMarks = user2.validateMarks();
		validCourseId = user2.validateCourseId();
		if (validMarks && validCourseId) {
			user2.calculateCourseFee();
			System.out.println(user2.toString());
		}
	}

}
