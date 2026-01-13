import java.util.*;

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> startCities = new HashSet<>();

        // store all starting cities
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }

        // find the city that is never a start
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!startCities.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}
