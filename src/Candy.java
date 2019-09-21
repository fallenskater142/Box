public class Candy extends Candyes {
    private String name = "Candy";
    private int size = 10;
    private int price = 20;
    private int col = 45;

    public String getName() {
        return name;
    }

    public int getCol() {
        return col;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    @Override
    String candy() {
        return getName()+" "+getCol()+" "+getPrice()+" "+getSize()+ " ";
    }

    @Override
    String jelly() {
return "";
    }

    @Override
    String etc() {
        return "";
    }
}
