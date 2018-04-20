import javax.swing.JOptionPane;

public class ExercicioEstrutura01{

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if (numero >= 1) {
            JOptionPane.showMessageDialog(null, "O número é positivo");
        }else{
            JOptionPane.showMessageDialog(null, "O número não é positivo");
        }
    }
}