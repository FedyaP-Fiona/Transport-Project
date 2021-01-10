public class Transport {
        private String model;
        private int speed;
        private int mass;

        public Transport(String model, int speed, int mass) {
            this.model = model;
            this.speed = speed;
            this.mass = mass;
        }

        public void start() {
            for(int i = 0; i < speed + 1; i++) {
                System.out.println(i + " ");
            }
        }
        public void stop() {
            for(int i = speed; i >= 0; i--) {
                System.out.println(i + " ");
            }
        }
        public void showInfo() {
            System.out.println(model + "can go up to " + speed + "mph and weighs " + mass + "lbs.\n");
        }

    public int getMass() {
        return mass;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }
}
