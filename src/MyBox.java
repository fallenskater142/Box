public class MyBox implements Box {
   private String a[] = new String[5];
    int size1 =0;
Candy candy = new Candy();
Jelly jelly = new Jelly();
Etc etc = new Etc();
    int all1 ;int oa;
    int all2;int ob;
    int all3;int oc;

String text = "";

    @Override
    public boolean Add(String text){
        if (size1 !=a.length){
           switch (text){
               case "Candy":
                   a[size1]= candy.candy();
                   all1=candy.getSize();
                   oa = candy.getPrice();
                   size1++;
                   break;
               case "Jelly":
                   a[size1]= jelly.jelly();
                   all2=jelly.getSize();
                   ob = jelly.getPrice();
                   size1++;
                   break;
               case "Etc":
                   a[size1]= etc.etc();
                   all3=etc.getSize();
                   oc = etc.getPrice();
                   size1++;
                   break;
            }

return true;
        }else{
            return false;
        }


    }

    @Override
    public boolean Del() {
        for(int i = a.length-1;i>0;i--){
            if (a[i]!=null){
                a[i]=null;
                break;
            }


        }

        return false;
    }

    @Override
    public void ShowV() {

System.out.println(all1+all2+all3);

    }

    @Override
    public void ShowP() {
      System.out.println(oa+ob+oc);
    }

    @Override
    public void ShowAll() {
        for (String v : a) {
           System.out.println(v);

        }

    }}
