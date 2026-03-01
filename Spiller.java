class Spiller{
    boolean tur;
    boolean vunnet;
    char merke;
    public Spiller(char m){
        tur = false;
        merke = m;
        vunnet = false;
    }
    public boolean hentTur(){
        return tur;
    }

    public void vant(){
        vunnet = true;
    }
    public boolean harVunnet(){
        return vunnet;
    }
    public char settMarkering(){
        return merke;
    }
}