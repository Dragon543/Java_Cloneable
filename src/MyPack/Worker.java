package MyPack;

/**
 * Created by taras_000 on 01.02.2016.
 */
public class Worker {
    @Override
    public String toString() {
        return "Worker{" + mozgi + " " + hashCode() +'}';
    }

    Znanie mozgi;

    void work(Detals detals){
        try{
            Detals bolt2 = detals.clone();
            System.out.print("" + bolt2  +"");
        }
        catch (CloneNotSupportedException e){}
    }

    class Znanie implements Cloneable{
        @Override
        public String toString() {
            return "Znanie" +" "+ forall + " " +fiz+ " " + hashCode()+"";
        }

        String forall;
        Fizika fiz;
        public Znanie clone() throws CloneNotSupportedException{
            Znanie cloned = (Znanie)super.clone();
            cloned.fiz=this.fiz.clone();
            return cloned;
        }
        public Znanie(String forall, Fizika fiz){
            this.forall = forall;
            this.fiz = fiz;
        }
    }
    class Fizika implements Cloneable{
        String newZnanie;

        @Override
        public String toString() {
            return "Fizika{" + newZnanie + " " + hashCode()+"}";
        }
        public Fizika clone() throws CloneNotSupportedException{
            Fizika cloned =(Fizika)super.clone();
            return cloned;
        }
        public Fizika(String newZnanie) {
            this.newZnanie = newZnanie;
        }


    }
}
