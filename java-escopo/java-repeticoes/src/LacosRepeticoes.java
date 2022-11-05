public class LacosRepeticoes {
    
    public static void main(String[] args) throws Exception {

        int numero = 0;

        while(numero <= 10){

            System.out.println(numero);

            numero++;
        }

        for(int i = 1;i<10;i++){

            for(int j = 0;j<10;j++){

                System.out.print(i  * j);
                System.out.print(" ");

            }

            System.out.println();
        }
    }







    
}
