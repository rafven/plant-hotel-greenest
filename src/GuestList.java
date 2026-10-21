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

    // Söker oavsett stora/små bokstäver. Returnerar null om växten inte finns i listan.
    public Plants findPlant(String name) {
        for (Plants plant : guestList) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }
}