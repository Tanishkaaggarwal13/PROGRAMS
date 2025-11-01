import java.io.*;
class Geeks {
    public static void main(String[] args) {
        byte[] byteArray = { 84,65,78,73,83,72,75,65};
        String str2 = new String(byteArray);
        System.out.println("String from byte array: " + str2);
       byte[] byteArray1 = {116,97,110,105,117,104,107,97,46,97,103,103,97,114,119,97,108,103,109,97,105,108,46,99,111,109}};
        String str3 = new String(byteArray1);
       System.out.println("String from byte array: " + str3);
    }
}
