public class JavaBasic3 {
    public static void main(String[] args){
        // bentuk segita
        int a,b;
        for (a=1;a<=6;a++){
            for (b=1; b<=a;b++){
                System.out.print("*");
            }System.out.println("");
        }
        // bentuk line persegi
        int i,j;
        for (i=1;i<=4;i++){
            for (j=1; j<=4; j++){
                if (i==1 || i==4 || j==1 || j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}            
