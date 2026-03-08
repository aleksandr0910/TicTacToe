import java.util.Scanner;
class Hoved{
    
    public static boolean sjekkHorisontalt(Spill[] spillet, char merke){
        for(Spill s : spillet){
            if(s.grid[0] == merke && s.grid[1] == merke && s.grid[2] == merke){
                return true;
            }
        }
        return false;
    }
    
    public static boolean sjekkVertikalt(Spill[] spillet, char merke){
        for(int kolonne = 0; kolonne < 3; kolonne++){
            if(spillet[0].grid[kolonne] == merke && spillet[1].grid[kolonne] == merke && spillet[2].grid[kolonne] == merke){
                return true;
            }
        }
        return false;
    }
    
    public static boolean sjekkDiagonalt(Spill[] spillet, char merke){
    
        if(spillet[0].grid[0] == merke && spillet[1].grid[1] == merke && spillet[2].grid[2] == merke){
            return true;
        }
        
        if(spillet[0].grid[2] == merke && spillet[1].grid[1] == merke && spillet[2].grid[0] == merke){
            return true;
        }
        return false;
    }
    
    public static boolean harVunnetSpillet(Spill[] spillet, char merke){
        return sjekkHorisontalt(spillet, merke) || sjekkVertikalt(spillet, merke) || sjekkDiagonalt(spillet, merke);
    }
    
    public static void main(String[] args) {
        Spill[]spillet = new Spill[3];
        Spiller en = new Spiller('X');
        Spiller to = new Spiller('O');
        Scanner sc = new Scanner(System.in);
        en.tur = true;
        for (int i = 0; i < 3; i++){
            spillet[i] = new Spill();
            }
            
        System.out.println();
        System.out.println(" ! Velkommen til tre på rad ! ");
        System.out.println();
        System.out.println("*For å sette din markering velger du et tall for rad fra 0-2 og deretter index 0-2");
        System.out.println();
        while(en.harVunnet() == false && to.harVunnet() == false){
            
            if(en.hentTur()){
                System.out.println();
                System.out.println(" Spiller 1 sin tur! velg tall: ");
                System.out.print("Rad: ");
                spillet[sc.nextInt()].grid[sc.nextInt()] = en.settMarkering();
                
                if(harVunnetSpillet(spillet, en.merke)){
                    en.vant();
                }
                
                to.tur = true;
                en.tur = false;
                
            } else if(to.hentTur()){
                System.out.println();
                System.out.print(" Spiller 2 sin tur! velg tall: ");
                spillet[sc.nextInt()].grid[sc.nextInt()] = to.settMarkering();
                
                if(harVunnetSpillet(spillet, to.merke)){
                    to.vant();
                }
                
                en.tur = true;
                to.tur = false;
                
            }
            
            for(Spill s: spillet){
                System.out.println(s.grid);
                }
            if(en.vunnet == true){
                System.out.print("Spiller 1 vant!");
            } else if(to.vunnet == true){
                System.out.print("Spiller 2 vant!");
            }
            
            }
            }
        }
        




