package MyPack;

/**
 * Created by taras_000 on 01.02.2016.
 */
public class mainClass {
    public static void main(String[] args){
        String detal1;
        Detals detal;
        detal = new Detals("Bolt");
        System.out.print(detal+"\n");
        Worker Vasya = new Worker();
        Worker Peta = new Worker();
        Vasya.work(detal);
        Detals.random1();
        Vasya.mozgi=Vasya.new Znanie("Junior", Vasya.new Fizika("12"));
        try{
            Peta.mozgi=Vasya.mozgi.clone();
        }
        catch(CloneNotSupportedException e){}
        System.out.print(Vasya+"\n");
        System.out.print(Peta+"\n");


    }
}
