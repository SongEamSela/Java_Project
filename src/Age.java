public class Age {
    public static void main(String[] args) {
        int count=0;
        for (int i= 10 ; i<=150; i++){
            for (int j = 16 ; j<150 ; j++){
                String faAge = Integer.toString(j);
                String childAge = Integer.toString(i);
                String reverse_fa= "";
                for (int k=faAge.length()-1 ; k>=0; k--){
                    reverse_fa += faAge.charAt(k);
                }
                if (reverse_fa.equals(childAge) && i<j && j-i>=16){
                    System.out.println("Possible age of child is : "+i+",");
                    System.out.println("Possible age of father is : "+j+",");
                    System.out.println("************");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
