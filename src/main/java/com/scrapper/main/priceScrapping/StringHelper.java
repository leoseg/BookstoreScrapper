package com.scrapper.main.priceScrapping;

import com.scrapper.main.dataTypes.Match;
import com.scrapper.main.dataTypes.Matches;
import info.debatty.java.stringsimilarity.SorensenDice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * String helper class for string operations
 */
@Component
public class StringHelper {



    private final SorensenDice sorensenDice = new SorensenDice();

    /**
     * Normalize the string by replacing umlauts and converting to lower case
     * @param string string to normalize
     * @return normalized string
     */
    static String normalizeString(String string) {
        return string.replaceAll("ä", "ae")
                 .replaceAll("ö", "oe")
                 .replaceAll("ü", "ue")
                 .replaceAll("ß", "ss")
                 .toLowerCase().replaceAll(":","");
    }

    /**
     * Compare two strings using Sorensen-Dice coefficient
     * @param string1 string1
     * @param string2 string2
     * @return similarity score for the two strings
     */
    double compareStrings(String string1, String string2){
        return sorensenDice.similarity(normalizeString(string1), normalizeString(string2));
    }

    /**
     * Get Matches for the list of strings
     * @param strings list of strings
     * @param stringToCompare string to compare
     * @return Matches object
     */
    Matches getMatches(List<String> strings, String stringToCompare){
        ArrayList<Match> matches = new ArrayList<>();
        for (String string : strings) {
            matches.add(new Match(string, this.compareStrings(string, stringToCompare)));
        }
        int bestMatchIndex =  IntStream.range(0, matches.size())
                                        .reduce((a, b) -> matches.get(a).score() > matches.get(b).score() ? a : b).orElse(0);
        Match bestMatch = new Match(matches.get(bestMatchIndex).string(), matches.get(bestMatchIndex).score());
        return new Matches(matches, bestMatchIndex, bestMatch);
    }


}
