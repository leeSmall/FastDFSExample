1.搭建好fastdfs分布式文件系统
2.工程里面引入了fastdfs的源码，方便学习，工具类FastDFSClient可以直接调用源码里面的类，用于生产环境时可以包源码打成jar包
3./fdfs-demo/src/main/resources/fdfs/fdfs_client.conf 客户端配置文件
4.FastDFSClient.java是封装的工具类，加载了fdfs_client.conf客户端配置文件，实现了文件的上传、下载、删除，编码时可以直接调用
5.FastDFSTest.java 测试文件的上传、下载、删除，调用封装的工具类FastDFSClient.java
