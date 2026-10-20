import java.util.ArrayList;

public class GuestList {
    private ArrayList<Plants> guestList = new ArrayList<>();

    public GuestList() {
        startList();
    }

    // Lägger till hotellets fyra växter i gästlistan.
    private void startList() {
        guestList.add(new Cactus("Igge", 0.2));
        guestList.add(new Palms("Laura", 5.0));
        guestList.add(new Palms("Olof", 1.0));
        guestList.add(new CarnivorousPlants("Meatloaf", 0.7));
    }

    // Metoden går igenom gästlistan och söker efter ett växtnamn
    // utan att skilja på stora och små bokstäver.
    // Den returnerar växtobjektet om det finns, annars null.
    public Plants findPlant(String name) {
        for (Plants plant : guestList) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }
}