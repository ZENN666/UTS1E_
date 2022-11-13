public class nomer2 {
    public static void main(String[] args) {
        float[]myNumber = new float[] {2.34F, 4.56F, 67.89F};
        PembulatanKeAtas(myNumber);
    }

    public static void PembulatanKeAtas(float[] myNumber){
        System.out.println(Math.ceil(myNumber[0]));
        System.out.println(Math.ceil(myNumber[1]));
        System.out.println(Math.ceil(myNumber[2]));
    }
}