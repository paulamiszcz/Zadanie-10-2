public enum Directions {
    NORTH("Północ"),
    SOUTH("Południe"),
    EAST("Wschód"),
    WEST("Zachód"),
    UNDEFINED("Kierunek nieznany, nie ma takiego kierunku");

    private String description;

    Directions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void showDescription() {
        System.out.println(this.description);
    }

    public Directions convert(int number) {
        Directions result;

        switch (number) {
            case 0:
                result =NORTH;


            case 1:
                result =SOUTH;


            case 2:
                result =EAST;


            case 3:
                result =WEST;


            default:
                result  = UNDEFINED;
        }
        return result;

    }
}
