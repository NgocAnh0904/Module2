package s18_StringRegex.bai_tap;

import s18_StringRegex.thuc_hanh.EmailExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String ACCOUNT_REGEX = "^[ABC]\\d{4}[GHIKLM]$";
    public Validate() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class ValidateTest{
    private static Validate validate;
    public static final String[] validValidate = new String[] { "C0318G", "B0318H", "A0904M" };
    public static final String[] invaliValidate = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String args[]) {
        validate = new Validate();
        for (String validateClass : validValidate) {
            boolean isvalid = validate.validate(validateClass);
            System.out.println("Class is " + validateClass +" is valid: "+ isvalid);
        }
        for (String validateClass : invaliValidate) {
            boolean isvalid = validate.validate(validateClass);
            System.out.println("Class is " + validateClass +" is valid: "+ isvalid);
        }
    }
}