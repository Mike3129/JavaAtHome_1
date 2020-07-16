package JavaZaawZad.Zad16;

public enum Runner {
    BEGINNER(300, 400),
    INTERMEDIATE(200, 299),
    ADVANCED(100, 199);

    private int minMarathonTime;
    private int maxMarathonTime;

    Runner(int minMarathonTime, int maxMarathonTime) {
        this.minMarathonTime = minMarathonTime;
        this.maxMarathonTime = maxMarathonTime;
    }

    public static Runner getFitnesslevel(int time) {
        if (time >= ADVANCED.maxMarathonTime && time <= ADVANCED.maxMarathonTime) {
            return ADVANCED;
        } else if (time >= INTERMEDIATE.minMarathonTime && time <= INTERMEDIATE.maxMarathonTime) {
            return INTERMEDIATE;
        } else if (time >= BEGINNER.minMarathonTime && time <= BEGINNER.maxMarathonTime) {
            return BEGINNER;
        } else if (time <= ADVANCED.minMarathonTime) {
            throw new IllegalArgumentException("You are too good");
        } else {
            throw new IllegalArgumentException("Train harder");
        }
    }
}
