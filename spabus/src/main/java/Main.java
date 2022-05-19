public class Main {
    public static void main(String[] args) {
        bus bus = new bus(10, 1, 1000, 1, 11, 1);
        bus.addUser();
        bus.playChange();
        bus.speedChange();

        taxi taxi = new taxi(1,  11,  1,  "영등포",  5,  10,  3000,  0,  300);
        taxi.pay();
        taxi.addUser();
        taxi.speedChange();

    }
}
