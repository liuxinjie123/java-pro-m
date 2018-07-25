CREATE TABLE `m_admins` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(60) NOT NULL COMMENT '账号',
  `password` VARCHAR(100) NOT NULL COMMENT '密码',
  `name` VARCHAR(60) DEFAULT NULL COMMENT '姓名',
  `number` VARCHAR(30) DEFAULT NULL COMMENT '工号',
  `status` INT(3) NOT NULL COMMENT '状态',
  `mobile` VARCHAR(20) DEFAULT NULL COMMENT '手机号',
  `email` VARCHAR(100) DEFAULT NULL COMMENT '邮箱',
  `role_id` INT(3) NOT NULL COMMENT '角色id',
  `role_name` VARCHAR(30) NOT NULL COMMENT '角色名称',
  `salt` VARCHAR(100) DEFAULT NULL COMMENT '加密盐',
  `create_id` BIGINT(20) NOT NULL COMMENT '创建人userId',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_update_id` BIGINT(20) NOT NULL COMMENT '最后一次更新人userId',
  `last_update_time` TIMESTAMP COMMENT '最后一次更新时间',
  `version` INT(5) DEFAULT NULL COMMENT 'version',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='manager端-管理员表';


CREATE TABLE `m_admins_login_log` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `admin_id` BIGINT(20) NOT NULL COMMENT 'admin id',
  `username` varchar(30) NOT NULL COMMENT '用户登录名',
  `create_id` BIGINT(20) NOT NULL COMMENT '创建人userId',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_update_id` BIGINT(20) NOT NULL COMMENT '最后一次更新人userId',
  `last_update_time` TIMESTAMP COMMENT '最后一次更新时间',
  `version` INT(5) DEFAULT NULL COMMENT 'version',
  PRIMARY KEY (`id`),
  INDEX  idx_user_id (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='manager端-管理员登陆日志表';


CREATE TABLE `m_admins_role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `number` int(10) NOT NULL COMMENT '编号',
  `role` varchar(50) NOT NULL COMMENT '角色',
  `create_id` BIGINT(20) NOT NULL COMMENT '创建人userId',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_update_id` BIGINT(20) NOT NULL COMMENT '最后一次更新人userId',
  `last_update_time` TIMESTAMP COMMENT '最后一次更新时间',
  `version` INT(5) DEFAULT NULL COMMENT 'version',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='manager端-管理员角色表';


CREATE TABLE `t_generate_number` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `create_date` date DEFAULT NULL COMMENT '创建日期',
  `type` varchar(30) DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='生成编号表';


CREATE TABLE `t_dictionary` (
  `id` BIGINT(20) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(50) DEFAULT NULL COMMENT '类型',
  `sequence` int(3) DEFAULT NULL COMMENT '顺序，例如 1 代表 PC，2 代表 微信小程序， 3 代表 安卓等',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `create_id` BIGINT(20) NOT NULL COMMENT '创建人userId',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `last_update_id` BIGINT(20) NOT NULL COMMENT '最后一次更新人userId',
  `last_update_time` TIMESTAMP COMMENT '最后一次更新时间',
  `version` INT(5) DEFAULT NULL COMMENT 'version',
  PRIMARY KEY (`id`),
  INDEX idx_type (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典表';
