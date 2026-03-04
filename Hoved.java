import java.util.ArrayList;
import java.util.Scanner;
class Hoved{
    
    public static void main(String[] args) {
        Spill[]spillet = new Spill[3];
        Spiller en = new Spiller('X');
        Spiller to = new Spiller('O');
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> markertX = new ArrayList<>();
        ArrayList<Character> markertO = new ArrayList<>();
        en.tur = true;
        for (int i = 0; i < 3; i++){
            spillet[i] = new Spill();
            }
            
        int teller1 = 0; 
        int teller2 = 0;
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
                
                to.tur = true;
                en.tur = false;
                
            } else if(to.hentTur()){
                System.out.println();
                System.out.print(" Spiller 2 sin tur! velg tall: ");
                spillet[sc.nextInt()].grid[sc.nextInt()] = to.settMarkering();
                en.tur = true;
                to.tur = false;
                
            }
            for(Spill s: spillet){
                System.out.println(s.grid);
                char nåværende;
                for(int i = 0; i < s.grid.length; i++){
                    nåværende = s.grid[i];
                    if(nåværende == en.merke){
                        teller1 ++;
                        markertX.add(en.merke);
                        if(s.grid[0] == en.merke && s.grid[1] == en.merke && s.grid[2] == en.merke){
                            en.vant();
                        }
                        
                    } else if( nåværende == to.merke){
                        teller2++;
                        markertO.add(to.merke);
                        if(s.grid[0] == to.merke && s.grid[1] == to.merke && s.grid[2] == to.merke){
                            to.vant();
                        }
                    }
                    
                }
                       
                }
            
            }
            markertX.clear();
            markertO.clear();
            }
        }
        




