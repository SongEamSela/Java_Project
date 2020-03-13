public class Test_TryCatch {
    public static void main(String[] args) {
        try {
            int[] mynumber = {1,2,3};
            for (int i=0;i<mynumber.length;i++){
                System.out.println(mynumber[10]);
            }
        }catch (Exception e){
            System.out.println("Something went wrong!!!");
        }
    }
}
