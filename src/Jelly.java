public class Jelly extends Candyes {
    private String name = "jelly";
    private int size = 5;
    private int price = 10;
    private int col = 35;

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public int getCol() {
        return col;
    }

    public String getName() {
        return name;
    }

    @Override
    String candy() {
return "";
    }

    @Override
    String jelly() {
        return getName()+" "+getCol()+" "+getPrice()+" "+getSize()+" ";
    }

    @Override
    String etc() {
return "";
    }
}
