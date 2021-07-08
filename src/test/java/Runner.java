import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import testdata.DataMap;
import tests.TestExecutor;

import static testdata.DataMap.ROMAN_TO_INTEGER;

public class Runner {
    private static final Log LOG = LogFactory.getLog(Runner.class);

    @Test
    public void executeTest() {
        String executableClassInput = StringUtils.isNotEmpty(System.getenv("TestName")) ?
                System.getenv("TestName") : ROMAN_TO_INTEGER.name();
        LOG.info("Executing Test:: " + executableClassInput);
        try {
            new TestExecutor().executor(DataMap.valueOf(executableClassInput));
        } catch (Exception e){
            LOG.error(String.format("Got exception %s while executing test %s", e.getMessage(), executableClassInput));
        }
    }
}
