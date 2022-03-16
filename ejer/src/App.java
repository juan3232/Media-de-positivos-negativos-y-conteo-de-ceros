import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

       int Numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
        float media_pos,media_neg;

        for(int i=1; i<=10; i++){
            Numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero"));

            if(Numero==00){//si el numero es cero
                conteo_ceros++;//Aumentamos en 1 el cconteo de 0
            }
            else if(Numero>0){//si el numero es positivo
                suma_pos+=Numero;//suma iterativa de positivos
                conteo_pos++;
            }
            else{//si es negativo 
                suma_neg+=Numero;
                conteo_neg++;
            }
        }
        //Tratamos con los positivos
        if(conteo_pos==0){
            System.out.println("No se puede sacar la media de los positivos");
        }
       else{
           media_pos =(float) suma_pos/conteo_pos;
           System.out.println("La media de los numeros positivos es-->"+media_pos);
       }
       //Tratamos con los numeros negativos
       if(conteo_neg==0){
           System.out.println("No se puede sacar la media de los negativos");
       }
       else{
           media_neg=(float) suma_neg/conteo_neg;
           System.out.println("La media de los negativos es -->"+media_neg);

       }
       System.out.println("camtidad de ceros es "+conteo_ceros);
    }

}
