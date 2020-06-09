package Day25_MethodsRecap;

public class Class06_FrequencyOfStrings {
    public static void main(String[] args) {
        String str1 = "javajavajavajavajava";
        String str2 = "java";

        int count = 0;
        if (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        //System.out.println(str1);
        System.out.println(count);
        String a="AABBCDFAA";
        String b="A";
        int num1=Frequency(a,b);
        System.out.println(num1);
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }}




