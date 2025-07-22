//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        student st1 = new student();
        st1.setName("Joe Briggs");
        st1.setDateofBirth("30/06/94");
        st1.setHasStudentHousing(true);
        //st1.course = new course();
        //st1.course.title = "Computer Science";

        //instead of doing st1.getCourse().setTitle
//        course c = st1.getCourse();
//        c.setTitle("Math");
//        c.setLevel("Graduate");
//        c.setStartDate("05/31/03");

        st1.setCourse(new course());
        st1.getCourse().setTitle("Computer Science");
        st1.getCourse().setStartDate("07/08/2021");
        st1.getCourse().setLevel("Undergraduate");

        System.out.println("Name: "+st1.getName());
        System.out.println("DOB: "+st1.getDateofBirth());
        System.out.println("Has housing?: "+ st1.getHasStudentHousing());
        //System.out.println("Course name: "+ st1.course.title);
        System.out.println("Course name: "+st1.getCourse().getTitle()+ " starts on "+st1.getCourse().getStartDate());
    }
}
