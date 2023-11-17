package com.scrapper.main.dataTypes;

import java.util.ArrayList;

public record Matches(ArrayList<Match> matches, int bestMatchIndex, Match bestMatch) {
}
