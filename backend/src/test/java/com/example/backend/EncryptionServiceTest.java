package com.example.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EncryptionServiceTest {

    private final EncryptionService encryptionService = new EncryptionService();

    @Test
    public void testEncrypt() {
        String input = "Hello, World!";
        String expected = "Khoor, Zruog!";
        String actual = encryptionService.encrypt(input, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testDecrypt() {
        String input = "Khoor, Zruog!";
        String expected = "Hello, World!";
        String actual = encryptionService.decrypt(input, 3);
        assertEquals(expected, actual);
    }
}
