#include <jni.h>
#include <string>

//extern "C" { //x264和rtmp里面都有exern "C"
    #include <rtmp.h>
    #include "x264.h"
//}


extern "C" JNIEXPORT jstring JNICALL
Java_com_tianzhuan_livepusher_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    char version[50];
    sprintf(version,"librtmp version: %d",  RTMP_LibVersion());
//    return env->NewStringUTF(hello.c_str());
    return env->NewStringUTF(version);
}
