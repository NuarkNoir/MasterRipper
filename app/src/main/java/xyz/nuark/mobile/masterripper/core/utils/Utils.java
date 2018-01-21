package xyz.nuark.mobile.masterripper.core.utils;

public class Utils {

    public static String filesystemSanitized(String text) {
        text = text.replaceAll("[^a-zA-Z0-9.-]", "_");
        return text;
    }

    public static String filesystemSafe(String text) {
        text = text.replaceAll("[^a-zA-Z0-9.-]", "_")
                .replaceAll("__", "_")
                .replaceAll("_+$", "");
        if (text.length() > 100) {
            text = text.substring(0, 99);
        }
        return text;
    }

    public static String bytesToHumanReadable(int bytes) {
        float fbytes = (float) bytes;
        String[] mags = new String[]{"", "K", "M", "G", "T"};
        int magIndex = 0;
        while (fbytes >= 1024) {
            fbytes /= 1024;
            magIndex++;
        }
        return String.format("%.2f%siB", fbytes, mags[magIndex]);
    }
}
