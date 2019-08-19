# **JNI**
使用javah命令生成头文件  `javah nativeTest`  
> 注意结尾不需要加`.java` 

编写c/c++函数，对应java源程序中使用`native`关键字声明的方法

```java
System.load("/mnt/chenkaicong/java_file/Java_program/07_jni/libnativeTest.so");
System.loadLibrary("nativeTest");
```
System.load要指定路径和库的完整名称  
System.loadLibrary只需指定库名就可以了，但是需把库拷贝至系统库路径下