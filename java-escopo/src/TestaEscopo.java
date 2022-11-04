public class TestaEscopo {
    
    public static void main(String[] args) throws Exception {
        
        int pessoas = 1;

        boolean acompanhado;
        
        if(pessoas >=2){

            acompanhado = true;

            System.out.println("Vocẽ está acompanhado");

        } else{

            acompanhado = false;

            System.out.println("Vocẽ não está acompanhado");

        }

        switch(pessoas){

            case 1:
                
                System.out.println("Você ganhará uma sobremesa");

            break;

            case 2:

                System.out.println("Você ganhará duas sobremasas");
            
            break;

            default:

                System.out.println("Você ganhará uma sobremesa por casal");

        }

        
    }
}