import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


class CustomClassLoaderTest {

    @Test
    void loadClassFromFile() throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        Class<?> cl = customClassLoader.findClass(ClassForLoading.class.getName());

        Object object = cl.newInstance();

        Method method = cl.getMethod("printMethod");
        method.invoke(object);
    }
}