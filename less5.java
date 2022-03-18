import java.io.Console;

class less5 {

    public static void main(String[] args){

        Console cons;
        if((cons = System.console()) !=null){
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Введіть свій пароль:");
                System.out.println("Ваш пароль був" + new String(pass_ward));
            } finally {
                if (pass_ward != null){
                    java.util.Arrays.fill(pass_ward, ' ' );
                }
            }
        } else {
            throw  new RuntimeException("Не можемо получити пароль ... Не введено");
        }


    }
}