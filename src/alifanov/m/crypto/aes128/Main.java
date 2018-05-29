package alifanov.m.crypto.aes128;

public class Main {
    public static void main(String[] args) {

        AES128 aes128 = new AES128();

        String x = "Thats my Kung Fu";
        String ke = "Two One Nine Two";

        int[][] state = new int[4][4];
        int[][] key = new int[4][4];
        int k = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++, k++)
                key[j][i] = (int) x.charAt(k);
        k = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++, k++)
                state[j][i] = (int) ke.charAt(k);

        aes128.encryption(state, key);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++, k++) {
                System.out.format("%x ", state[i][j]);

            }
            System.out.println();
        }
    }


}
