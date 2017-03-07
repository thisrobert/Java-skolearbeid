
public class Oppgave3
{
    public int forekomst(int [] array, int num) {
        int antall = 0;
        int index = 0;

        while (index < array.length && array[index] <= num) {
            if (array[index] == num) {
                antall++;
            }
            index++;
        }
        return antall;
    }

    public int [] rydd(int [] array, int num) {
        int antall = 0;
        int index = 0;
        while (index < array.length && array[index] <= num) {
            if (array[index] == num) {
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                antall++;
            } else {
                index++;
            }
        }

        int [] retur = new int[array.length - antall];
        for (int i = 0; i < retur.length; i++) {
            retur[i] = array[i];
        }
        return retur;
    }

}  

