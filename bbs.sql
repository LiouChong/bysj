/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-12-25 22:14:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `applyplate`
-- ----------------------------
DROP TABLE IF EXISTS `applyplate`;
CREATE TABLE `applyplate` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) NOT NULL,
  `plate_id` int(10) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `apply_time` datetime NOT NULL,
  `hand_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `plate_id` (`plate_id`),
  CONSTRAINT `applyplate_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `applyplate_ibfk_2` FOREIGN KEY (`plate_id`) REFERENCES `plate` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of applyplate
-- ----------------------------
INSERT INTO `applyplate` VALUES ('3', '13', '2', '', '2018-08-17 11:45:12', null);
INSERT INTO `applyplate` VALUES ('4', '6', '1', '', '2018-08-17 11:45:15', null);
INSERT INTO `applyplate` VALUES ('5', '13', '5', '', '2018-08-17 11:45:18', null);
INSERT INTO `applyplate` VALUES ('6', '1', '13', '', '2018-08-17 11:45:21', null);

-- ----------------------------
-- Table structure for `chat_record`
-- ----------------------------
DROP TABLE IF EXISTS `chat_record`;
CREATE TABLE `chat_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `team_id` int(11) NOT NULL,
  `from_user_id` int(11) NOT NULL,
  `from_user_name` varchar(10) DEFAULT NULL,
  `send_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chat_record
-- ----------------------------

-- ----------------------------
-- Table structure for `favorites_article`
-- ----------------------------
DROP TABLE IF EXISTS `favorites_article`;
CREATE TABLE `favorites_article` (
  `user_id` int(10) NOT NULL,
  `post_id` int(10) NOT NULL,
  `time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `if_delete` bit(1) NOT NULL DEFAULT b'0',
  KEY `user_id` (`user_id`),
  KEY `post_id` (`post_id`),
  CONSTRAINT `favorites_article_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `favorites_article_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of favorites_article
-- ----------------------------

-- ----------------------------
-- Table structure for `follow`
-- ----------------------------
DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `fan_id` int(10) NOT NULL,
  `star_id` int(10) NOT NULL,
  `time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `if_delete` bit(1) NOT NULL DEFAULT b'0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of follow
-- ----------------------------
INSERT INTO `follow` VALUES ('1', '10', '0000-00-00 00:00:00', '');
INSERT INTO `follow` VALUES ('2', '10', '0000-00-00 00:00:00', '');
INSERT INTO `follow` VALUES ('3', '10', '0000-00-00 00:00:00', '');
INSERT INTO `follow` VALUES ('4', '10', '0000-00-00 00:00:00', '');

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(10) DEFAULT NULL,
  `permission` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '1', 'post:add');
INSERT INTO `permission` VALUES ('2', '1', 'reply:add');
INSERT INTO `permission` VALUES ('3', '2', 'post:delete');
INSERT INTO `permission` VALUES ('4', '2', 'reply:delete');
INSERT INTO `permission` VALUES ('5', '2', 'post:add');
INSERT INTO `permission` VALUES ('6', '2', 'reply:add');
INSERT INTO `permission` VALUES ('7', '2', 'user:ban');
INSERT INTO `permission` VALUES ('8', '3', 'post:add');
INSERT INTO `permission` VALUES ('9', '3', 'reply:add');
INSERT INTO `permission` VALUES ('10', '3', 'post:delete');
INSERT INTO `permission` VALUES ('11', '3', 'reply:delete');
INSERT INTO `permission` VALUES ('12', '3', 'user:ban');
INSERT INTO `permission` VALUES ('13', '3', 'moderator:ban');
INSERT INTO `permission` VALUES ('14', '3', 'moderator:agree');
INSERT INTO `permission` VALUES ('15', '2', 'post:good');
INSERT INTO `permission` VALUES ('16', '3', 'post:good');

-- ----------------------------
-- Table structure for `plate`
-- ----------------------------
DROP TABLE IF EXISTS `plate`;
CREATE TABLE `plate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `plate_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plate
-- ----------------------------
INSERT INTO `plate` VALUES ('1', 'JavaSE');
INSERT INTO `plate` VALUES ('2', 'Python');
INSERT INTO `plate` VALUES ('3', 'Javascript');
INSERT INTO `plate` VALUES ('4', 'PHP');
INSERT INTO `plate` VALUES ('5', 'C++');
INSERT INTO `plate` VALUES ('6', 'JavaEE');
INSERT INTO `plate` VALUES ('7', 'SQL');
INSERT INTO `plate` VALUES ('8', '移动开发');
INSERT INTO `plate` VALUES ('9', '云计算');
INSERT INTO `plate` VALUES ('10', '区块链');
INSERT INTO `plate` VALUES ('11', '腰椎');
INSERT INTO `plate` VALUES ('12', '颈椎');
INSERT INTO `plate` VALUES ('13', 'Go语言');

-- ----------------------------
-- Table structure for `plater`
-- ----------------------------
DROP TABLE IF EXISTS `plater`;
CREATE TABLE `plater` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `plate_id` int(11) NOT NULL,
  `start_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of plater
-- ----------------------------
INSERT INTO `plater` VALUES ('1', '10', '1', '2018-12-25 21:19:04');

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `info` varchar(10000) DEFAULT NULL,
  `publish_time` datetime NOT NULL,
  `poster_id` int(10) NOT NULL,
  `if_good` int(1) DEFAULT '0',
  `if_delete` int(1) DEFAULT '0',
  `plate_id` int(10) NOT NULL,
  `plate_name` varchar(10) NOT NULL,
  `reply_count` int(10) DEFAULT '0',
  `poster_name` varchar(20) DEFAULT NULL,
  `poster_picture` varchar(255) DEFAULT NULL,
  `thumbup_count` int(3) NOT NULL DEFAULT '0',
  `last_modify_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `poster_id` (`poster_id`),
  CONSTRAINT `post_ibfk_1` FOREIGN KEY (`poster_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '基础知识总结：线程安全的集合与线程不安全的集合', '集合大概有4种类型：List   Set   Queue  Map\r\n\r\n其中Vector、HashTable、Properties是线程安全的。其中ArrayList、LinkedList、HashSet、TreeSet、HashMap、TreeMap等都是线程不安全的。（线程不安全是指：当多个线程访问同一个集合或Map时，如果有超过一个线程修改了ArrayList集合，则程序必须手动保证该集合的同步性。）\r\n\r\n当多个并发同时对非线程安全的集合进行增删改的时候会破坏这些集合的数据完整性', '2018-08-13 19:43:23', '10', '1', '0', '6', 'JavaEE', '6', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('2', '数据库中的索引问题', '假设我们队数据库的姓字段做索引 另一个索引是对数据库的名字段做索引\r\n\r\n\r\n\r\n其中姓的长度大约就两个汉字的大小，名的长度大约100个汉字的大小，那么对着两列分别做索引，哪个索引更快呢？类型都是varchar\r\n\r\n\r\n\r\n为什么呢？', '2018-08-13 19:47:26', '10', '0', '0', '7', 'SQL', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('3', '为什么HashMap是线程不安全的', 'RT', '2018-08-13 19:48:59', '10', '0', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('4', '一个小白的疑惑', '先说自己的情况，今年刚毕业，在传统软件公司上班半年了，平时都是些业务代码，用的技术也比较稳定（有点过时）。平常休息的总想提升自己的技术能力，但是苦于没有目标，总是这里学一点那里学一点。想问下各位大佬，是先学一些流行的框架如：springCloud rabbitMq  之类的框架，还是要先学一些底层的知识如：jvm虚拟机，各种java源码之类的？', '2018-08-13 19:53:38', '10', '0', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('5', '关于java的引用类型的一些疑问', '在jav[i]a里面有引用类型。那class，interface，enum这些算不算？\r\n我知道的引用类型就是自己封装的那些类，创建对象时可以说是引用类型，String，Integer等都是封装好的。\r\n还有定义一个数组时，int[]是一个引用类型。\r\n除了以上的还有别的嘛？', '2018-08-13 19:55:04', '10', '0', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('6', '关于java的引用类型的一些疑问', '在jav[i]a里面有引用类型。那class，interface，enum这些算不算？\r\n我知道的引用类型就是自己封装的那些类，创建对象时可以说是引用类型，String，Integer等都是封装好的。\r\n还有定义一个数组时，int[]是一个引用类型。\r\n除了以上的还有别的嘛？', '2018-08-13 19:56:33', '10', '0', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('9', '\r\nJava多线程编程要点（一）', '1、 认识Thread和Runnable\r\n\r\nJava中实现多线程有两种途径：继承Thread类或者实现Runnable接口。Runnable是接口，建议用接口的方式生成线程，因为接口可以实现多继承，况且Runnable只有一个run方法，很适合继承。在使用Thread的时候只需继承Thread，并且new一个实例出来，调用 start()方法即可以启动一个线程。\r\n\r\nThread Test = new Thread();\r\n\r\nTest.start();\r\n\r\n在使用Runnable的时候需要先new一个实现Runnable的实例，之后启动Thread即可。\r\n\r\nTest impelements Runnable;\r\n\r\nTest t = new Test();\r\n\r\nThread test = new Thread(t);\r\n\r\ntest.start();\r\n\r\n总结：Thread和Runnable是实现java多线程的2种方式，runable是接口，thread是类，建议使用runable实现 java多线程，不管如何，最终都需要通过thread.start()来使线程处于可运行状态。\r\n\r\n2、 认识Thread的start和run\r\n\r\n1） start：用start方法来启动线程，真正实现了多线程运行，这时无需等待run方法体代码执行完毕而直接继续执行下面的代码。通过调用Thread类的 start()方法来启动一个线程，这时此线程处于就绪（可运行）状态，并没有运行，一旦得到cpu时间片，就开始执行run()方法，这里方法 run()称为线程体，它包含了要执行的这个线程的内容，Run方法运行结束，此线程随即终止。', '2018-08-13 20:14:17', '10', '1', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('10', '\r\nJava多线程编程要点（二）', '4、 Timer 和 Timer Task 的使用\r\n\r\nTimer 是一种定时器工具，用来在一个后台线程计划执行指定任务，这些任务可以被执行一次，也可以被定期执行。每个 Timer 对象对应一个后台线程，顺序地执行所有计时器任务。如果完成某个计时器任务的时间太长，那么它会“独占”计时器的任务执行线程，从而可能延迟后续任务的执行。对 Timer 对象最后的引用完成并且所有未处理的任务都已执行完成后，计时器的任务执行线程会正常终止（并且成为垃圾回收的对象）。TimerTask是一个抽象类，实现了Runable接口，它的子类代表一个可以被Timer计划的任务。\r\n\r\n1） 一个简单的Demo，让大家对Timer、TimerTask的使用有感性的认识。\r\n\r\n\r\n2） Timer和TimerTask的常用api函数说明\r\n\r\n这里强调Timer类的schedule和scheduleAtFixedRate的区别。schedule和 scheduleAtFixedRate的区别在于，schedule以固定的相对时间间隔执行，如果某一次执行被延时了，往后的执行的执行时间也会相对延时；而scheduleAtFixedRate是以绝对的时间间隔执行，如果某一次执行被延时，它的后一次执行的延时将会缩短（scheduleAtFixedRate会把已经过去的时间也作为周期执行）。schedule注重的是时间间隔的稳定，而 scheduleAtFixedRate注重的是执行频率的稳定。\r\n\r\n3） Timer的终止\r\n\r\n默认情况下，只要一个程序的timer线程在运行，那么这个程序就会保持运行。当然，你可以通过以下四种方法终止一个timer线程：\r\n\r\na）调用timer的cancle方法。你可以从程序的任何地方调用此方法，甚至在一个timer task的run方法里；\r\n\r\nb）让timer线程成为一个daemon线程（可以在创建timer时使用new Timer(true)达到这个目地），这样当程序只有daemon线程的时候，它就会自动终止运行；\r\n\r\nc）当timer相关的所有task执行完毕以后，删除所有此timer对象的引用（置成null），这样timer线程也会终止；\r\n\r\nd）调用System.exit方法，使整个程序（所有线程）终止。\r\n\r\n总结：Timer和TimerTask可以简单理解为Timer定时器在触发TimerTask任务调用，通常用schedule和 scheduleAtFixedRate方法来调用timertask任务，cancle来终止任务调用。Timer简单易用，比较适合提供轻量级的计时器功能，但是对时效性很强的任务调度请用其它方法来实现（正如javadoc所述”Timer does not offer real-time guarantees: it schedules tasks using the Object.wait(long) method”）。\r\n', '2018-08-13 20:19:55', '10', '1', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('11', 'Java中的24种设计模式与7大原则 ', '24种设计模式\r\n\r\nJava 学习blog https://blog.csdn.net/netcobol ，欢迎关注\r\n\r\n1、创建型模式\r\n\r\n抽象工厂模式(Abstract factory pattern): 提供一个接口, 用于创建相关或依赖对象的家族, 而不需要指定具体类.\r\n\r\n生成器模式(Builder pattern): 使用生成器模式封装一个产品的构造过程, 并允许按步骤构造. 将一个复杂对象的构建与它的表示分离, 使得同样的构建过程可以创建不同的表示.\r\n\r\n工厂模式(factory method pattern): 定义了一个创建对象的接口, 但由子类决定要实例化的类是哪一个. 工厂方法让类把实例化推迟到子类.\r\n\r\n原型模式(prototype pattern): 当创建给定类的实例过程很昂贵或很复杂时, 就使用原形模式.\r\n\r\n单例模式(Singleton pattern): 确保一个类只有一个实例, 并提供全局访问点.\r\n\r\n多例模式(Multition pattern): 在一个解决方案中结合两个或多个模式, 以解决一般或重复发生的问题.\r\n\r\n2、结构型模式\r\n\r\n适配器模式(Adapter pattern): 将一个类的接口, 转换成客户期望的另一个接口. 适配器让原本接口不兼容的类可以合作无间. 对象适配器使用组合, 类适配器使用多重继承.\r\n\r\n桥接模式(Bridge pattern): 使用桥接模式通过将实现和抽象放在两个不同的类层次中而使它们可以独立改变.\r\n\r\n组合模式(composite pattern): 允许你将对象组合成树形结构来表现\"整体/部分\"层次结构. 组合能让客户以一致的方式处理个别对象以及对象组合.\r\n\r\n装饰者模式(decorator pattern): 动态地将责任附加到对象上, 若要扩展功能, 装饰者提供了比继承更有弹性的替代方案.\r\n\r\n外观模式(facade pattern): 提供了一个统一的接口, 用来访问子系统中的一群接口. 外观定义了一个高层接口, 让子系统更容易使用.\r\n\r\n享元模式(Flyweight Pattern): 如想让某个类的一个实例能用来提供许多\"虚拟实例\", 就使用蝇量模式.\r\n\r\n代理模式(Proxy pattern): 为另一个对象提供一个替身或占位符以控制对这个对象的访问.\r\n\r\n3、行为型模式\r\n\r\n责任链模式(Chain of responsibility pattern): 通过责任链模式, 你可以为某个请求创建一个对象链. 每个对象依序检查此请求并对其进行处理或者将它传给链中的下一个对象.\r\n\r\n命令模式(Command pattern): 将\"请求\"封闭成对象, 以便使用不同的请求,队列或者日志来参数化其他对象. 命令模式也支持可撤销的操作.\r\n\r\n解释器模式(Interpreter pattern): 使用解释器模式为语言创建解释器.\r\n\r\n迭代器模式(iterator pattern): 提供一种方法顺序访问一个聚合对象中的各个元素, 而又不暴露其内部的表示.\r\n\r\n中介者模式(Mediator pattern) : 使用中介者模式来集中相关对象之间复杂的沟通和控制方式.\r\n\r\n备忘录模式(Memento pattern): 当你需要让对象返回之前的状态时(例如, 你的用户请求\"撤销\"), 你使用备忘录模式.\r\n\r\n观察者模式(observer pattern): 在对象之间定义一对多的依赖, 这样一来, 当一个对象改变状态, 依赖它的对象都会收到通知, 并自动更新.\r\n\r\n状态模式(State pattern): 允许对象在内部状态改变时改变它的行为, 对象看起来好象改了它的类.\r\n\r\n策略模式(strategy pattern): 定义了算法族, 分别封闭起来, 让它们之间可以互相替换, 此模式让算法的变化独立于使用算法的客户.\r\n\r\n模板方法模式(Template pattern): 在一个方法中定义一个算法的骨架, 而将一些步骤延迟到子类中. 模板方法使得子类可以在不改变算法结构的情况下, 重新定义算法中的某些步骤.\r\n\r\n访问者模式(visitor pattern): 当你想要为一个对象的组合增加新的能力, 且封装并不重要时, 就使用访问者模式.\r\n\r\n七大设计原则：\r\n\r\n单一职责原则【SINGLE RESPONSIBILITY PRINCIPLE】：一个类负责一项职责。\r\n\r\n里氏替换原则【LISKOV SUBSTITUTION PRINCIPLE】：继承与派生的规则。\r\n\r\n依赖倒置原则【DEPENDENCE INVERSION PRINCIPLE】：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。即针对接口编程，不要针对实现编程。\r\n\r\n接口隔离原则【INTERFACE SEGREGATION PRINCIPLE】：建立单一接口，不要建立庞大臃肿的接口，尽量细化接口，接口中的方法尽量少。\r\n\r\n迪米特法则【LOW OF DEMETER】：低耦合，高内聚。\r\n\r\n开闭原则【OPEN CLOSE PRINCIPLE】：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。\r\n\r\n组合/聚合复用原则【Composition/Aggregation Reuse Principle(CARP) 】：尽量使用组合和聚合少使用继承的关系来达到复用的原则。\r\n', '2018-08-13 20:23:50', '10', '1', '0', '1', 'JavaSE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('12', '完成 \"123\"+\"4567\"=\"4690\"的计算功能', '#include<stdio.h>\r\n#include<string.h>\r\nchar *StrNumAdd(char *p1,char *p2);\r\n\r\nint main(void)\r\n{\r\nchar *s1=\"123\",*s2=\"4567\";\r\nprintf(\"\\n=%s\",StrNumAdd(s1,s2));\r\n/* 输出为 = 4690*/\r\nreturn 0;\r\n}\r\n\r\n/*完成 \"123\"+\"4567\"=\"4690\"的计算功能*/\r\nchar *StrNumAdd(char *p1,char *p2)\r\n{ char p3[201]=\"\",*pi=p3;\r\n  int temp,flag = 0;\r\n  strrev(p1);strrev(p2);\r\n  while(*p1||*p2)\r\n     __在此处填一条语句__________\r\n  *pi=\'\\0\';\r\n  strrev(p3);\r\n  return p3;\r\n}', '2018-08-14 11:37:39', '10', '1', '0', '2', 'Python', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('13', '求一本关于MYSQL的书，最好是关于脚本方面的书', '求一本关于MYSQL的书，最好是关于脚本方面的书', '2018-08-14 11:45:40', '10', '1', '0', '7', 'SQL', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('14', 'Shiro框架删除操作的权限', 'SSM框架使用@PathValueable来绑定参数执行一个删除操作。如下\r\nJava code\r\n?\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n@RequiresRoles(\"company\")\r\n    @RequestMapping(value=\"/delete/{userId}\",method = RequestMethod.GET)\r\n    @ResponseBody\r\n    public BaseResponeseResult delete(@PathVariable Integer userId) {\r\n        return service.delete(userId);\r\n    }\r\n\r\n@RequiresRoles(\"company\")代表的是执行该操作需要company级别的权限\r\n\r\n问题来了。\r\n\r\n假如两个公司,A公司登陆之后通过浏览器把一个B公司的用户id写到了URL中的参数部分，\r\n然后一访问，就会把B公司对应的账户删除了。\r\n\r\n例如A公司的管理员登录后再浏览器地址栏输入 域名/delete/B公司某user的id\r\n\r\n请求这样的风险要如何规避？\r\nShiro框架应该有这样的功能，只是我不知道怎么来弄。\r\n求帮忙了。', '2018-08-14 13:47:02', '6', '1', '0', '6', 'JavaEE', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('15', '亲测系列一，go map遍历删除，很方便 ', 'package main\r\n \r\nimport (\r\n    \"log\"\r\n)\r\n \r\nfunc main() {\r\n    // 先声明map\r\n    var m1 map[string]string\r\n    // 再使用make函数创建一个非nil的map，nil map不能赋值\r\n    m1 = make(map[string]string)\r\n    // 最后给已声明的map赋值\r\n    m1[\"a\"] = \"aa\"\r\n    m1[\"b\"] = \"bb\"\r\n    m1[\"c\"] = \"cc\"\r\n    log.Println(m1)\r\n \r\n \r\n    // 遍历map\r\n    for k, v := range m1 {\r\n        log.Println(k, v)\r\n        delete(m1,k)\r\n    }\r\n \r\n \r\n    log.Println(m1)\r\n}', '2018-08-14 13:49:48', '2', '1', '0', '13', 'Go语言', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('16', '什么样的床垫对腰椎好?', '每天编程太久了，腰椎晚上有点难受，推荐一个好点的床垫吧\r\n\r\n单人床。。', '2018-08-14 17:27:39', '10', '0', '0', '11', '腰椎', '1', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('17', '什么样的床垫对腰椎好?', '每天编程太久了，腰椎晚上有点难受，推荐一个好点的床垫吧\r\n\r\n单人床。。', '2018-08-14 17:28:22', '10', '0', '0', '11', '腰椎', null, null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('21', 'aloha', '雷吼啊', '2018-08-15 16:24:03', '10', '0', '0', '12', '颈椎', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('22', '贪玩蓝月', '是兄弟就来砍我', '2018-08-15 16:29:49', '10', '0', '0', '8', '移动开发', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('25', 'delete——test', '删我', '2018-08-15 16:47:16', '6', '0', '1', '4', 'PHP', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('28', 'jhfnhgfj', 'mj,hj', '2018-08-15 17:03:33', '6', '0', '0', '2', 'Python', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('29', 'asd', 's', '2018-08-15 17:03:38', '6', '0', '0', '2', 'Python', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('30', 'asc', 'ascascasc', '2018-08-15 17:03:42', '6', '0', '0', '2', 'Python', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('31', 'asd', 'asdf', '2018-09-13 21:10:21', '10', '1', '0', '2', 'Python', '0', null, null, '0', '0000-00-00 00:00:00');
INSERT INTO `post` VALUES ('32', '', '', '2018-11-29 21:32:09', '10', '1', '0', '11', '腰椎', '0', null, null, '0', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for `private_letter`
-- ----------------------------
DROP TABLE IF EXISTS `private_letter`;
CREATE TABLE `private_letter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `from_user_id` int(11) NOT NULL,
  `content` varchar(300) NOT NULL,
  `to_user_id` int(11) NOT NULL,
  `if_read` bit(1) NOT NULL DEFAULT b'0',
  `if_delete` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of private_letter
-- ----------------------------

-- ----------------------------
-- Table structure for `reply`
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_info` varchar(120) NOT NULL,
  `reply_time` datetime DEFAULT NULL,
  `user_id` int(10) DEFAULT NULL,
  `post_id` int(10) DEFAULT NULL,
  `if_delete` bit(1) NOT NULL DEFAULT b'0',
  `thumbup_count` int(3) NOT NULL DEFAULT '0',
  `user_name` varchar(20) NOT NULL,
  `user_picture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `post_id` (`post_id`),
  CONSTRAINT `reply_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `reply_ibfk_2` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('1', '哈哈太逗了', '2018-08-15 21:22:19', '6', '4', '', '0', '', null);
INSERT INTO `reply` VALUES ('2', '没毛病嗷', '2018-08-15 21:22:44', '2', '2', '', '0', '', null);
INSERT INTO `reply` VALUES ('3', '嚯嚯嚯', '2018-08-16 16:53:47', '10', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('4', '那是真的牛批', '2018-08-16 16:54:04', '6', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('5', '指定给你吃好果子嗷', '2018-08-16 18:19:39', '11', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('6', '指定给你吃好果子嗷', '2018-08-16 18:20:29', '11', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('7', '大家好我是陈冠希，一giao窝里giao giao giao', '2018-08-16 18:45:05', '12', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('8', '阿giao给你留个言', '2018-08-16 18:46:31', '12', '1', '', '0', '', null);
INSERT INTO `reply` VALUES ('9', '不睡最好', '2018-08-16 18:48:23', '11', '16', '', '0', '', null);
INSERT INTO `reply` VALUES ('11', 'giao哥up up', '2018-08-16 21:20:40', '6', '1', '', '0', '', null);

-- ----------------------------
-- Table structure for `team`
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(20) NOT NULL,
  `member_count` int(11) NOT NULL,
  `plate_id` int(11) NOT NULL,
  `plate_name` varchar(20) NOT NULL,
  `leader_id` varchar(20) NOT NULL,
  `leader_name` varchar(20) NOT NULL,
  `if_delete` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team
-- ----------------------------

-- ----------------------------
-- Table structure for `tlevel`
-- ----------------------------
DROP TABLE IF EXISTS `tlevel`;
CREATE TABLE `tlevel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tlevel
-- ----------------------------
INSERT INTO `tlevel` VALUES ('1', 'ordinary');
INSERT INTO `tlevel` VALUES ('2', 'moderator');
INSERT INTO `tlevel` VALUES ('3', 'manager');

-- ----------------------------
-- Table structure for `total_station_information`
-- ----------------------------
DROP TABLE IF EXISTS `total_station_information`;
CREATE TABLE `total_station_information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) NOT NULL,
  `time` datetime NOT NULL,
  `from_user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of total_station_information
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL,
  `psw` varchar(20) NOT NULL,
  `money` int(10) DEFAULT '0',
  `if_ban` int(1) DEFAULT '0',
  `email` varchar(50) NOT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `level` int(11) NOT NULL DEFAULT '1' COMMENT '用户权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'allu', 'lc123456', '0', '0', '30845454@qq.com', null, '1');
INSERT INTO `user` VALUES ('2', 'sd', '123456', '0', '1', '123456@qq.com', null, '1');
INSERT INTO `user` VALUES ('6', 'admin', '123', '0', '0', 'admin@qq.com', 'admin@qq.comjm.jpg', '1');
INSERT INTO `user` VALUES ('10', 'gosling', '123', '0', '0', '970009721@qq.com', '970009721@qq.comB`M4$SQLPZU{VT5PXBKS_1Q.png', '1');
INSERT INTO `user` VALUES ('11', '冠希', '123', '0', '0', '308045454@qq.com', '308045454@qq.combefore2.jpg', '1');
INSERT INTO `user` VALUES ('12', 'yoyo', '123', '0', '0', '465024877@qq.com', '465024877@qq.com20180520024938601.jpg', '1');
INSERT INTO `user` VALUES ('13', '测试', '123', '0', '0', 'u1@qq.com', null, '1');
INSERT INTO `user` VALUES ('14', null, '123', '0', '0', '2637799307@qq.com', null, '1');

-- ----------------------------
-- Table structure for `user_ban`
-- ----------------------------
DROP TABLE IF EXISTS `user_ban`;
CREATE TABLE `user_ban` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ban_user_id` int(11) NOT NULL,
  `hand_user_id` int(11) NOT NULL,
  `end_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_ban
-- ----------------------------

-- ----------------------------
-- Table structure for `user_team_rel`
-- ----------------------------
DROP TABLE IF EXISTS `user_team_rel`;
CREATE TABLE `user_team_rel` (
  `user_id` int(11) NOT NULL,
  `team_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_team_rel
-- ----------------------------

-- ----------------------------
-- Procedure structure for `getinfo`
-- ----------------------------
DROP PROCEDURE IF EXISTS `getinfo`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getinfo`(
	OUT minlevel DECIMAL(8,2),
	OUT avglevel DECIMAL(8,2),
	OUT maxlevel DECIMAL(8,2)
)
BEGIN	
	SELECT MIN(`level`) INTO minlevel FROM `user`;
	SELECT MAX(`level`) INTO maxlevel FROM `user`;
	SELECT AVG(`level`) INTO avglevel FROM `user`;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `getinfo2`
-- ----------------------------
DROP PROCEDURE IF EXISTS `getinfo2`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getinfo2`()
BEGIN	
	SELECT MIN(`level`),MAX(`level`),AVG(`level`) FROM `user`;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `getuserbyid`
-- ----------------------------
DROP PROCEDURE IF EXISTS `getuserbyid`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `getuserbyid`(
	IN userid INT, 
	OUT retuser DECIMAL(8,2)
)
BEGIN 
	SELECT `level` FROM `user` WHERE `user`.id = userid INTO retuser;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `productpricing`
-- ----------------------------
DROP PROCEDURE IF EXISTS `productpricing`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `productpricing`()
BEGIN
	SELECT AVG(`level`) from `user`;
END
;;
DELIMITER ;
