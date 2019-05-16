## 安装
---

Fork分支：https://github.com/aalansehaiyang/nacos

git clone 代码到本地、编译

```
git clone https://github.com/aalansehaiyang/nacos.git

cd nacos/
mvn -Prelease-nacos clean install -U  

cd distribution/target/nacos-server-$version/nacos/bin

```

启动服务器:


```
sh startup.sh -m standalone
```


管理后台：

http://172.16.113.76:8848/nacos/index.html


参考手册：

https://nacos.io/zh-cn/docs/quick-start.html