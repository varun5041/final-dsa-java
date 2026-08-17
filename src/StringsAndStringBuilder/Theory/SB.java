package StringsAndStringBuilder.Theory;

public class SB {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.delete(1,25));
        System.out.println(builder.reverse());
        String str = builder.toString();
        System.out.println(builder.lastIndexOf(str));

    }
}
