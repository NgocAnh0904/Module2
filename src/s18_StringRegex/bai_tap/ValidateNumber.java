package s18_StringRegex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
        private static final String ACCOUNT_REGEX = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
        public ValidateNumber() {
        }
        public boolean validate(String regex) {
            Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
class ValidateNumberTest {
    private static ValidateNumber validate;
    public static final String[] validValidate = new String[] { "(84)-(0978489648)", "(84)-(0978489648)", "(84)-(0978489648)" };
    public static final String[] invaliValidate = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String args[]) {
        validate = new ValidateNumber();
        for (String validate1 : validValidate) {
            boolean isvalid = validate.validate(validate1);
            System.out.println("Number is " + validate1 +" is valid: "+ isvalid);
        }
        for (String validate1 : invaliValidate) {
            boolean isvalid = validate.validate(validate1);
            System.out.println("Number is " + validate1 +" is valid: "+ isvalid);
        }
    }
}
