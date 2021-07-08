package utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateInputOutputDataList {

    public static String delimiter;

    /**
     * @param args Delimiter separated string param to be converted to a List<String>
     * @return List of strings
     */
    public static List<String> getList(String args){
        delimiter = StringUtils.isEmpty(delimiter) ? "," : delimiter;
        return Arrays.asList(args.split(delimiter));
    }

    /**
     * @param args JSONArray as string to generate a list of list
     *             format: [{a,b},{c,d}]
     * @return Nested list of Strings
     * sample output[0] : a,b
     * sample output[1] : c,d
     */
    public static List<List<String>> getLists(String args){
        List<List<String>> list = new ArrayList<>();
        String regex = "\\{(.*?)}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(args);
        while (m.find()) {
            list.add(Arrays.asList(m.group(1).split(",")));
        }
        return list;
    }
}
