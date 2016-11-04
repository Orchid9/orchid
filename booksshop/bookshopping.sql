/*
Navicat MySQL Data Transfer

Source Server         : Orchid
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : bookshopping

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-10-27 20:54:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `user_account` char(43) NOT NULL,
  `address_telephone` char(20) NOT NULL,
  `address_postcode` char(20) NOT NULL,
  `address_live` varchar(255) NOT NULL,
  `address_id` varchar(22) NOT NULL,
  PRIMARY KEY  (`user_account`,`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES ('admin', '178542025', '321321321', '山东青岛', '青岛工学院');

-- ----------------------------
-- Table structure for `books`
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `book_id` char(4) NOT NULL,
  `book_name` char(20) default NULL,
  `book_price` char(4) default NULL,
  `book_picture` char(20) default NULL,
  `book_shoper` char(20) default NULL,
  `book_summary` varchar(255) default NULL,
  `book_sale` char(255) default NULL,
  `book_type` char(255) default NULL,
  PRIMARY KEY  (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('01', '灵活应变的营销', '39', 'img/1.jpg', '松竹斋', '销售类型', '132', '教育');
INSERT INTO `books` VALUES ('02', '心如莲花静静开', '66', 'img/2.jpg', '书天堂', '花 ', '789', '青春');
INSERT INTO `books` VALUES ('03', '你若不来 我怎敢老去', '26', 'img/3.jpg', '文墨居', null, '454', '青春');
INSERT INTO `books` VALUES ('04', '幸福人生十八讲', '45', 'img/4.jpg', '三辰书屋', null, '45', '青春');
INSERT INTO `books` VALUES ('05', '生平', '56', 'img/5.jpg', '弘一书屋', null, '546', '励志');
INSERT INTO `books` VALUES ('06', '相信是万能的开始', '25', 'img/6.jpg', '瀚竹轩', null, '153', '励志');
INSERT INTO `books` VALUES ('07', '掉队的北极燕', '65', 'img/7.jpg', '文墨居', null, '65', '育儿');
INSERT INTO `books` VALUES ('08', '看云集', '71', 'img/8.jpg', '松竹斋', null, '13', '励志');
INSERT INTO `books` VALUES ('09', '传统企业电商之道', '12', 'img/9.jpg', '瀚竹轩', null, '84', '企业');
INSERT INTO `books` VALUES ('10', '身体知道答案', '23', 'img/10.jpg', '三辰书屋', null, '153', '育儿');
INSERT INTO `books` VALUES ('11', '家族企业发展模型', '15', 'img/11.jpg', '松竹斋', null, '46', '企业');
INSERT INTO `books` VALUES ('12', '平淡的人生最幸福', '26', 'img/12.jpg', '书天堂', null, '165', '励志');
INSERT INTO `books` VALUES ('13', '做不抱怨的员工', '35', 'img/13.jpg', '瀚竹轩', null, '465', '企业');
INSERT INTO `books` VALUES ('14', '如何治理逼疯主管的员工', '45', 'img/14.jpg', '弘一书屋', null, '15', '企业');
INSERT INTO `books` VALUES ('15', '时刻在燃烧', '26', 'img/15.jpg', '文墨居', null, '156', '青春');
INSERT INTO `books` VALUES ('16', '去远方长大', '56', 'img/16.jpg', '三辰书屋', null, '15', '青春');
INSERT INTO `books` VALUES ('17', '让企业有思想', '16', 'img/17.jpg', '瀚竹轩', null, '68', '企业');
INSERT INTO `books` VALUES ('18', '社会是什么', '89', 'img/18.jpg', '松竹斋', null, '132', '育儿');
INSERT INTO `books` VALUES ('19', '矛盾中的繁荣', '56', 'img/19.jpg', '弘一书屋', null, '56', '企业');
INSERT INTO `books` VALUES ('20', '不可思议的心理操作', '21', 'img/20.jpg', '书天堂', null, '165', '教育');
INSERT INTO `books` VALUES ('21', '我爱幼儿园', '85', 'img/21.jpg', '三辰书屋', null, '856', '育儿');
INSERT INTO `books` VALUES ('22', '做父亲 不许失败的创业', '56', 'img/22.jpg', '瀚竹轩', null, '13', '育儿');
INSERT INTO `books` VALUES ('23', '爱是一种信仰', '23', 'img/23.jpg', '书天堂', null, '5', '青春');
INSERT INTO `books` VALUES ('24', '成全更好的自己', '23', 'img/24.jpg', '文墨居', null, '15', '青春');
INSERT INTO `books` VALUES ('25', '怪诞育儿学', '46', 'img/25.jpg', '瀚竹轩', null, '5', '育儿');
INSERT INTO `books` VALUES ('26', '土里的秘密', '13', 'img/26.jpg', '弘一书屋', null, '15', '育儿');
INSERT INTO `books` VALUES ('27', '慢养', '56', 'img/27.jpg', '瀚竹轩', null, '56', '育儿');
INSERT INTO `books` VALUES ('28', '蓝色经济', '23', 'img/28.jpg', '弘一书屋', null, '165', '企业');
INSERT INTO `books` VALUES ('29', '销售无处不在', '12', 'img/29.jpg', '松竹斋', null, '15', '企业');
INSERT INTO `books` VALUES ('30', '逆转瘦', '56', 'img/30.jpg', '瀚竹轩', null, '156', '教育');
INSERT INTO `books` VALUES ('31', '传世老偏方', '56', 'img/31.jpg', '三辰书屋', null, '156', '育儿');
INSERT INTO `books` VALUES ('32', '发现之旅', '14', 'img/32.jpg', '瀚竹轩', null, '15', '科技');
INSERT INTO `books` VALUES ('33', '代代卓越', '25', 'img/33.jpg', '松竹斋', null, '156', '企业');
INSERT INTO `books` VALUES ('34', 'java web开发之道', '34', 'img/34.jpg', '书天堂', null, '156', '教育');
INSERT INTO `books` VALUES ('35', 'java程序设计', '65', 'img/35.jpg', '瀚竹轩', null, '4', '教育');
INSERT INTO `books` VALUES ('36', 'java语言教程', '24', 'img/36.jpg', '文墨居', null, '5156', '教育');
INSERT INTO `books` VALUES ('37', 'hadoop开源云计算平台', '21', 'img/37.jpg', '弘一书屋', null, '854', '教育');
INSERT INTO `books` VALUES ('38', 'Learning Hadoop 2', '21', 'img/38.jpg', '书天堂', null, '615', '教育');
INSERT INTO `books` VALUES ('39', 'hadoop 大数据处理', '52', 'img/39.jpg', '瀚竹轩', null, '56', '教育');
INSERT INTO `books` VALUES ('40', 'Hadoop  operations', '65', 'img/40.jpg', '弘一书屋', null, '15', '教育');
INSERT INTO `books` VALUES ('41', '大学英语六级词汇', '15', 'img/41.jpg', '三辰书屋', null, '566', '教育');
INSERT INTO `books` VALUES ('42', 'GRE 词汇精选', '26', 'img/42.jpg', '文墨居', null, '156', '教育');
INSERT INTO `books` VALUES ('43', '英语四级词汇必备', '24', 'img/43.jpg', '书天堂', null, '156', '教育');
INSERT INTO `books` VALUES ('44', '读故事记单词', '35', 'img/44.jpg', '弘一书屋', null, '156', '教育');
INSERT INTO `books` VALUES ('45', '单词速记词汇表', '36', 'img/45.jpg', '松竹斋', null, '135', '教育');
INSERT INTO `books` VALUES ('46', '建筑电工技术一点通', '15', 'img/46.jpg', '书天堂', null, '85', '建筑');
INSERT INTO `books` VALUES ('47', '建筑设计案例实践', '13', 'img/47.jpg', '瀚竹轩', null, '165', '建筑');
INSERT INTO `books` VALUES ('48', '村镇建设', '16', 'img/48.jpg', '弘一书屋', null, '86', '建筑');
INSERT INTO `books` VALUES ('49', '建筑防水', '35', 'img/49.jpg', '三辰书屋', null, '165', '建筑');
INSERT INTO `books` VALUES ('50', '建筑安全工程', '25', 'img/50.jpg', '弘一书屋', null, '98', '建筑');
INSERT INTO `books` VALUES ('51', '绿色建筑', '45', 'img/51.jpg', '文墨居', null, '65', '建筑');
INSERT INTO `books` VALUES ('52', '最新延世韩国语', '68', 'img/52.jpg', '松竹斋', null, '89', '教育');
INSERT INTO `books` VALUES ('53', '实用商务韩国语', '32', 'img/53.jpg', '弘一书屋', null, '658', '教育');
INSERT INTO `books` VALUES ('54', '学韩语就这么简答', '85', 'img/54.jpg', '文墨居', null, '165', '教育');
INSERT INTO `books` VALUES ('55', '零起点韩语学习', '32', 'img/55.jpg', '弘一书屋', null, '89', '教育');
INSERT INTO `books` VALUES ('56', '病毒纪元', '85', 'img/56.jpg', '瀚竹轩', null, '156', '科技');
INSERT INTO `books` VALUES ('57', '世界未解之谜', '32', 'img/57.jpg', '松竹斋', null, '78', '科技');
INSERT INTO `books` VALUES ('58', '安德的游戏', '85', 'img/58.jpg', '文墨居', null, '89', '科技');
INSERT INTO `books` VALUES ('59', '太空帝国', '32', 'img/59.jpg', '三辰书屋', null, '65', '科技');
INSERT INTO `books` VALUES ('60', '零度青春', '82', 'img/60.jpg', '书天堂', null, '98', '青春');
INSERT INTO `books` VALUES ('61', '青春物语', '32', 'img/61.jpg', '松竹斋', null, '465', '青春');
INSERT INTO `books` VALUES ('62', '耍恶魔的小妮子', '65', 'img/62.jpg', '弘一书屋', null, '98', '青春');
INSERT INTO `books` VALUES ('63', '从笨爸爸到好爸爸', '12', 'img/63.jpg', '文墨居', null, '56', '育儿');
INSERT INTO `books` VALUES ('64', '青春如狂', '45', 'img/64.jpg', '书天堂', null, '489', '青春');
INSERT INTO `books` VALUES ('65', '谁的青春不迷茫', '65', 'img/65.jpg', '瀚竹轩', null, '65', '青春');
INSERT INTO `books` VALUES ('66', '心灵鸡汤智慧全集', '62', 'img/66.jpg', '三辰书屋', null, '65', '青春');
INSERT INTO `books` VALUES ('67', '青春', '52', 'img/67.jpg', '松竹斋', null, '132', '青春');
INSERT INTO `books` VALUES ('68', '对自己狠一点', '23', 'img/68.jpg', '文墨居', null, '896', '青春');
INSERT INTO `books` VALUES ('69', '励志书', '56', 'img/69.jpg', '三辰书屋', null, '456', '青春');
INSERT INTO `books` VALUES ('70', '野心比信心更重要', '23', 'img/70.jpg', '书天堂', null, '89', '青春');
INSERT INTO `books` VALUES ('71', '生活因拼搏而精彩', '66', 'img/71.jpg', '松竹斋', null, '165', '青春');
INSERT INTO `books` VALUES ('72', '卡耐基写给少年的励志书', '21', 'img/72.jpg', '文墨居', null, '89', '青春');
INSERT INTO `books` VALUES ('73', '哈佛智慧', '32', 'img/73.jpg', '瀚竹轩', null, '65', '青春');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` char(44) NOT NULL,
  `user_account` char(44) NOT NULL,
  `telephone` char(44) NOT NULL,
  `user_address` char(44) NOT NULL,
  `user_postcode` char(44) NOT NULL,
  `book_number` varchar(44) NOT NULL,
  `book_id` varchar(44) NOT NULL,
  `book_name` varchar(33) NOT NULL,
  PRIMARY KEY  (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `shopcar`
-- ----------------------------
DROP TABLE IF EXISTS `shopcar`;
CREATE TABLE `shopcar` (
  `account` char(50) NOT NULL,
  `book_id` char(41) NOT NULL,
  `book_picture` char(55) NOT NULL,
  `book_price` char(41) NOT NULL,
  `book_number` char(41) NOT NULL,
  `book_name` char(50) NOT NULL,
  PRIMARY KEY  (`book_id`,`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopcar
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_account` char(20) NOT NULL,
  `user_password` char(20) NOT NULL,
  PRIMARY KEY  (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('admin', '123');
INSERT INTO `users` VALUES ('li', '123');
INSERT INTO `users` VALUES ('yang', '123');
INSERT INTO `users` VALUES ('zhang', '123');
