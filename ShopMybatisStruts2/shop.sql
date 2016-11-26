/*
Navicat MySQL Data Transfer

Source Server         : Orchid
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-11-26 15:14:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` int(11) NOT NULL auto_increment COMMENT 'Ö÷¼ü',
  `price` double(20,0) default NULL COMMENT 'µ±Ç°¼Û¸ñ',
  `title` varchar(100) default NULL COMMENT '±êÌâ',
  `icon` varchar(100) default NULL COMMENT 'Í¼Æ¬',
  `abstract` varchar(200) default NULL COMMENT 'ÕªÒª',
  `text` varchar(200) default NULL COMMENT 'ÕýÎÄ',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES ('1', '123', '123', 'img/1.jpg', '123', '123');
INSERT INTO `content` VALUES ('2', '123', '123', 'img/2.jpg', '123', '123');
INSERT INTO `content` VALUES ('3', '123', '123', 'img/3.jpg', '123', '123');
INSERT INTO `content` VALUES ('6', '123', '123', 'img/4.jpg', '123', '123');
INSERT INTO `content` VALUES ('7', '123', '123', 'img/5.jpg', '123', '123');
INSERT INTO `content` VALUES ('8', '132', '123', 'img/6.jpg', '123', '123');
INSERT INTO `content` VALUES ('9', '123', '123', 'img/7.jpg', '123', '123');
INSERT INTO `content` VALUES ('10', '123', '123', 'img/8.jpg', '123', '123');

-- ----------------------------
-- Table structure for person
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
-- Table structure for trx
-- ----------------------------
DROP TABLE IF EXISTS `trx`;
CREATE TABLE `trx` (
  `id` int(11) NOT NULL auto_increment COMMENT 'Ö÷¼ü',
  `contentId` int(11) default NULL COMMENT 'ÄÚÈÝID',
  `personId` int(11) default NULL COMMENT 'ÓÃ»§ID',
  `price` double(11,0) default NULL COMMENT '¹ºÂò¼Û¸ñ',
  `time` date default NULL COMMENT '¹ºÂòÊ±¼ä',
  PRIMARY KEY  (`id`),
  KEY `contentId` (`contentId`),
  CONSTRAINT `contentId` FOREIGN KEY (`contentId`) REFERENCES `content` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trx
-- ----------------------------
INSERT INTO `trx` VALUES ('1', '3', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('2', '1', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('3', '10', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('4', '3', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('5', '10', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('6', '2', '0', '123', '2016-11-25');
INSERT INTO `trx` VALUES ('8', '2', '0', '123', '2016-11-25');
