import java.util.Scanner;

class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        int finish, distancetoBolt, tigerAcceleration, boltSpeed;
        for (int i = 0; i < Test; i++) {
            finish = sc.nextInt();
            distancetoBolt = sc.nextInt();
            tigerAcceleration = sc.nextInt();
            boltSpeed = sc.nextInt();
            int distance = (distancetoBolt + finish) * 2 / tigerAcceleration;
            int timeOfBolt = finish / boltSpeed;
            int timeOfTiger = (int) Math.sqrt(distance);
            if (timeOfBolt < timeOfTiger) {
                System.out.println("Bolt");
            } else {
                System.out.println("Tiger");
            }
        }
    }

}
