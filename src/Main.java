public class Main {
    public static void main(String[] args) {
Candy candy = new Candy();
Etc etc = new Etc();
Box myBox = new MyBox();
myBox.Add("Candy");

myBox.Add("Etc");
myBox.ShowAll();
myBox.Del();
myBox.ShowAll();
myBox.ShowV();
myBox.ShowP();
    }
}
