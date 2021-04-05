import java.io.IOException;
import java.lang.InterruptedException;

/**
 * Runs o2s application user interface
 *
 * @author Isabelle Thorpe
 * @version 31/03/21
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main() throws IOException, InterruptedException
    {
        app = new StockApp();
        app.run();
    }
}
