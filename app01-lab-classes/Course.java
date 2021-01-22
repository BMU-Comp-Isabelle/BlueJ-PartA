
/**
 * This represents the Courses that students will enrol on.
 * It stores the code number and title.
 *
 * @author Isabelle Thorpe 
 * @version 22/01/2021 
 */
public class Course
{
    private String codeNumber;
    private String title;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNumber, String title)
    {
        this.codeNumber = codeNumber;
        this.title = title;
    }

    /**
     * This method prints out the course details
     */
    public void print()
    {
        System.out.println("Code: " + codeNumber);
        System.out.println("Title: " + title);
    }
}
