import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import tests.TestExecutor;

public class Runner {
    private static final Log LOG = LogFactory.getLog(Runner.class);

    @Test
    public void executeTest(){
        if(StringUtils.isBlank(System.getenv("test")))
            throw new RuntimeException("No test class provided");

        try {
            String[] test = System.getenv("test").split("\\.");
            String packageName = test[0];
            String className = test[1];
            String executorClass = String.format("executors.%s.%s", packageName, className);
            String dataClass = String.format("testdata.%s.%sData", packageName, className);
            LOG.info("Executing Test:: " + packageName + "." + className);
            new TestExecutor().executor(Class.forName(executorClass), Class.forName(dataClass));
        } catch (ClassNotFoundException e) {
           LOG.error("Can't find test class");
        }
    }
}
