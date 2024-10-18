package flightDemo;
import java.util.Date;
public class FlightData {
    private String src;
    private String dest;
    private Date dj;
    private int cost;
    private String type;
    private int id;

    public String getSrc() {
        return src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Date getDj() {
        return dj;
    }

    public void setDj(Date dj) {
        this.dj = dj;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "FlightData{" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", dj=" + dj +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlightData(String src, String dest, Date dj, int cost, String type,int id) {
        this.src = src;
        this.dest = dest;
        this.dj = dj;
        this.cost = cost;
        this.type = type;
        this.id=id;
    }
}
