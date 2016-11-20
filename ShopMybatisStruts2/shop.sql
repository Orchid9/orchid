/*
Navicat MySQL Data Transfer

Source Server         : Orchid
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-11-20 13:59:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `content`
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(11) NOT NULL auto_increment COMMENT 'Ö÷¼ü',
  `price` varchar(20) default NULL COMMENT 'µ±Ç°¼Û¸ñ',
  `title` varchar(100) default '' COMMENT '±êÌâ',
  `icon` varchar(100) NOT NULL default '' COMMENT 'Í¼Æ¬',
  `abstract` varchar(200) default NULL COMMENT 'ÕªÒª',
  `text` varchar(200) default NULL COMMENT 'ÕýÎÄ',
  PRIMARY KEY  (`id`,`icon`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES ('1', '123.9', '标题', 'http://nec.netease.com/img/s/1.jpg', '摘要', '全文');

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL auto_increment COMMENT 'Ö÷¼ü',
  `userName` varchar(100) default NULL COMMENT 'ÓÃ»§Ãû',
  `password` varchar(100) default NULL COMMENT 'ÃÜÂëmd5¼ÓÃÜ',
  `nickName` varchar(50) default NULL COMMENT 'ÓÃ»§êÇ³Æ',
  `userType` tinyint(3) default NULL COMMENT 'ÀàÐÍ£¬Âò¼Ò0£¬Âô¼Ò1',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'buyer', 'buyer', 'buyer', '0');
INSERT INTO `person` VALUES ('2', 'seller', 'seller', 'seller', '1');

-- ----------------------------
-- Table structure for `trx`
-- ----------------------------
DROP TABLE IF EXISTS `trx`;
CREATE TABLE `trx` (
  `id` int(11) NOT NULL auto_increment COMMENT 'Ö÷¼ü',
  `contentId` int(11) default NULL COMMENT 'ÄÚÈÝID',
  `personId` int(11) default NULL COMMENT 'ÓÃ»§ID',
  `price` int(11) default NULL COMMENT '¹ºÂò¼Û¸ñ',
  `time` bigint(20) default NULL COMMENT '¹ºÂòÊ±¼ä',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trx
-- ----------------------------
