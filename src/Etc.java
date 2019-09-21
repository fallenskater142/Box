public class Etc extends Candyes {
    private String name = "Etc";
    private int size = 7;
    private int price = 15;
    private int col = 25;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCol() {
        return col;
    }

    public int getSize() {
        return size;
    }

    @Override
    String candy() {
return "";
    }

    @Override
    String jelly() {
return "";
    }

    @Override
    String etc() {
        return getName()+" "+getCol()+" "+getPrice()+" "+getSize()+" ";
    }
}
