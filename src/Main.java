import javax.swing.JOptionPane;

public class Main {
    static void main() {
        Input input = new Input();
        // Frågar användaren om växtens namn.
        String plantName = input.askForPlantName();

        // Dialogrutan ger tillbaka null om användaren trycker på
        // "Cancel", programmet avslutas då.
        if (plantName == null) {
            return;
        }

        // Tar bort mellanslag i början och slutet av strängen.
        plantName = plantName.trim();
        // Om användaren inte skriver in ett växtnamn, visas "Please enter plant name".
        if (plantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter plant name.");
            return;
        }

        GuestList guestList = new GuestList();
        Plants plant = guestList.findPlant(plantName);
        // Om användaren skriver in ett växtnamn som inte finns, visas "Plant not found".
        if (plant == null) {
            JOptionPane.showMessageDialog(null, "Plant not found: " + plantName);
            return;
        }

        // Polymorfism: Variabeln plant har typen Plants, men kan referera till ett
        // objekt av klassen Cactus, Palms eller CarnivorousPlants.
        // Metoden calculateLiquid beräknar vätskebehovet för det specifika växtobjektet
        // beroende på objektets klass.
        double liquidAmount = plant.calculateLiquid();
        String liquidName = plant.getLiquidType().getLiquidType();
        JOptionPane.showMessageDialog(null, plant.getName() + " needs " + liquidAmount + " liters of " + liquidName + " per day. ");
    }
}