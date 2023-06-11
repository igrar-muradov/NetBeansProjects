/*b
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author Igrar
 */
public class Test {

    public static void main(String[] args) throws Exception{
        Teacher t = new Teacher();
        Student[] ss = {};
        t.setStudents(ss);
 //       t.setStudents(null);
        checkObjNotNull(t);

    }

    public static void checkObjNotNull(Object obj) throws Exception{
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            Annotation[] anns = m.getDeclaredAnnotations();
            System.out.println(methods[i].getName());
            
            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                if (ann.annotationType() == BoshOlmasin.class) {
                    Object result = m.invoke(obj);
                    if (result == null) {
                        throw new IllegalArgumentException("Dedim axi bosh olmasin");
                    }
                    if (result instanceof Object[]) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("Dedim axi Array bosh olmasin");

                        }
                    }

                }

                System.out.println("ann = " + ann.annotationType());
            }
            System.out.println("------------------");
        }
    }

//                Teacher t = new Teacher();
//        Method[] methods = t.getClass().getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            Method m = methods[i];
//            Annotation[] anns = m.getDeclaredAnnotations();
//            System.out.println(methods[i].getName());
//            for (int j = 0; j < anns.length; j++) {
//                Annotation ann = anns[j];
//                System.out.println("ann = " + ann.annotationType());
//            }
//            System.out.println("------------------");
//        }
}
