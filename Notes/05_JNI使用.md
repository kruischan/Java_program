
# **JNI**

用于Java程序和C/C++程序間的相互調用

## **不帶包名**

直接使用javah命令生成头文件  `javah nativeTest`  

> 注意结尾不需要加`.java` 
> javah命令可以使用*-o*选项指定输出头文件文件名

编写c/c++函数，对应java源程序中使用`native`关键字声明的方法

```java
System.load("/mnt/chenkaicong/java_file/Java_program/07_jni/libnativeTest.so");
System.loadLibrary("nativeTest");
```

System.load要指定路径和库的完整名称  
System.loadLibrary只需指定库名就可以了，但是需把库拷贝至系统库路径下  

## **帶包名**

> hardControl.java源文件

```java
package com.example;
public class hardControl {
        static {
                try {
                        System.loadLibrary("hardControl");
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
        public static native int led_ctrl(int which, int status);
        public static native int led_open();
        public static native void led_close();
        public static void main(String args[]) {
        }
}
```

生成頭文件步驟：  

- 先生成類  `javac -d . hardControl.java`
- 生成本地頭文件  `javah -jni com.example.hardControl`  

> -jni可有可無，系統默認選項  

最後在當前目錄下生成com_example_hardControl.h文件

## **本地庫文件編譯**  

Linux下生成`.so`文件時，最好指定`jni.h`頭文件的路徑

```c
gcc -shared -I /usr/lib/jvm/java-1.8.0-openjdk-amd64/include/ -I /usr/lib/jvm/java-1.8.0-openjdk-amd64/include/linux/ -fPIC nativeTest.c -o libnativeTest.so
```

> 注意點：在Java程序中聲明`native`函數時，最好聲明成`static`靜態函數，這樣在調用時可以不用實例化對象

以上调用JNI的方法属于静态方法

## 动态注册

使用结构体`JNINativeMethod`声明，例如：

```java
static const JNINativeMethod gMethods[] = {
        {
        "native_init",
        "()V",
        (void *)android_media_MediaScanner_native_init
        },
}
```

注册函数：

```java
int register_android_media_MediaScanner(JNIEnv *env)
{
    return AndroidRuntime::registerNativeMethods(env,
                kClassMediaScanner, gMethods, NELEM(gMethods));
}
```

> 这要结合JNIHelp.cpp一起查看

env指向一个`JNIEnv`结构体类型对象  
classname为对应的Java类名，由于JNINativeMethod中使用的函数名并非全路径名，所以要指明是哪个类  

Java层通过System.loadLibrary加载完JNI动态库后，紧接着就会查找该库中一个叫JNI_OnLoad的函数，如果有，就调用它，而动态注册的工作就是在这里完成的。  

## 数据类型转换

除了Java中基本数据类型数组、Class、String和Throwable外，其余所有Java对象的数据类型在JNI中都用jobject表示。  

## JNIEnv

`JNIEnv`是一个与线程相关的代表JNI环境的结构体。

