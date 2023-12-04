package menu.util;

import java.util.List;
import java.util.stream.Collectors;

public class StringGenerator {

    private static final String DELIMITER = " | ";
    private static final String PREFIX = "[ %s | ";
    private static final String SUFFIX = " ]";

    public static <T, R> String generate(T prefix, List<R> object) {
        return object.stream()
                .map(Object::toString)
                .collect(Collectors.joining(DELIMITER, String.format(PREFIX, prefix), SUFFIX));
    }
}
