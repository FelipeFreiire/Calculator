
package calcular;

import javax.swing.JOptionPane;

public class Funcoes {
    double resultado;
    
    public double somar(double v1, double v2){
        return this.resultado= v1+v2;
    }
    public double subtrair(double v1, double v2){
        return this.resultado= v1-v2;
    }
    public double multiplicar(double v1, double v2){
        return this.resultado= v1*v2;
    }
    public double dividir(double v1, double v2){
        if( v2 == 0){
            JOptionPane.showMessageDialog(null, "Impossível dividir por zero");
            return this.resultado = 0;
        }else {
        return this.resultado= v1/v2;
        }
    }
}
