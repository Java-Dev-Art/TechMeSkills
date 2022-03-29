package com.tms.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authorization {
    private static final String LOGIN = "[a-zA-Z]{20}";
    private static final String PASS = "[a-zA-Z0-9_]{20}";

    public static void checkAuthorization(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        Pattern log = Pattern.compile(LOGIN);
        Matcher matcher = log.matcher(login);
        if (matcher.find()) {
            System.out.println("Login is access");
        } else {
            throw new WrongLoginException("Wrong login");
        }
        if (password.equalsIgnoreCase(confirmPassword)) {
            Pattern pass = Pattern.compile(PASS);
            Matcher matcherPass = pass.matcher(login);
            if (matcherPass.find()) {
                System.out.println("Login is access");
            } else {
                throw new WrongPasswordException("Wrong password");
            }
            Pattern patterConfirmPassword = Pattern.compile(PASS);
            Matcher matcherConfirmPassword = patterConfirmPassword.matcher(login);
            if (matcherConfirmPassword.find()) {
                System.out.println("Login is access");
            } else {
                throw new WrongPasswordException("Wrong password");
            }
        } else {
            throw new WrongPasswordException("pass is not equals passConf");
        }
    }
}
