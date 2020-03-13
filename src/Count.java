public class Count {
    public static void main(String[] args) {
        int count=0 ;
        for (int i=100 ; i<=999 ; i++){
            if (String.valueOf(i).charAt(0) == String.valueOf(i).charAt(1)
                    || String.valueOf(i).charAt(1) == String.valueOf(i).charAt(2)
                    || String.valueOf(i).charAt(0) == String.valueOf(i).charAt(2))
                count++;
                System.out.printf(i + ",");
        }
        System.out.println("\nthere are "+count +" numbers");



        
    }
}
