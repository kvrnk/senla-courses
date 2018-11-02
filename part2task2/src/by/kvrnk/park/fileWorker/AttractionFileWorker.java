package by.kvrnk.park.fileWorker;

import by.kvrnk.park.generalObjects.Attraction;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttractionFileWorker {
    private static final SimpleDateFormat formatForTime = new SimpleDateFormat("h:mm");

    public static List<Attraction> getAttractionsList(String[] signatures) {
        List<Attraction> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildAttraction(signature));
        }

        return result;
    }

    private static Attraction buildAttraction(String signature) {
        String[] values = signature.split(";");
        try {

            System.out.println(values[0].trim());
            long id = Long.parseLong(values[0].trim());
            String name = values[1];
            Date fromTime = null;
            Date toTime = null;
            toTime = formatForTime.parse(values[3]);
            fromTime = formatForTime.parse(values[2]);
            BigDecimal price = new BigDecimal(values[4]);

            return new Attraction(id, name, fromTime, toTime, price);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
