#include <stdio.h>
#include "nativeTest.h"

JNIEXPORT void JNICALL Java_nativeTest_nativePrint(JNIEnv *env, jclass c) 
{
	printf("native method print!\n");
}


