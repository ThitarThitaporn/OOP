public class Pro2_64011100 {
    public static void main(String[] args) {
        Course course = new Course("Math");
        course.addStudent("Thitar");
        course.addStudent("Bam");
        course.addStudent("Bee");
        course.dropStudent("Bam");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("Student " + (i + 1) + " is " + course.getStudents()[i]);
        }
    }
}