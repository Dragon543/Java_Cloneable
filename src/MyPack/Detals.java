package MyPack;


import java.util.Random;

/**
 * Created by taras_000 on 01.02.2016.
 */
public class Detals implements Cloneable{
    String dname;

    public Detals(String bolt) {
        this.dname = bolt;
    }

    @Override
    public String toString() {
        return "Detals{"  + dname + '\'' + hashCode() + '}';
    }

    public Detals clone() throws CloneNotSupportedException{
        Detals cloned = (Detals) super.clone();
        return cloned;
    }

    //Проверка на качество детали
    public static void random1(){
        Random rnd = new Random(System.currentTimeMillis());
        int number = 1 + rnd.nextInt(99 - 1 + 1);
        if(number<5){
            System.out.print("\nBrak detal\n");
        }
        if(number>95){
            System.out.print("\nCopy detal\n");
        }
        if(number>5 || number<95) {
            System.out.print("\nGood detal\n");
        }
    }

}
