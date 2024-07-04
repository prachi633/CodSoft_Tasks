public class Course {

    String code;
    String title;
    String description;
    int capacity;
    String schedule;
    int enroll;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enroll = 0;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Course [code=" + code + ", title=" + title + ", description=" + description + ", capacity=" + capacity
                + ", schedule=" + schedule + "]";
    }

    public boolean registerStudent() {
        if (enroll < capacity) {
            enroll++;
            return true;
        }
        return false;
    }

    public boolean dropStudent() {
        if (enroll > 0) {
            enroll--;
            return true;
        }
        return false;
    }

    public int getAvailableSlots() {
        return capacity - enroll;
    }
}
