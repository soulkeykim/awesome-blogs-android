package org.petabytes.awesomeblogs.util;

public class Strings {

    public static String EMPTY = "";
    public static String NEW_LINE = "\n";

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }
}
