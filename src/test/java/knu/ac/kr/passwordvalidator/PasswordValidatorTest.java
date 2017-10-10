package knu.ac.kr.passwordvalidator;

import knu.ac.kr.passwordvailidator.PasswordValidator;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 미니멈랭쓰가_지정값보다크면_테스트_성공() {
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);

    }

    @Test
    public void 맥스랭쓰가_지정값보다작으면_테스트_성공() {

        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }


    @Test
    public void 맥스랭쓰가_지정값보다크면_테스트_실패() {

        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(2,4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }


    @Test
    public void 지정값이_null일때_테스트_실패() {
        String testPassword = "NULL";
        PasswordValidator passwordValidator = new PasswordValidator(0,4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void 지정값이_emptyString일때_테스트_실패() {
        String testPassword = " ";
        PasswordValidator passwordValidator = new PasswordValidator(0,4);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }



    @Test
    public void 지정값이_ADMIN이면_테스트_실패() {

        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }
}
