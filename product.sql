/*
Navicat MySQL Data Transfer

Source Server         : testxx
Source Server Version : 50721
Source Host           : xx:3306
Source Database       : cep_test

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-11-24 16:21:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `product_name` varchar(64) DEFAULT NULL COMMENT '产品名称',
  `sell_price` decimal(10,2) DEFAULT NULL COMMENT '产品价格',
  `sub_title` varchar(64) DEFAULT NULL COMMENT '副标题',
  `detail` varchar(64) DEFAULT NULL COMMENT '详情',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(64) DEFAULT NULL COMMENT '创建用户',
  `update_user` varchar(64) DEFAULT NULL COMMENT '更新用户',
  `valid` tinyint(1) DEFAULT '1' COMMENT '是否有效,1为有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='产品表';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '名称1', '26.60', '副标题', '详情', null, null, null, null, '1');
INSERT INTO `product` VALUES ('2', '名称2', '66.99', '副标题2', '详情2', null, null, null, null, '1');
