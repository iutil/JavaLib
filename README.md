
<h1 align="center">
    JavaLib
<br>

</h1>

<p align="center">
	<strong>Java开发，常用工具集合</strong>
</p>

<p align="center">
    <a target="_blank" href="https://jitpack.io/#iutil/JavaLib">
		<img src="https://jitpack.io/v/iutil/JavaLib.svg" ></img>
	</a>
	<a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.html">
		<img src="https://img.shields.io/:license-apache-blue.svg" ></img>
	</a>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-1.8+-green.svg" ></img>
	</a>
	<a target="_blank" href="https://travis-ci.org/looly/hutool">
		<img src="https://travis-ci.org/looly/hutool.svg?branch=v4-master" ></img>
	</a>
	<a target="_blank" href='https://github.com/iutil/JavaLib'>
		<img src="https://img.shields.io/github/stars/iutil/JavaLib.svg?style=social" alt="github star"></img>
	</a>
</p>

## 概述

JavaLib，是一个Java开发基础工具类库，对项目开发中常用的工具进行封装，如：加密、http请求、API接口等。
目的是帮助开发者更快速、更快捷的开发。

现由 `iutil` 团队开发和维护，我们的目的是：`无侵入性`，`轻量级`，`常用功能`，`无数次测试`，`不断完善`


<span style="color:red">注意：</span> JavaLib基于jdk8开发，如果你的jdk版本过低，请找到工具类，复制相关代码，进行使用。

## 使用

第一步，添加远程仓库：

```xml
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
```

第二步，添加依赖：

```xml
	<dependency>
	    <groupId>com.github.iutil</groupId>
	    <artifactId>JavaLib</artifactId>
	    <version>1.0.1</version>
	</dependency>
```

## Wiki

[V1.0.1.BUILD文档](doc/DOC-V1.0.1.md)

## 版本标识说明

##### 开发版本

标识：`BUILD`

说明：该版本只能用于构建（开发），有较大BUG，有发生重大错误的可能。

##### 预览版本

标识：`SNAPSHOT`

说明：预览版本，可用于测试，但是会有一些小的BUG，可能导致无法正常使用。

##### 稳定版本

标识：`RELEASE`

说明：稳定版本，可用于正式环境，可能没有最新的功能。

## 团队

团队名称：iutil

我们致力于Java程序研发，管理系统开发，中间件的研发

期待你的加入！