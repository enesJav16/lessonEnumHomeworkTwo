import java.util.Locale;

public enum Days {
    MONDAY("Java"),
    TUESDAY("JS"),
    WEDNESDAY("English"),
    THURSDAY("Turkish"),
    FRIDAY("Python"),
    SATURDAY("Math"),
    SUNDAY("History");
    private String lesson;

    Days(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }


}
