import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> TransportArrayList = new ArrayList<Transport>(4);
        Transport SuzukiHayabusa = new Transport("Suzuki Hayabusa", 191, 840);
        Transport Chaparral = new Transport("Chaparral", 240, 1651);
        Transport BugattiChiron = new Transport("Bugatti Chiron", 261, 4400);
        Transport SCMaglev = new Transport("SC Maglev", 300, 55155);

        TransportArrayList.add(SuzukiHayabusa);
        TransportArrayList.add(Chaparral);
        TransportArrayList.add(BugattiChiron);
        TransportArrayList.add(SCMaglev);

        int fastestSpeed = 0;

        for(Transport transport : TransportArrayList) {
            if(transport.getSpeed() > fastestSpeed) {
                fastestSpeed = transport.getSpeed();
            }
        }

        System.out.println(fastestSpeed);
    }
}
