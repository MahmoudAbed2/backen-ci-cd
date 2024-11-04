package com.example.backend;
public class EncryptionService {

    // Enkla Caesar cipher för demonstration
    public String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char i : input.toCharArray()) {
            if (Character.isLetter(i)) {
                char base = Character.isLowerCase(i) ? 'a' : 'A';
                encrypted.append((char) ((i - base + shift) % 26 + base));
            } else {
                encrypted.append(i); // behålla icke-bokstäver som de är
            }
        }
        return encrypted.toString();
    }

    public String decrypt(String input, int shift) {
        return encrypt(input, 26 - shift); // Använd samma metod för dekryptering
    }
}
