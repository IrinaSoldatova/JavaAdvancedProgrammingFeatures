package reflectionApi;

import java.lang.reflect.Method;


public class Program {
    public static void main(String[] args) {
        Class<?> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
