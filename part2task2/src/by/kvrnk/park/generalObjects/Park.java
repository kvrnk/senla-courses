package by.kvrnk.park.generalObjects;

import by.kvrnk.park.fileWorker.AttractionFileWorker;
import by.kvrnk.park.fileWorker.TextFileWorker;

import java.text.SimpleDateFormat;
import java.util.List;

public class Park {
    private String name;
    private AttractionManager attractionManager;

    public Park(String name) {
        this.name = name;
        attractionManager = new AttractionManager();
    }

    public class AttractionManager {
        private final SimpleDateFormat formatForTime = new SimpleDateFormat("h:mm");
        private List<Attraction> attractions;
        private static final String pathToFile = "./src/by/kvrnk/park/files/attractions.txt";

        public AttractionManager() {
            attractions = AttractionFileWorker.getAttractionsList(TextFileWorker.readFromFile(pathToFile));
        }

        public void searchInfoByName(String name) {
            for (Attraction attraction : attractions) {
                if (name.equals(attraction.getName())) {
                    System.out.println("An attraction '" + name + "' works from " +formatForTime.format(attraction.getFromTime()) + " to " +
                            formatForTime.format(attraction.getToTime()) + " and costs " + attraction.getPrice() + " BYN");
                }
            }
        }

        public List<Attraction> getAttractions() {
            return attractions;
        }
    }

    public void print() {
        System.out.println("An attraction '" + name + "' has ");
        for (Attraction attraction : attractionManager.getAttractions()) {
            System.out.println(attraction.getName());
        }
    }

    public void searchInfoByName(String name) {
        attractionManager.searchInfoByName(name);
    }

    public String getName() {
        return name;
    }
}
