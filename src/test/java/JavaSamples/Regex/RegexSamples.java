package JavaSamples.Regex;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RegexSamples {

    public static void main(String[] args) {
        String text="fdfkADFDF7878&*^&%fdf";
        System.out.println("Remove special characters "+text.replaceAll("[^0-9A-Za-z]",""));
    }
}
