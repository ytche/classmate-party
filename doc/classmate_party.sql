/*
 Navicat MySQL Data Transfer

 Source Server         : classmate_party
 Source Server Version : 50638
 Source Host           : localhost
 Source Database       : classmate_party

 Target Server Version : 50638
 File Encoding         : utf-8

 Date: 04/12/2018 15:28:52 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `base_activity`
-- ----------------------------
DROP TABLE IF EXISTS `base_activity`;
CREATE TABLE `base_activity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `held_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `description` varchar(2000) NOT NULL,
  `submit_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_count` tinyint(1) unsigned NOT NULL,
  `off_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `is_held` tinyint(1) unsigned NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` bigint(20) NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_activity_advice`
-- ----------------------------
DROP TABLE IF EXISTS `base_activity_advice`;
CREATE TABLE `base_activity_advice` (
  `id` bigint(20) NOT NULL,
  `type` int(10) NOT NULL DEFAULT '0' COMMENT '0聚餐1户外2轰趴3文娱',
  `description` varchar(1000) NOT NULL,
  `reason` varchar(500) NOT NULL,
  `min_budget` int(10) NOT NULL,
  `max_budget` int(10) NOT NULL,
  `is_using` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0否1是',
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_activity_step`
-- ----------------------------
DROP TABLE IF EXISTS `base_activity_step`;
CREATE TABLE `base_activity_step` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `orgenazer_id` bigint(20) NOT NULL,
  `advice_id` bigint(20) NOT NULL,
  `place` varchar(100) NOT NULL,
  `min_budget` int(10) NOT NULL,
  `max_budget` int(10) NOT NULL,
  `description` varchar(200) NOT NULL,
  `start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_dorm`
-- ----------------------------
DROP TABLE IF EXISTS `base_dorm`;
CREATE TABLE `base_dorm` (
  `id` bigint(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `gender` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0男1女',
  `manage_user_id` bigint(20) NOT NULL,
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_permission`
-- ----------------------------
DROP TABLE IF EXISTS `base_permission`;
CREATE TABLE `base_permission` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `url` varchar(200) NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_user`
-- ----------------------------
DROP TABLE IF EXISTS `base_user`;
CREATE TABLE `base_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0否1是',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` bigint(20) NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `base_user`
-- ----------------------------
BEGIN;
INSERT INTO `base_user` VALUES ('1', 'test', '111111', '1', '2018-03-07 17:58:55', '1', '2018-03-07 17:58:55');
COMMIT;

-- ----------------------------
--  Table structure for `base_user_group`
-- ----------------------------
DROP TABLE IF EXISTS `base_user_group`;
CREATE TABLE `base_user_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_udpate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `base_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `base_user_info`;
CREATE TABLE `base_user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `real_name` varchar(50) NOT NULL,
  `gender` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '0男1女',
  `mobile` bigint(20) NOT NULL,
  `qq` bigint(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `birthday` date DEFAULT NULL,
  `id_num` varchar(20) DEFAULT NULL,
  `dorm_id` bigint(20) DEFAULT NULL,
  `create_user_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `rel_group_user`
-- ----------------------------
DROP TABLE IF EXISTS `rel_group_user`;
CREATE TABLE `rel_group_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `group_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `rel_user_activity`
-- ----------------------------
DROP TABLE IF EXISTS `rel_user_activity`;
CREATE TABLE `rel_user_activity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `activity_id` bigint(20) NOT NULL,
  `is_orgenizer` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
