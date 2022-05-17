package ru.hetology.sgl;

public class SQRService {
    public int sguareBorders(int border1, int border2) {
        int i = 0;
        for (int j = 10; j < 99; j++) {
            if (j * j >= border1) {
                if (j * j <= border2) {
                    i++;
                }
            }
        }
         return i;
    }
}

