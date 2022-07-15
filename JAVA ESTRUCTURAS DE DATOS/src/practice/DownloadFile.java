package practice;

public class DownloadFile {

    public static void main(String[] args) {
        int[] array = {10,6,6,8,70};
        System.out.println(solution(100, array, 0));
    }

    public static int solution(int X, int[] B, int Z) {
        // write your code in Java SE 8
        int download = 0;
        int promedio = 0;
        int counterZ = Z;

        for (int i = 0; i < B.length; i++) {
            download = download +B[i];
            if(counterZ > 0) {
                promedio = promedio + B[B.length-counterZ];
                counterZ--;
            }
        }
        int remain = X - download;
        if(remain == 0){
            return 0;
        }
        if(Z > 0){
            promedio = promedio / Z ;
            remain = remain / promedio;
        }else{
            return -1;
        }
        return remain;
    }
}