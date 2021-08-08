# Utils
Android工具类

参考博客：[Android开发常用的工具类](http://www.fanandjiu.com/article/801bf205.html)

#### 1.简介：

PxUtil：dp和px的转化；sp和px的转化。

ScreenUtil：获取屏幕宽高，状态栏高度，导航栏高度。

StateUtil：判断程序是否在后台。

SaveToAlbumUtil：将一个bitmap保存到系统相册中

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
   implementation 'com.github.xiaoshitounen:Utils:1.0.1'
}
~~~
