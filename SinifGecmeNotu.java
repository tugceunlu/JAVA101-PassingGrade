import java.util.Scanner;
public class SinifiGecmeNotu {
    public static void main(String[] args) {
        double math, phys, music, turk, chem, avg;
        int nClass = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Math Grade: ");
        math = input.nextDouble();
        System.out.print("Music Grade: ");
        music = input.nextDouble();
        System.out.print("Physics Grade: ");
        phys = input.nextDouble();
        System.out.print("Turkish Grade: ");
        turk = input.nextDouble();
        System.out.print("Chemistry Grade: ");
        chem = input.nextDouble();

        if (0 < math && math < 100){
            nClass++;
        }else
            math=0;


        if (0< music && music<100){
            nClass++;
        }else
            music=0;


        if (0 < chem && chem < 100){
            nClass++;
        }else
            chem=0;


        if (0 < turk && turk < 100){
            nClass++;
        }else
            turk=0;


        if (0 < phys && phys < 100){
            nClass++;
        }else
            phys=0;

        avg = (turk + chem + phys + math + music) / (nClass);


        if (avg >= 55) {
                System.out.print("Your grade's average is = " +avg+ " You pass the class.");
        } else {
                System.out.print("Your grade's average is = " +avg+ " You failed the class.");
        }


    }
}
