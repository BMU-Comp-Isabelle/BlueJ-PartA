import java.util.*;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details including name, ID and assigned course.
 * 
 * @author Isabelle Thorpe
 * @version 24/02/2021
 */
public class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the course the student is taking
    private Course course;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {   
        // initialise instance variables
        name = fullName;
        id = studentID;
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }

    /**
     * Enrol the student onto chosen course.
     */
    public void enrolOnCourse(Course course)
    {
        this.course = course;
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        course.print();
    }
}
