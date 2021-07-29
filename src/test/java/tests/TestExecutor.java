package tests;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class TestExecutor {
    private static final Log LOG = LogFactory.getLog(TestExecutor.class);

    public void executor(Class<?> executorClass, Class<?> dataClass){
        List<String> actualOutputList;
        List<String> expectedOutputList;
        try {
            Object dataClassObject = dataClass.getConstructor().newInstance();
            Object executorClassObject = executorClass.getConstructor().newInstance();
            List<List<String>> inputList = (List<List<String>>) dataClass.getDeclaredMethod("getInputs").invoke(dataClassObject);
            expectedOutputList = (List<String>) dataClass.getDeclaredMethod("getOutputs").invoke(dataClassObject);
            actualOutputList = (List<String>) executorClass.getDeclaredMethod("execute", List.class).invoke(executorClassObject, inputList);
        } catch (Exception e) {
            LOG.error("Invalid test class execution");
            return;
        }
        new TestAssertion().assertOutputs(expectedOutputList, actualOutputList);
    }
}
