package utils;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {
    /**
     * Use Google public servers to verify that the current network is available.
     *
     * @param timeout in milliseconds
     * @return true if network is available
     */
    public static boolean isNetworkAvailable(int timeout) {
        try {
            InetAddress address = InetAddress.getByName("8.8.8.8");
            return address.isReachable(timeout);
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Convert snake_case to lowerCamelCase
     * @param str snake case string
     * @return lowerCamelCase
     */
    public static String snakeToLowerCamel(String str) {
        String[] parts = str.split("_");

        return parts[0].toLowerCase() + Arrays.stream(parts, 1, parts.length)
                .map(part -> part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }
}
