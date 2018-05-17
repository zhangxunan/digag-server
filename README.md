
 ### Usage
 镜像地址
```
https://dev.aliyun.com/detail.html?spm=5176.1972343.2.8.1GqX4K&repoId=54838
```

To run it:
```
     # 在本地生成镜像,需安装docker
     mvn clean package docker:build
     # 将docker-compose.yml中的 web 容器镜像改为上面生成的镜像
     docker-compose up -d
     # 注意在mysql容器里先创建数据库，不然访问时会导致web容器关闭
     docker-compose exec mysql bash
     mysql -uroot -proot
     create database `db_kp` default character set utf8 collate utf8_general_ci;
```

 ### local  http://127.0.0.1:8080/swagger-ui.html  
 ### online 
