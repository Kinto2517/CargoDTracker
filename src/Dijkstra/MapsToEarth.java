package Dijkstra;

public class MapsToEarth {



    private static Double toRad(Double value) {
        return value * Math.PI / 180;
    }
    public static double distance(double plat1, double plng1,
                                  double plat2, double plng2){
        final int radius = 6370;
        Double lat1 = plat1;
        Double lat2 = plat2;
        Double lon1 = plng1;
        Double lon2 = plng2;

        Double latDistance = toRad(lat2-lat1);
        Double lonDistance = toRad(lon2-lon1);
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) +
                Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
                        Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        Double distance = radius * c;
        return distance.doubleValue();
    }
}
