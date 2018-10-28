import java.util.Scanner;
import java.lang.String;

public class calc {
    public static void main (String[] args) {
        //boolean run=true;
        //while (run) {
          String uvedom="Здравствуйте! Выберите операцию из списка ниже! Введите exit если хотите выйти";
          String spisock="\nДеление-1\nУмножение-2\nСложение-3\nВычитание-4";
            //System.out.println(spisock);
            //Scanner name_op = new Scanner(System.in);
          Scanner options = new Scanner(System.in); //1
          int del=1;
          int umn=2;
          int slo=3;
          int vich=4;
          System.out.println(uvedom+spisock);
          //System.out.println(options.nextInt());
          int but = options.nextInt();
          if (but==del) {
              //System.out.println("Eto moy home, uhodi");
              String uvedom1="Введите делимое... ";
              String uvedom2="Введите делитель... ";
              Scanner delimoe = new Scanner(System.in);
              //Scanner delitel = new Scanner(System.in);
              System.out.println(uvedom1);
              int butDelim=delimoe.nextInt();
              Scanner delitel = new Scanner(System.in);
              System.out.println(uvedom2);
              int butDelitel=delitel.nextInt();
              int resultDel=(butDelim/butDelitel);
              System.out.println(resultDel);
            }
          if (but==umn) {
              String uvedom3="Введите первый множитель... ";
              String uvedom4="Введите второй множитель... ";
              Scanner mnoj = new Scanner(System.in);
              Scanner mnoj1 = new Scanner(System.in);
              System.out.println(uvedom3);
              int butMnoj=mnoj.nextInt();
              System.out.println(uvedom4);
              int butMnoj1=mnoj.nextInt();
              int resultUmn=(butMnoj*butMnoj1);
              System.out.println(resultUmn);
            }
          if (but==slo) {
              String uvedom5="Введите первое слагаемое... ";
              String uvedom6="Введите второе слагаемое... ";
              Scanner slog = new Scanner(System.in);
              Scanner slog1 = new Scanner(System.in);
              System.out.println(uvedom5);
              int butSlog=slog.nextInt();
              System.out.println(uvedom6);
              int butSlog1=slog1.nextInt();
              int resultSlo=(butSlog+butSlog1);
              System.out.println(resultSlo);
            }
          if (but==vich) {
              String uvedom7="Введите уменьшаемое... ";
              String uvedom8="Введите вычитаемое... ";
              Scanner umen = new Scanner(System.in);
              Scanner vichit = new Scanner(System.in);
              System.out.println(uvedom7);
              int butUmen=umen.nextInt();
              System.out.println(uvedom8);
              int butVichit=vichit.nextInt();
              int resultVich=(butUmen-butVichit);
              System.out.println(resultVich);
            }
    } 
}

