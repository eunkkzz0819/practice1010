package knu.ac.kr.passwordvailidator;

public class PasswordValidator {

    private int minLength;
    private int maxLength;


    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate(String password)
    {
        int passwordLength = password.length();
        if(passwordLength < minLength)
        {
            return false;
        }

        if(passwordLength > maxLength)
            return false;

        if(password == "NULL")
            return false;

        if(password == " ")
            return false;

        if(password == "ADMIN")
            return false;

        return true;

    }


}
