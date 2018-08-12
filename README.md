# easyUIItemDemo
easyUI做的demo

#### 使用步骤



1. 将resource下的jdbc.properties数据库换成自己的(用单元测试service是否配置成功,成功之后,可以试下pageHelp(分页插件,mybatis版本需要3.2以上)单元测试)
2. 选择项目,右键run --> maven build --> goal,填写 (clean tomcat7:run)
3. 运行成功后访问localhost:8090
4 enjoy...
2. xuan使用run 


### 项目说明

本来想做整个项目前段加上后端一起自己搞,无奈水平不够.在忙其他事情,先开个头.
各位也可以先用着这个项目,我稍后会配上文档说明;
中间只是说说思路,怕贴代码会很乱;如果各位好的建议跟我说哦

**1.先说存在的问题的吧:**

1. mybatis 暂时不能讲日志输出到log文件中,只能输出到console,貌似这个mybatis的问题(http://www.mybatis.org/mybatis-3/zh/logging.html),如果大家有方案欢迎告诉我
2. 访问日志暂时还没有做,思路是自定义一个filter或者使用aop进行拦截(大家可网上找找,我试过aop)
3. 本来想freemark整个生成mapper --> service--> controller,还没有搞
4. 没有做登录,说说思路;可以用 security/shore这些
   也可以用最简单的判断session中有没有自己给的一个字段(例如用户名)
   定义一个interpretor(没有字段就到登录页面,代码有写,自己为了调试干掉了)
   退出登录,将session置为invalid


**2. 遇到的坑:**

1. 静态文件访问不到,有两种方法,一种是在web.xml中定义;另外一种是在spring.xml中定义;我使用spring.xml没有成功,用的是web.xml配置(可以看项目,我就不贴代码了)
2. 返回json报406 错误,这个是引用的jackson;可以看下pom文件
3. 设置拦截用的是"/",所有的请求会被拦截;/jsp/index.jsp中会有item-list这个访问,为了不被拦截,写了个showpage方法

### 总结
1. pom文件不要轻易去改,中间有各种坑,还是先把功能完成,再去慢慢优化吧,否者一直填坑,心好累
2. 自己的前端业务水平实在很低,先使用别人写好的模板入门,在慢慢拆开分解吧,不要自己一上来就搞起;效率太低
3. mybatis半自动工具很好用,有需要的可以用下,使用方法见另外[一个项目](https://github.com/xeroCBW/mybatisTool.git)(貌似我这个还不怎么好,有更好的,大家可以去搜下,我的将就着用,还不错)
