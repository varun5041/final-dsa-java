package StringsAndStringBuilder.Theory;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MethodsOfString {
    static void main(String[] args) {
        String name = "varun Soni";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.replace('S','s'));
        System.out.println(name.length());
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" HEllO"));
        System.out.println(name.endsWith("Soni"));
    }
}
