package question8;

public class CourseRegistration {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String isHostelRequired() {
		if (hostelRequired)
			return "Yes";
		else		
			return "No";
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	
	public boolean validateMarks() {
		if(this.qualifyingMarks >= 65 && this.qualifyingMarks <=100) {
		 return true;
		}
		else
		{ 
			System.out.println("Marks are less than 65. You are not eligible for admission");
			return false;
		}
	}
	
	public boolean validateCourseId() {
		if ( this.courseId == 1001 ||this.courseId == 1002 ||
			 this.courseId == 1003 || this.courseId == 1004 ||
			 this.courseId == 1005
				)
		 return true;
		else
		{ 
			System.out.println("Invalid course Id . Please try again");
			return false;
		}
	}
	
	public void calculateCourseFee() {
		if (this.courseId == 1001 )
			this.courseFee = 55000;
		else if (this.courseId == 1002)
			this.courseFee = 35675;
		else if (this.courseId == 1003)
			this.courseFee = 28300;
		else if (this.courseId == 1004)
			this.courseFee = 22350;
		else if (this.courseId == 1005)
			this.courseFee = 115000;
		
		if (this.qualifyingMarks >=65 && this.qualifyingMarks <= 69)
			this.courseFee = this.courseFee + this.courseFee * 0.05;
		else if (this.qualifyingMarks >=70 && this.qualifyingMarks <= 84)
			this.courseFee = this.courseFee + this.courseFee * 0.1;
		else if (this.qualifyingMarks >=85)
			this.courseFee = this.courseFee + this.courseFee * 0.15;
	}
	public CourseRegistration(String studentName, int registrationId, float qualifyingMarks, 
			int courseId, boolean hostelRequired) {
		super();
		this.studentName = studentName;
		this.registrationId = registrationId;
		this.qualifyingMarks = qualifyingMarks;
		this.courseId = courseId;
		this.hostelRequired = hostelRequired;
	}
	@Override
	public String toString() {
		return "*******CourseRegistration allocation details******" + "\nStudentName=" + studentName
				+ "\nCourseId=" + courseId
				+ "\nQualifying Exam Marks=" + qualifyingMarks
				+ "\nStudent's registration Id=" + registrationId
				+ "\n Total courseFee=" + courseFee
				+ "\n Hostel required=" + isHostelRequired();
	}
}
