public class BooleanCondicionais{

    public static void main(String[] args){

        int idade = 18;

        int pessoas = 2;

        boolean acompanhado = pessoas > 1 ;

        // acompanhado = true ou acompanhado = false

        if (idade>=18 && acompanhado){

            System.out.println("Vocẽ pode reservar uma mesa");

        }else if (idade >= 60){

            System.out.println("Vocẽ pode reservar uma mesa");

        }else{

            System.out.println("Vocẽ não pode reservar uma mesa");

        }
        



    }


}