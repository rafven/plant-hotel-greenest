import javax.swing.JOptionPane;

public class Main {
    static void main() {
        Input input = new Input();
        String plantName = input.askForPlantName();

        // Avbryter om användaren trycker på "Cancel" eller stänger dialogrutan.
        if (plantName == null) {
            return;
        }

        plantName = plantName.trim();
        if (plantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a plant name.");
            return;
        }

        GuestList guestList = new GuestList();
        Plants plant = guestList.findPlant(plantName);
        if (plant == null) {
            JOptionPane.showMessageDialog(null, "Plant not found: " + plantName);
            return;
        }

        // Växtens klass avgör hur vätskebehovet beräknas.
        double liquidAmount = plant.calculateLiquid();
        String liquidName = plant.getLiquidType().getLiquidType();
        JOptionPane.showMessageDialog(null, plant.getName() + " needs " + liquidAmount + " liters of " + liquidName + " per day. ");
    }
}