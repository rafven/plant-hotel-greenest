import javax.swing.JOptionPane;

public class Input {
    public String askForPlantName() {
        return JOptionPane.showInputDialog("Which plant should receive liquid?");
    }
}