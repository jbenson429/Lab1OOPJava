public class Denomination {
    private final String name;
    private final double amt;
    private final String form;
    private final String img;

    public Denomination(String name, double amt, String form, String img) {
        this.name = name;
        this.amt = amt;
        this.form = form;
        this.img = img;
    }

    public String name() {
        return name;
    }

    public double amt() {
        return amt;
    }

    public String form() {
        return form;
    }

    public String img() {
        return img;
    }
}


