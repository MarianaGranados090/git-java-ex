public class student {
    private String name;
    private String dateofBirth;
    private boolean hasStudentHousing;
    private course course;

    public student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setHasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public String getName() {
        return name;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public boolean getHasStudentHousing() {
        return hasStudentHousing;
    }

    public void setCourse(course course) {
        this.course = course;
    }

    public course getCourse() {
        return course;
    }
}
