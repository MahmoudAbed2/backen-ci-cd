package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/encryption")
public class EncryptionController {

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody String plainText) {
        return caesarCipher(plainText, 3);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String cipherText) {
        return caesarCipher(cipherText, -3);
    }

    private String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

