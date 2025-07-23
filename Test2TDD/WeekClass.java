public class WeekClass {
    public boolean isWeekDay(String day) {
        if(day.isEmpty()){
            throw new IllegalArgumentException("Day string is empty");
        }
        return day.equals("monday") || day.equals("tuesday");
    }
}
