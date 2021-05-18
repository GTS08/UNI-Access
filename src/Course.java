public class Course {
	private String code;
	private String title;
	private int semester;
	private int year;
	private boolean isMandatory;
	private boolean hasLab;

	Course(String code, String title, int semester, int year, boolean isMandatory, boolean hasLab) {
		this.setCode(code);
		this.setTitle(title);
		this.setSemester(semester);
		this.setYear(year);
		this.setMandatory(isMandatory);
		this.setHasLab(hasLab);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public boolean isHasLab() {
		return hasLab;
	}

	public void setHasLab(boolean hasLab) {
		this.hasLab = hasLab;
	}

}
