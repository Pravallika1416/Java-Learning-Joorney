package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VistaraFlightServiceImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        List<FlightData> flights = new ArrayList<>();
        flights.add(new FlightData(src, dest, jDate, 200, "vistara", 15));
        flights.add(new FlightData(src, dest, jDate, 200, "vistara", 6));
        flights.add(new FlightData(src, dest, jDate, 200, "vistara", 7));
        flights.add(new FlightData(src, dest, jDate, 200, "vistara", 8));
        return flights;
    }
}
