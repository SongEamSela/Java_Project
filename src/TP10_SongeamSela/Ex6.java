package TP10_SongeamSela;

public class Ex6 {
    public static void main(String[] args) {
        for (int i=100 ; i<999 ; i++){
            if (String.valueOf(i).charAt(0) != String.valueOf(i).charAt(1)
                    && String.valueOf(i).charAt(1) != String.valueOf(i).charAt(2)
                    && String.valueOf(i).charAt(0) != String.valueOf(i).charAt(2))
                System.out.printf(i + ",");
        }
    }
}
