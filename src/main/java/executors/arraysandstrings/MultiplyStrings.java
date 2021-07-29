package executors.arraysandstrings;

import executors.Execute;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings implements Execute {

    private String multiplyStrings(String a, String b){
        return "";
    }

    @Override
    public List<String> execute(List<List<String>> input) {
        List<String> output = new ArrayList<>();
        input.forEach(it -> output.add(multiplyStrings(it.get(0), it.get(1))));
        return output;
    }
}
