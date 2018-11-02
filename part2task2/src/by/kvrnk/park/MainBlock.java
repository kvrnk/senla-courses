package by.kvrnk.park;

import by.kvrnk.park.generalObjects.Park;

public class MainBlock {
    public static void main(String[] args) {
        Park park = new Park("жилибера");
        park.print();
        park.searchInfoByName("автодром");
    }
}
