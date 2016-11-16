/*
Navicat MySQL Data Transfer

Source Server         : Orchid
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : cloud_study

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-11-16 21:56:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL auto_increment,
  `courseName` varchar(100) default NULL,
  `teacher_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `teacher_id` (`teacher_id`),
  CONSTRAINT `t_id` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', 'Java', '2');
INSERT INTO `course` VALUES ('2', 'Hadoop', '1');
INSERT INTO `course` VALUES ('3', 'Spare', '1');
INSERT INTO `course` VALUES ('4', 'Hbase', '1');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL auto_increment,
  `teacherName` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '房');
INSERT INTO `teacher` VALUES ('2', '张');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(100) NOT NULL,
  `corp` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '萌', '123');
INSERT INTO `user` VALUES ('2', '妹', '123');
INSERT INTO `user` VALUES ('3', '子', '123');
INSERT INTO `user` VALUES ('4', '是', '123');

-- ----------------------------
-- Table structure for `usercourse`
-- ----------------------------
DROP TABLE IF EXISTS `usercourse`;
CREATE TABLE `usercourse` (
  `id` int(11) NOT NULL auto_increment,
  `user_id` int(11) default NULL,
  `course_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `user_id` (`user_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usercourse
-- ----------------------------
INSERT INTO `usercourse` VALUES ('4', '1', '1');
