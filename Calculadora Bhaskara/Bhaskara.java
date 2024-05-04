

/**
 * módelo de calcuylo de  Bhaskara .
 * 
 * @author jeovane2001 
 * @version 01/05/2024
 */
public class Bhaskara
{
   double delta, deltaRaiz;
   double a;
   double b;
   double c;
   double x1, x2;
   //construtor padrão
   public Bhaskara(){
     this.a = 0;
     this.b = 0;
     this.c = 0;
   }
   // construto para objeto da calculadora de Bhaskara.
   public Bhaskara(double a, double b, double c){
     this.a = a;
     this.b = b;
     this.c = c;
   }
   //medtodo para calcular o Bhaskara
   //apresentar as raizes se tiver 
   public String CalcularBhaskara(){
       delta = b * b - 4*a*c;
       if( delta < 0){
           return "O sistema não possui solução real.";}
       if(delta == 0){
           x1 = x2 = - b / (2 * a);
           return "A equaçao de segundo gral śo possui uma única raiz que é "+ x1;
       }
       deltaRaiz = Math.sqrt(delta);
       x1 = (- b + deltaRaiz) / (2 * a);
       x2 = (- b - deltaRaiz) / (2 * a);
       return "a equação de 2 grau tem as seguintes Raizes: "+ x1 +" e "+ x2;
   }
}
