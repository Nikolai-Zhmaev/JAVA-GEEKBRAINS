package ru.geekbrains.MyPractice;

import java.util.Scanner;

public class StringRevers {

    Scanner sc = new Scanner(System.in);

    public StringRevers() {

        String str;
        int size;

        System.out.println( "Введите строчку: " );
        str = sc.nextLine();
        size = str.length(); /* избавим пользователя от необходимости предворительно задавать длинну строки. Она будет
                               определяться автомотически после введения*/

        Revers ( str, size ); // вынесем реализацию в отдельный метод.
    }

    private void Revers(String str, int size) {

        Stack stack = new StackImpl( size );

        for (int i = 0; i < str.length(); i++) {
            char charStr = str.charAt(i);
            stack.push(charStr);
        }

        System.out.println("Строка наоборот: ");

        while ( !stack.isEmpty() ) {
            System.out.print(stack.pop());
        }


    }


}
