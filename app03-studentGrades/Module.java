
/**
 * This class represents each of the Modules that the
 * student will take as part of the course.
 * It holds the title, module code, module mark, and module completion status.
 * 
 * @author Isabelle Thorpe
 * @version 24/02/2021
 */
public class Module
{
    // the module's title
    private String title;
    // the module's code 
    private String code;
    // the module mark
    private int moduleMark;
    // the completion statement of the module, true or false
    private boolean isCompleted;

    /**
     * Create a new module with title, code, ability to add marks and completion statement.
     */
    public Module(String title, String code)
    {
        // initialise instance variables
        this.title = title;
        this.code = code;
        this.moduleMark = 0;
        this.isCompleted = false;
    }

    /**
     * This method awards the mark for the module.
     */
    public void awardModuleMark(int moduleMark)
    {
        if(moduleMark >= 0 && moduleMark <= 100)
        {
            this.moduleMark = moduleMark;
            checkCompletion();
        }
        else
        {
            System.out.println("Please enter a mark between 0 and 100"); 
        }
    }

    /**
     * This method checks to see if the module is complete.
     */
    public void checkCompletion()
    {
        if(moduleMark >= 40)
        {
            this.isCompleted = true;
        }
    }

    /**
     * This method returns if the module is complete or not.
     */
    public boolean getCompletionStatus()
    {   
        checkCompletion();
        return isCompleted;
    }

    /**
     * This method returns the module mark.
     */
    public int getModuleMark()
    {
        return moduleMark;
    }

    /**
     * This method returns the module code.
     */
    public String getModuleCode()
    {
        return code;
    }

    /**
     * This method returns the module title.
     */
    public String getModuleTitle()
    {
        return title;
    }

    /**
     * This method prints out the module details
     */
    public void print()
    {
        System.out.println("\nModule code: " + code);
        System.out.println("Module title: " + title);
        System.out.println("Module mark: " + moduleMark);
        System.out.println("Module completion: " + isCompleted);
    }

}