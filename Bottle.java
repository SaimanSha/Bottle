public class Bottle {
    private double amt;
    private final double cap;

    public Bottle(double capacity) {
        this.amt = capacity;
        this.cap = capacity;
    }

    /**
     * Updates the amount of liquid in the bottle.
     * Precondition: this.cap >= amount > 0
     */
    public double updateAmount(double amount) {
        amt -= amount;
        if (amt < 0.25 * cap) {
            amt = cap;
        }
        //System.out.println(amt);
        return amt;
    }
    
    public double simulateList(String amounts) {
        double[] list = new double[15];
        while (amounts.indexOf(" ") != -1) {
            int c = 0;
            int len = amounts.indexOf(" ");
            String str = amounts.substring(0, len);
            amounts = amounts.substring(len+1);
            list[c] = Double.parseDouble(str);
            c++;
        }
        list[list.length] = Double.parseDouble(amounts);
        Bottle bottle = new Bottle(list[0]);
        int fin = ;
        for (int i = 1; i <= list.length; i++) {
            bottle.updateAmount(list[i]);

        }
        return amt;
    }
}
