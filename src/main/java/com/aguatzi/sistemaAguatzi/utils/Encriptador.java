package com.aguatzi.sistemaAguatzi.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author Miguel Frias, nadie mas
 */
public class Encriptador {

    private Encriptador() {
        throw new IllegalStateException("Utility class");
    }

    public static String encriptarPassword(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    public static String encriptarPassword(char[] password) {
        return BCrypt.withDefaults().hashToString(12, password);
    }

    public static boolean verificarPasswordConHash(String password, String hashedPassword) {
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
        return result.verified;
    }
}
