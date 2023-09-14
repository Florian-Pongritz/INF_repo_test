public class demo {
    int zahl;
    public demo(){
        this.zahl = 0;
    }
    public demo(int v){
        this.zahl = v;
    }

    public int sqr(){
        return this.zahl*this.zahl;
    }

    public float sqrt(){
        return (float) Math.sqrt(this.zahl);
    }
}
