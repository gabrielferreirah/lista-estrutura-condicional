import javax.swing.JOptionPane;

public class ExercicioEstrutura10{
    
    public static void main(String[] args) {
        
        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Altura 1"));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Altura 2"));
        double base1 = Double.parseDouble(JOptionPane.showInputDialog("Base 1"));
        double base2 = Double.parseDouble(JOptionPane.showInputDialog("Base 2"));

        double alturaconta = altura1-altura2;
        double baseconta = base1-base2;

        if(alturaconta==0 && baseconta==0){
            JOptionPane.showMessageDialog(null, "Isso é um retangulo!");
        }else{
            JOptionPane.showMessageDialog(null, "Isso não é um retangulo!");
        }
    }
}