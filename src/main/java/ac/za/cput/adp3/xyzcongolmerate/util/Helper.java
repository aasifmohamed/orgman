package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?> aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String getCap = "";
        char capLet;

        for(int i = 0; i < className.length(); i++){
            capLet = className.charAt(i);

            if(Character.isUpperCase(capLet)){
                getCap += capLet;
            }
        }
        return getCap;
    }
}
