# Utils
Android工具类

参考博客：[Android开发常用的工具类](https://xuxiaoshi.gitee.io/Android%E5%BC%80%E5%8F%91%E5%B8%B8%E7%94%A8%E7%9A%84%E5%B7%A5%E5%85%B7%E7%B1%BB/)

#### 1.简介：

PxUtil：dp和px的转化；sp和px的转化。

ScreenUtil：获取屏幕宽高，状态栏高度，导航栏高度。

StateUtil：判断程序是否在后台。

#### 2.添加依赖

添加依赖
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

~~~
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
~~~

Step 2. Add the dependency

~~~
dependencies {
   implementation 'com.github.xiaoshitounen:Utils:1.0.0'
}
~~~
