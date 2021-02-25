
/**
 * This class represents information about a course
 * that enrolled students may want to complete.
 * It holds the course title, code, modules assigned, and the final grade through %.
 *
 * @author Isabelle Thorpe
 * @version 24/02/2021
 */
public class Course
{
    // the course's title
    private String title;
    // the course's code number
    private String codeNo;

    // modules 1-4 that can be assigned to a course
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    //  the completion status of a course
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
        System.out.println("Module 1: " + module1.getModuleTitle() + " (" + module1.getModuleCode() + ") Mark: " + module1.getModuleMark());
        System.out.println("Module 2: " + module2.getModuleTitle() + " (" + module2.getModuleCode() + ") Mark: " + module2.getModuleMark());
        System.out.println("Module 3: " + module3.getModuleTitle() + " (" + module3.getModuleCode() + ") Mark: " + module3.getModuleMark());
        System.out.println("Module 4: " + module4.getModuleTitle() + " (" + module4.getModuleCode() + ") Mark: " + module4.getModuleMark());
        System.out.println("Final Grade: " + getFinalGrade());
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

    /**
     * Get final grade of the entire course
     */
    public String getFinalGrade()
    {
        int totalMark = (module1.getModuleMark() + module2.getModuleMark() + 
                module3.getModuleMark() + module4.getModuleMark()) / 4;

        if(totalMark <= 39)
        { 
            return "F";
        }
        else if(totalMark <= 49)
        {
            return "D";
        }
        else if(totalMark <= 59)
        {
            return "C";
        }
        else if(totalMark <= 69)
        {
            return "B";
        }
        else
        {
            return "A";
        }

    }
}