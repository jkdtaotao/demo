package com.scott.utils;


import com.scott.service.MostFeqCharAndCount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by goalert on 18/03/17.
 */
public class StringParseUtil {

    public static String getAlphabetString(String input) {
        String result;
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matcher = pattern.matcher(input);
        result = matcher.replaceAll("").trim();

        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(result);
        result = m.replaceAll("").trim();
        return result;
    }

    public static MostFeqCharAndCount getMostFrequencyCharAndCount(String input) {
        String[] arr = input.toLowerCase().split("");
        MostFeqCharAndCount result = new MostFeqCharAndCount();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int tempCount = map.get(arr[i]);
                map.put(arr[i], ++tempCount);
            } else {
                map.put(arr[i], 1);
            }
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int count = 0;
        String maxCountWord = arr[0];
        while (it.hasNext()) {
            Map.Entry<String, Integer> en = it.next();
            int tempCount = en.getValue();
            if (tempCount > count) {
                count = tempCount;
                maxCountWord = en.getKey();
            }
        }
        result.setCount(count);
        result.setMostFeqChar(maxCountWord);
        return result;
    }
}
