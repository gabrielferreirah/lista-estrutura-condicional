import javax.swing.JOptionPane;

public class ExercicioEstrutura05{

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número"));

        if (numero  %2!=0){
            JOptionPane.showMessageDialog(null,"Este número é impar");
        }else{
            JOptionPane.showMessageDialog(null, "Este número não é impar");
        }
    }
}