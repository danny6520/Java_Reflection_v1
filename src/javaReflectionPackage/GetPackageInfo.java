package javaReflectionPackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import javaReflectionPackage.UItoGetPackageInfo;




public class GetPackageInfo {

	
	
	//public static void main(String[] args) {
		public static String processPackageInfo (String text) {
	
			//AnotherClass anotherClass = new AnotherClass();
			
	        String packageName = text;
       
        //String packageName = "java.util.Arrays";
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            Class<?>[] classes = classLoader.loadClass(packageName).getDeclaredClasses();

            for (Class<?> clazz : classes) {
                System.out.println("Class: " + clazz.getName());
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    System.out.println("  Method: " + method.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		return packageName;
    }

		
}
