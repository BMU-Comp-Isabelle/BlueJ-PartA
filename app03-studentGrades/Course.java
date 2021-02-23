
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Isabelle Thorpe
 * @version 23/02/2021
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private boolean isCompleted;

    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        isCompleted = false;
    }

    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course: " + codeNo + " - " + title);
    }

    /**
     * Add a module for the course
     */
    public void addModule(Module module, int moduleNumber)
    {
        if(moduleNumber == 1)
        {
            this.module1 = module;
        }
        else if(moduleNumber == 2)
        {
            this.module2 = module;
        }
        else if(moduleNumber == 3)
        {
            this.module3 = module;
        }
        else if(moduleNumber == 4)
        {
            this.module4 = module;
        }
    }

    /**
     * Check completion status for the course
     */
    public void checkCompletion()
    {
        if(module1.getCompletionStatus() == true
        && module2.getCompletionStatus() == true 
        && module3.getCompletionStatus() == true 
        && module4.getCompletionStatus() == true)
        {
            isCompleted = true;
        }
        else
        {
            isCompleted = false;
            System.out.println("Please complete all modules");

        }
    }
}
