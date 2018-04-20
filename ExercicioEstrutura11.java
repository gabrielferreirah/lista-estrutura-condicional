import javax.swing.JOptionPane;

public class ExercicioEstrutura11{

    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1","9.5"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2","9.5"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 3","9.5"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 4","9.5"));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 5","9.5"));

        double media = (nota1+nota2+nota3+nota4+nota5)/5;

        if(media >= 8){
            JOptionPane.showMessageDialog(null, "Aprovado!");
        }else if(media < 6){
            JOptionPane.showMessageDialog(null, "Reprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Recuperação");
        }
    }
}