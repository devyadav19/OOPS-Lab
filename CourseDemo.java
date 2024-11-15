class Course {
    int id;
    String description;
    int duration; // in weeks
    double fees;

    public Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    public void display() {
        System.out.println("ID: " + id + ", Description: " + description + ", Duration: " + duration + " weeks, Fees: $" + fees);
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course[] courses = {
                new Course(1, "Java Programming", 12, 500),
                new Course(2, "Python Programming", 10, 400),
                new Course(3, "Web Development", 8, 300),
                new Course(4, "Data Science", 16, 700),
                new Course(5, "Machine Learning", 14, 600)
        };

        for (Course course : courses) {
            course.display();
        }
    }
}