//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        }
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        System.out.println("i = " + i);
//        }
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О.сотрудника — " + fullName);

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Данные Ф.И.О.сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача 3
        System.out.println("Задача 3");
        fullName = fullName.replace("Ivanov Ivan Ivanovich","Иванов Семён Семёнович");
        System.out.println("Данные Ф.И.О.сотрудника - " + fullName.replace("ё", "e"));

    }
}