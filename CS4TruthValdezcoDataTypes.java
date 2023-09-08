public class CS4TruthValdezcoDataTypes {
    
    static String chapterTotal(int x, int y, int z){
        int total = x+y+z;
        String output = "Total number of chapters " + total +"\n"+
                "Operation:Sum\n";
        return output;
    }
    static String panelNumber(int x, int y, int z){
        int panels1 = x*20;
        int panels2 = y*20;
        int panels3 = z*20;
        String output = "Number of Panels (each Chapter has 20 panels)\n" +
        "Tied In: "+panels1+"\n" +
        "My Peanut Macademia: "+panels2+"\n" +
        "Attack on Dwarf: "+panels3+"\n" +
        "Operation: Product\n";
        return output;
    }
    static String compareAge(int x, int y, int z){
        String xy;
        String xz;
        String yz;
        if (x>y){
            xy = "Is Tied In Older than My Peanut Macademia? Yes\n";
        }else xy = "Is Tied In Older than My Peanut Macademia? No\n";
        
        if (x>z){
            xz = "Is Tied In Older than Attack on Dwarf? Yes\n";
        }else xz = "Is Tied In Older than Attack on Dwarf? No\n";
        if (y>z){
            yz="Is My Peanut Macademia Older than Attack on Dwarf? Yes\n"+"Operation:Comparison\n";
        }else yz = "Is My Peanut Macademia Older than Attack on Dwarf? No\n"+"Operation:Comparison\n";
        String total = xy+xz+yz;
        return total;
    }
    
    public static void main(String[] args) {

        // object 2 var declaration and basic output
        int manga1Chapter = 10;
        int manga1Age = 60;
        System.out.println("Manga 1\n" +
        "Name: Tied In\n" +
        "Number of Chapters:"+manga1Chapter+"\n" +
        "Days Published:" + manga1Age+"\n"+"\n");
      
        // object 2var declaration and basic output
        int manga2Chapter = 3;
        int manga2Age = 18;
        System.out.println("Manga 2\n" +
        "Name: My Peanut Macademia\n" +
        "Number of Chapters:"+manga2Chapter+"\n" +
        "Days Published:" + manga2Age+"\n"+"\n");
      
        // object 3var declaration and basic output
        int manga3Chapter = 61;
        int manga3Age = 366;
        System.out.println("Manga 3\n" +
        "Name: Attack on Dwarf\n" +
        "Number of Chapters:"+manga3Chapter+"\n" +
        "Days Published:" + manga3Age+"\n"+"\n");

        System.out.println("------------------------------");
        //output operations
        System.out.println(
          panelNumber(manga1Chapter,manga2Chapter,manga3Chapter));
        System.out.println(
          chapterTotal(manga1Chapter,manga2Chapter,manga3Chapter));
        System.out.println(
          compareAge(manga1Age,manga2Age,manga3Age));
    }
    
}