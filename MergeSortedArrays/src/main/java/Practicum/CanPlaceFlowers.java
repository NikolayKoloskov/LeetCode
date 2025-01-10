package Practicum;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean before = true;
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (i + 1 < flowerbed.length) {
               boolean after = flowerbed[i + 1] == 0;
                if (flowerbed[i] == 0) {
                    if (before && after) {
                        count++;
                        i++;
                        continue;
                    }
                    if (flowerbed[i + 1] == 0) {
                        before = true;
                    }
                }
                if (flowerbed[i] == 1) {
                    before = false;
                }
            }
            if (i + 1 == flowerbed.length) {
                if (flowerbed[i] == 0 && before) {
                    count++;
                    break;
                }
            }
        }
        return count >= n;
    }


    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        System.out.println(cpf.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }
}
