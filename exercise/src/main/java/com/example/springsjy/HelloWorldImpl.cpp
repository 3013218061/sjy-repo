#include "jni.h"
#include "com_example_springsjy_HelloWorld.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_com_example_springsjy_HelloWorld_sayHelloWorld(JNIEnv *env,jobject obj){
    printf("Hello World!\n");
    return;
}