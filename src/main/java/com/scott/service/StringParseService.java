package com.scott.service;

import org.springframework.stereotype.Service;

import static com.scott.utils.StringParseUtil.getAlphabetString;
import static com.scott.utils.StringParseUtil.getMostFrequencyCharAndCount;

/**
 * Created by goalert on 18/03/17.
 */
@Service
public class StringParseService {

    public static final String THE_LETTERS_ARE = "The letters are: ";
    public static final String THE_MOST_FREQUENT_LETTER_IS = " The most frequent letter is ";
    public static final String AND_THE_FREQUENCY_IS = ", and the frequency is ";

    public String filterString(String input) {
        String onlyCharString;
        onlyCharString = getAlphabetString(input);
        MostFeqCharAndCount mostFeqCharAndCount = getMostFrequencyCharAndCount(onlyCharString);
        return THE_LETTERS_ARE + onlyCharString + THE_MOST_FREQUENT_LETTER_IS + mostFeqCharAndCount.getMostFeqChar() + AND_THE_FREQUENCY_IS + mostFeqCharAndCount.getCount();
    }
}
