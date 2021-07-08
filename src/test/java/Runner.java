import arraysandstrings.LongestSubstringWithoutRepetition;
import arraysandstrings.RomanToInteger;
import testdata.ExecutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please provide the class enum to be executed: ");
        String executableClassInput = sc.nextLine();
        executor(ExecutableClasses.valueOf(executableClassInput)).forEach(System.out::println);
    }

    public static List<Object> executor(ExecutableClasses executableClass){
        List<Object> outputList = new ArrayList<>();
        switch (executableClass) {
            case ROMAN_TO_INTEGER:
                executableClass.getLabel().forEach(input -> outputList.add(new RomanToInteger().romanToInt(input.get(0))));
                break;
            case LONGEST_SUBSTRING_WITHOUT_REPETITION:
                executableClass.getLabel().forEach(input -> outputList.add(new LongestSubstringWithoutRepetition().lengthOfLongestSubstring(input.get(0))));
                break;
        }
        return outputList;
    }
}
