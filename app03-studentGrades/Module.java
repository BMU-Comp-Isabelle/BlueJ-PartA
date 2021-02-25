
/**
 * This class represents each of the Modules that the
 * student will take as part of the course.
 * It holds the title, module code, and percentage mark.
 * 
 * @author Isabelle Thorpe
 * @version 23/02/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String title;
    private String code;
    private int moduleMark;
    private boolean isCompleted;

    /**
     * Constructor for objects of class Module
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
     * This method awards the mark for the module
     */
    public void awardmoduleMark(int moduleMark)
    {
        if(moduleMark >= 0 && moduleMark <= 100)
        {
            this.moduleMark = moduleMark;
            checkCompletion();
        }
        else
        {
            System.out.println("Please enter a mark between 0 nad 100"); 
        }
    }

    /**
     * This method checks to see if the module is complete
     */
    public void checkCompletion()
    {
        if(moduleMark >= 40)
        {
            this.isCompleted = true;
        }
    }

    /**
     * This method returns if the module is complete or not
     */
    public boolean getCompletionStatus()
    {   
        checkCompletion();
        return isCompleted;
    }

    public int getmoduleMark()
    {
        return moduleMark;
    }
    
    public String getmoduleCode()
    {
        return code;
    }
    
        public String getmoduleTitle()
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