import javax.swing.*;

class MesesdoAno{
    public static String[] meses = new String[12];
    static {
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";
    }
    public static String getMes(int index) {
        return meses[index - 1];
    }
}

public class Mesesconversao {
    public static void main(String[] args){

        while (true) {
            String entradaStr = JOptionPane.showInputDialog("Qual mês do ano quer converter?(de 1 a 12)");

            try {
                int entradaNum = Integer.parseInt(entradaStr);
                if (entradaNum >= 1 && entradaNum <= MesesdoAno.meses.length) {
                    String mes = MesesdoAno.getMes(entradaNum);
                    JOptionPane.showMessageDialog(null, "Mês: " + mes);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Número do mês inválido. Tente novamente.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Mês inválido. Apenas entre 1-12");
                break;
            }
        }
    }
}
