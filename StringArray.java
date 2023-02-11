public class StringArray {

    public static void main(String[] args) {
        String a = "I like Java!!!";
        printText(a);

        //String.CharAt() - обращаться через точку к методу
        //если метод статический, то его можно вызвать объекта (без точки, как пример выше printText(а))
        //объект имеет набор методов
        //если метод не имеет пометки static, метод внутри класса, обращаемся через контректную строку к ее методам

        System.out.println(a.length());
        //Рассчитать последний символ строки, используя метод String.CharAt() - символ из строки
        System.out.println(a.charAt(a.length() - 1));

        //Проверить, заканчивается ли ваша строка подстрокой "!!!". Используем метод String.endsWith()
        System.out.println(a.endsWith("!!!"));

        //Проверить, начинается ли строка подстрокой
        System.out.println(a.startsWith("I like"));

        //Проверить, содержит ли строка подстроку "Java"
        System.out.println(a.contains("Java"));

        //Вырезать строку Java с помощью String.substring()
        System.out.println(a.substring(a.indexOf("l"), a.indexOf("e") + 1));
        String newA = a.substring(a.indexOf("l"));
        System.out.println(newA.substring(0, newA.indexOf(" ")));
    }

    public static void printText (String text) {
        System.out.println(text);
    }
}
