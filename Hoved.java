import java.util.Scanner;
class Hoved{
    
    public static void main(String[] args) {
        Spill[]spillet = new Spill[3];
        Spiller en = new Spiller('X');
        Spiller to = new Spiller('O');
        Scanner sc = new Scanner(System.in);
        en.tur = true;
        for (int i = 0; i < 3; i++){
            spillet[i] = new Spill();
            }

        int teller1 = 0; 
        int teller2 = 0;
        while(en.harVunnet() == false && to.harVunnet() == false){
            
            if(en.hentTur()){
                System.out.print(" Spiller 1 sin tur!");
                spillet[sc.nextInt()].grid[sc.nextInt()] = en.settMarkering();
                to.tur = true;
                en.tur = false;
            } else if(to.hentTur()){
                System.out.print(" Spiller 2 sin tur!");
                spillet[sc.nextInt()].grid[sc.nextInt()] = to.settMarkering();
                en.tur = true;
                to.tur = false;

            }
            for(Spill s: spillet){
                System.out.println(s.grid);
                for(int i = 0; i < s.grid.length; i++){
                    char nåværende = s.grid[i];
                    if(nåværende == en.merke){
                        teller1 ++;
                    }
                }
                    
                }
            if(teller1 == 3){
                en.vant();
            }
            }
            
            }
        }
        




