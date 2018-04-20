import javax.swing.JOptionPane;

public class ExercicioEstrutura06{
    
    public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        if(numero != 1){
            JOptionPane.showMessageDialog(null, "Esse número é diferente de 1");
        }else{
            JOptionPane.showMessageDialog(null, "Esse número não é diferente de 1");
        }
    }
}