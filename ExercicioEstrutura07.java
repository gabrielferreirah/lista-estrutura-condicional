import javax.swing.JOptionPane;

public class ExercicioEstrutura07{

    public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Escolha um número"));

        if (numero %2==0){
            JOptionPane.showMessageDialog(null, "Esse número é par");
        }else if (numero %2!=0){
            JOptionPane.showMessageDialog(null, "Esse número é impar");
        }
    }
}