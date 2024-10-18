package flightDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirIndiaFlightServiceImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date dj) {
        List<FlightData> flight=new ArrayList<>();
        flight.add(new FlightData(src,dest,dj,2000,"airIndia",1));
        flight.add(new FlightData(src,dest,dj,2000,"airIndia",2));
        flight.add(new FlightData(src,dest,dj,2000,"airIndia",3));
        flight.add(new FlightData(src,dest,dj,2000,"airIndia",4));
        flight.add(new FlightData(src,dest,dj,2000,"airIndia",5));
        return flight;
    }
}
