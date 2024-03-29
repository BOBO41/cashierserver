

CREATE TABLE `netbar_user` (
  `netbarUserId` int(11) NOT NULL COMMENT '用户ID',
  `account` varchar(30) DEFAULT NULL COMMENT '账号',
  `memberName` varchar(30) DEFAULT NULL COMMENT '用户名',
  `birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `phone` varchar(11) NOT NULL DEFAULT '' COMMENT '电话号码',
  `state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '用户状态',
  `ifAuth` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否授权(1-是；0-否)',
  `ifCashierLogin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '能否登录收银端(1-可以登录；0-不可以登录)',
  `dataVersion` int(11) NOT NULL COMMENT '数据版本',
  `gid` int(11) NOT NULL COMMENT '网吧GID',
  `authoriseCode` varchar(30) DEFAULT NULL COMMENT '授权码（仅限网管和店长）',
  `roleIds` varchar(100) DEFAULT NULL COMMENT '角色ID list',
  `accountLevel` tinyint(1) NOT NULL DEFAULT '1' COMMENT '主从账号(0-主账号；1子账号)',
  PRIMARY KEY (`netbarUserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网吧用户信息';

CREATE TABLE `netbar_duty` (
  `dutyID` int(11) NOT NULL COMMENT '交接班ID',
  `shiftID` int(11) DEFAULT NULL COMMENT '交接班班次ID',
  `currentSum` decimal(10,2) DEFAULT NULL COMMENT '本班总金额',
  `currentCash` decimal(10,2) DEFAULT NULL COMMENT '本班应上交总现金',
  `currentDeliver` decimal(10,2) DEFAULT NULL COMMENT '本班上缴',
  `currentReserve` decimal(10,2) DEFAULT NULL COMMENT '本班预留',
  `dutyDate` date DEFAULT NULL COMMENT '交接班所属日期',
  `dutyBeginTime` datetime DEFAULT NULL COMMENT '交接班开始时间',
  `dutyEndTime` datetime DEFAULT NULL COMMENT '交接班结束时间',
  `state` tinyint(1) DEFAULT NULL COMMENT '交接班状态（0、待确认；1、已确认）',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `generateFrom` tinyint(1) DEFAULT NULL COMMENT '生成渠道（2、网吧收银端；3、微信端；4、云端）',
  `nextShiftID` int(11) DEFAULT NULL COMMENT '接班人班次ID',
  `currentnetBarUserID` int(11) DEFAULT NULL COMMENT '交班人用户ID',
  `nextnetBarUserID` int(11) DEFAULT NULL COMMENT '接班人用户ID',
  `submitTime` datetime DEFAULT NULL COMMENT '交接完成确认时间',
  `totalIncome` decimal(10,2) DEFAULT NULL COMMENT '本班总收入',
  `totalConsume` decimal(10,2) DEFAULT NULL COMMENT '用户总消费',
  `totalAttendance` decimal(4,2) DEFAULT NULL COMMENT '整体上座率',
  `goodsTotalIncome` decimal(10,2) DEFAULT NULL COMMENT '商超总收入（含水吧）',
  `newMemberNum` int(11) DEFAULT NULL COMMENT '新增人数',
  `turnOverRatio` decimal(6,2) DEFAULT NULL COMMENT '翻机率',
  `onlineTimes` int(11) DEFAULT NULL COMMENT '上机总次数',
  `onlineMembers` int(11) DEFAULT NULL COMMENT '上网人数',
  `internetTimes` int(11) DEFAULT NULL COMMENT '上机时长(秒)',
  `adwardTotal` decimal(10,2) DEFAULT NULL COMMENT '充值赠送金额',
  `couponDeduction` decimal(10,2) DEFAULT NULL COMMENT '优惠券使用金额',
  `shiftName` varchar(30) DEFAULT NULL COMMENT '交班班次名称',
  `currentName` varchar(30) DEFAULT NULL COMMENT '交班人姓名',
  `nextShiftName` varchar(30) DEFAULT NULL COMMENT '接班班次名称',
  `nextName` varchar(30) DEFAULT NULL COMMENT '接班人姓名',
  PRIMARY KEY (`dutyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交接班记录';

CREATE TABLE `netbar_recharge_compaign` (
  `rechargeCompaignID` int(11) NOT NULL COMMENT '充值活动ID',
  `memberType` int(1) NOT NULL COMMENT '会员类型（1、临时卡；2、工作人员；3-青铜会员、4-白银会员、5-黄金会员、6-白金会员、7-钻石会员)',
  `rechargeFee` int(11) NOT NULL COMMENT '机器id',
  `additionalFee` int(11) DEFAULT NULL COMMENT '赠送金额',
  `state` tinyint(1) DEFAULT NULL COMMENT '状态（1、有效；0、无效）',
  `beginDate` datetime DEFAULT NULL COMMENT '有效开始日期',
  `endDate` datetime DEFAULT NULL COMMENT '有效结束日期',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  PRIMARY KEY (`rechargeCompaignID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='充值活动信息';

CREATE TABLE `netbar_recharge_order` (
  `rechargeOrderID` bigint(30) unsigned NOT NULL COMMENT '充值订单id',
  `rechargeCompaignID` int(11) DEFAULT NULL COMMENT '充值活动ID',
  `account` varchar(30) DEFAULT NULL COMMENT '网吧会员',
  `rechargeWay` int(11) DEFAULT NULL COMMENT '充值方式（1、现金,2、微信,3、支付bao）',
  `rechargeType` int(11) DEFAULT NULL COMMENT '充值类型（1、账户充值；2、押金充值）',
  `deposit` int DEFAULT NULL COMMENT '押金',
  `rechargeFee` int DEFAULT '0.00' COMMENT '充值金额',
  `adwardFee` int DEFAULT '0.00' COMMENT '赠送金额',
  `state` tinyint(1) DEFAULT NULL COMMENT '状态（1、待付款；2、已付款待处理；3、已成功；4、已退款；5、已作废；6、已充正）',
  `posAccount` int(11) DEFAULT NULL COMMENT '收银员账号',
  `rechargeDate` datetime DEFAULT NULL COMMENT '充值创建日期',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `rechargeSource` int(11) DEFAULT NULL COMMENT '充值来源（1、网吧客户端；2、网吧收银端；3、手机端）',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `lastUpdateDate` datetime DEFAULT NULL COMMENT '最后更新时间',
  `oldRechargeOrderID` bigint(30) DEFAULT NULL COMMENT '原充值订单ID',
  PRIMARY KEY (`rechargeOrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='充值订单';


CREATE TABLE `netbar_online` (
  `onlineID` bigint(22) NOT NULL AUTO_INCREMENT COMMENT '上机id',
  `tariffConfigID` int(11) DEFAULT NULL COMMENT '网吧费率ID',
  `memberID` bigint(20) unsigned DEFAULT NULL COMMENT '会员ID',
  `onlineRoomID` bigint(20) unsigned DEFAULT NULL COMMENT '包房开卡id',
  `machineID` int(11) DEFAULT NULL COMMENT '开卡上机机器id',
  `areaID` int(11) DEFAULT '0' COMMENT '开卡上机区域ID',
  `memberType` tinyint(1) DEFAULT NULL COMMENT '开卡上机会员类型',
  `ruleID` int(11) DEFAULT NULL COMMENT '开卡上机时费率规则ID',
  `tariffType` tinyint(1) DEFAULT NULL COMMENT '开卡上机时费率类型(1-标准计费，2-包时段，3-包时长，4-包间标准，5-包间包时段，6-包间包时长,)）',
  `ifRoomOwner` tinyint(1) DEFAULT NULL COMMENT '是否包间主卡（1、是；0、否； 非包房默认为2 无效）',
  `startUser` int(11) DEFAULT NULL COMMENT '开卡人',
  `startCardTime` datetime DEFAULT NULL COMMENT '开卡时间',
  `onlineStartTime` datetime DEFAULT NULL COMMENT '上机时间',
  `offLineTime` datetime DEFAULT NULL COMMENT '下机时间',
  `internetTime` decimal(10,2) DEFAULT '0.00' COMMENT '上网时长',
  `onlineFee` decimal(6,2) DEFAULT '0.00' COMMENT '上网消费金额',
  `state` tinyint(1) DEFAULT NULL COMMENT '状态（1、上机中；2、已结账下线;3、开卡）',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `theDate` date DEFAULT NULL COMMENT '所在日期',
  `deposit` decimal(8,2) DEFAULT NULL COMMENT '押金扣除金额',
  `baseBalance` decimal(8,2) DEFAULT NULL COMMENT '基本账户扣除金额',
  `awardBalance` decimal(8,2) DEFAULT NULL COMMENT '赠送金扣除金额',
  `couponDeduction` decimal(6,2) DEFAULT '0.00' COMMENT '优惠券抵扣金额',
  `depositState` tinyint(1) DEFAULT '2' COMMENT '押金状态（1、已退还；0、未退；非押金上网默认为2无效）',
  `awardReserve` decimal(8,2) DEFAULT NULL COMMENT '赠送金余额（结账时写入）',
  `baseReserve` decimal(8,2) DEFAULT NULL COMMENT '本金余额（结账时写入）',
  `payWay` tinyint(1) DEFAULT NULL COMMENT '支付方式(1、微信；2、银行卡；3、支付宝；4、现金；5、账户支付；)',
  `endWay` tinyint(1) DEFAULT NULL COMMENT '结账方式（1、自动结账；2、人工结账；3、换机结账）',
  `actorUser` int(11) DEFAULT NULL COMMENT '结账人',
  `actTime` datetime DEFAULT NULL COMMENT '结账时间',
  `authoriseUser` int(11) DEFAULT NULL COMMENT '集体结账授权人',
  `tariffDataVersion` int(11) DEFAULT NULL COMMENT '费率版本号',
  `areaName` varchar(30) DEFAULT NULL COMMENT '区域名称',
  `machineName` varchar(30) DEFAULT NULL COMMENT '机器名称',
  PRIMARY KEY (`onlineID`),
  KEY `idx_memberID` (`memberID`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='（网费在网页触发时刷新，结账时刷新）';

CREATE TABLE `netbar_membertype` (
  `memberTypePlanID` int(11) NOT NULL COMMENT '方案ID',
  `memberTypeID` int(11) NOT NULL COMMENT '会员类型ID',
  `parasTypeName` varchar(30) NOT NULL COMMENT '类型名称',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `theOrder` int(11) DEFAULT NULL COMMENT '排序'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员类型管理';

CREATE TABLE `netbar_member` (
  `account` varchar(50) DEFAULT NULL COMMENT '账号',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `userId` int(11) DEFAULT '0' COMMENT '盛天用户id',
  `memberName` varchar(30) NOT NULL COMMENT '会员姓名',
  `birthday` datetime DEFAULT NULL COMMENT '出生年月',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别（0 女 1男）',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `qq` varchar(30) DEFAULT NULL COMMENT 'qq号码',
  `openID` varchar(40) DEFAULT NULL COMMENT '微信openID',
  `identifyPath` varchar(400) DEFAULT NULL COMMENT '图像',
  `memberType` tinyint(1) NOT NULL COMMENT '会员类型（1、临时卡；2、工作人员；3-青铜会员、4-白银会员、5-黄金会员、6-白金会员、7-钻石会员)',
  `state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '会员状态（1、正常；0、终止）',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `lastUpdate` int(11) DEFAULT NULL COMMENT '最后更新人',
  `lastUpdateDate` datetime DEFAULT NULL COMMENT '最后更新时间',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `dataVersion` int(11) DEFAULT '1' COMMENT '数据版本',
  `certificateType` tinyint(1) DEFAULT '1' COMMENT '证件类型(1、身份证（默认）；2、军官证)',
  `certificateNum` varchar(20) DEFAULT NULL COMMENT '证件号码',
  `proviceID` tinyint(2) DEFAULT NULL COMMENT '所在省',
  `cityID` int(11) DEFAULT NULL COMMENT '所在市',
  `districtID` int(11) DEFAULT NULL COMMENT '所在区',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `ifBindingWX` tinyint(1) DEFAULT NULL COMMENT '是否绑定微信',
  `cashbalance` int(11) default 0,
  `basebalance` int(11) default 0,
  `awardbalance` int(11) default 0,
  UNIQUE KEY `uidx_account` (`account`),
  UNIQUE KEY `uidx_phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网吧会员信息表';

CREATE TABLE `netbar_machine` (
  `machineID` int(11) NOT NULL AUTO_INCREMENT COMMENT '机器ID',
  `machineName` varchar(30) DEFAULT NULL COMMENT '机器名称',
  `areaId` int(11) DEFAULT NULL COMMENT '区域ID',
  `state` tinyint(1) DEFAULT NULL COMMENT '状态（1、正常；0、废弃）',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `mac` varchar(20) DEFAULT NULL COMMENT '机器mac',
  `ip` varchar(30) DEFAULT NULL COMMENT 'ip',
  `ipMask` varchar(30) DEFAULT NULL COMMENT '子网掩码',
  `createDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `lastUpdateDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`machineID`),
  UNIQUE KEY `uidx_machineName_gid` (`machineName`,`gid`),
  KEY `uidx_machineName` (`machineName`)
) ENGINE=InnoDB AUTO_INCREMENT=1057 DEFAULT CHARSET=utf8 COMMENT='网吧机器管理';

CREATE TABLE `netbar_area` (
  `areaID` int(11) NOT NULL COMMENT '区域ID',
  `areaName` varchar(30) NOT NULL COMMENT '机器id',
  `areaType` tinyint(1) DEFAULT NULL COMMENT '区域类型',
  `num` int(11) DEFAULT NULL COMMENT '机器数量',
  `ifRoom` tinyint(1) DEFAULT NULL COMMENT '是否包间',
  `description` varchar(50) DEFAULT NULL COMMENT '区域描述',
  `state` tinyint(1) DEFAULT NULL COMMENT '状态（0、正常；-1、已删除）',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `memberTypeList` varchar(1000) DEFAULT NULL COMMENT '允许会员类型列表',
  `gid` int(11) NOT NULL COMMENT '网吧GID',
  PRIMARY KEY (`areaID`,`gid`),
  UNIQUE KEY `uidx_areaName_gid` (`areaName`,`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网吧区域管理';

CREATE TABLE `netbar_baseinfo` (
  `gid` int(11) NOT NULL COMMENT '网吧GID',
  `netBarName` int(11) NOT NULL COMMENT '机器id',
  `ifChain` tinyint(1) DEFAULT NULL COMMENT '是否连锁网吧',
  `tid` int(11) DEFAULT NULL COMMENT '连锁网吧TID',
  `proviceID` tinyint(2) DEFAULT NULL COMMENT '所在省',
  `cityID` int(11) DEFAULT NULL COMMENT '所在市',
  `districtID` int(11) DEFAULT NULL COMMENT '所在区',
  `address` varchar(100) DEFAULT NULL COMMENT '地址',
  `pcNum` int(11) DEFAULT NULL COMMENT 'PC数',
  `principal` varchar(30) DEFAULT NULL COMMENT '负责人',
  `thePhone` varchar(20) DEFAULT NULL COMMENT '营业电话',
  `setupTime` datetime DEFAULT NULL COMMENT '成立时间',
  `dataVersion` int(11) DEFAULT NULL COMMENT '数据版本',
  `lat` decimal(10,7) DEFAULT NULL COMMENT '经度',
  `lng` decimal(10,7) DEFAULT NULL COMMENT '维度',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网吧基本信息';

CREATE TABLE `netbar_billing` (
  `billingID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '计费ID',
  `gid` int(11) DEFAULT NULL COMMENT '网吧GID',
  `tariffConfigID` int(11) DEFAULT NULL COMMENT '网吧费率ID',
  `ruleID` int(11) DEFAULT NULL COMMENT '计费规则ID',
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `theDate` date DEFAULT NULL COMMENT '所在日期',
  `tariffDataVersion` int(11) DEFAULT NULL COMMENT '费率版本号',
  `tariffType` tinyint(1) DEFAULT NULL COMMENT '费率类型(1-标准计费，2-包时段，3-包时长，4-包间标准，5-包间包时段，6-包间包时长,)）',
  `ratioCostBase` tinyint(1) DEFAULT NULL COMMENT '本金扣费占比(数字5代表5:5；数字3代表3:7)',
  `ratioCostAward` tinyint(1) DEFAULT NULL COMMENT '充送扣费占比(数字5代表5:5；数字3代表3:7)',
  `discount` decimal(4,2) DEFAULT NULL COMMENT '折扣',
  `periodStartTime` decimal(3,1) DEFAULT NULL COMMENT '包时段起始时间',
  `periodEndTime` decimal(3,1) DEFAULT NULL COMMENT '包时段结束时间',
  `lastCostTimestamp` timestamp(6) NULL DEFAULT NULL COMMENT '上次扣费时间',
  `nextCostTimestamp` timestamp(6) NULL DEFAULT NULL COMMENT '下次扣费时间',
  `maxEndTimestamp` timestamp(6) NULL DEFAULT NULL COMMENT '最大可上机时间',
  `currentCostBase` decimal(6,2) DEFAULT NULL COMMENT '当前本金扣费金额',
  `currentCostAward` decimal(6,2) DEFAULT NULL COMMENT '当前充送扣费金额',
  `currentCostTemp` decimal(6,2) DEFAULT NULL COMMENT '当前临时账户扣费金额',
  `allHadCost` decimal(6,2) DEFAULT NULL COMMENT '本次上机累积扣费总额',
  `ignoreTime` int(11) DEFAULT NULL COMMENT '忽略时间',
  `startPrice` decimal(6,2) DEFAULT NULL COMMENT '起步价',
  `hourPrice` decimal(6,2) DEFAULT NULL COMMENT '标准单价',
  `wholeTimestamp` int(11) DEFAULT NULL COMMENT '整点标记',
  `startCost` decimal(6,2) DEFAULT NULL COMMENT '已扣起步价',
  `checkStart` tinyint(1) DEFAULT NULL COMMENT '是否检查已扣起步价',
  `periodOrder` tinyint(1) DEFAULT NULL COMMENT '是否预约包时，缺省 FALSE',
  `memberID` bigint(20) unsigned DEFAULT NULL COMMENT '会员ID',
  `roomOwner` tinyint(1) DEFAULT NULL COMMENT '是否是包房主扣卡用户',
  `additionalFee` decimal(6,2) DEFAULT NULL COMMENT '附加费',
  `onlineID` bigint(20) unsigned DEFAULT NULL COMMENT '上机id',
  PRIMARY KEY (`billingID`)
) ENGINE=InnoDB AUTO_INCREMENT=306 DEFAULT CHARSET=utf8 COMMENT='（按日分表，保留最近15天数据。网费扣费则新增）';

create table netbar_weekprice (
	id int(11) auto_increment,
	gid int(11) default 0,
	areaid int(11) default 0,
	typeid int(11) default 0,
	ignoretime int(11) default 0,
	startprice float default 0,
	mincostprice float default 1,
	reservd int(11) default 0,
	price varchar(600),
	primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;\

CREATE TABLE `netbar_durationprice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL COMMENT '网咖id',
  `regionid` int(11) NOT NULL COMMENT '区域类型',
  `typeid` int(11) NOT NULL COMMENT '会员类型',
  `durationtime` int(11) NOT NULL COMMENT '包时长长度，单位秒',
  `validbegintimestamp` float default 0 COMMENT '使用开始有效时间',
  `validendtimestamp` float default 0 COMMENT '使用有效结束时间',
  `price` float NOT NULL COMMENT '包时长价格',
  `roomtype` int(11) NOT NULL DEFAULT '0' COMMENT '是否是房间',
  `deleteflag` int(8) DEFAULT '0',
  `isdurationname` int(2) DEFAULT '0' COMMENT '是否开启自定义名称 0:关闭;1开启',
  `durationname` varchar(50) DEFAULT NULL COMMENT '包时长名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `netbar_periodprice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL COMMENT '网咖id',
  `regionid` int(11) NOT NULL COMMENT '区域类型',
  `typeid` int(11) NOT NULL COMMENT '会员类型',
  `starttime` float NOT NULL COMMENT '包时段开始时间',
  `endtime` float NOT NULL COMMENT '包时段结束时间',
  `price` float NOT NULL COMMENT '包时段价格',
  `deleteflag` int(8) DEFAULT '0',
  `isroom` int(8) DEFAULT '0',
  `isperiodname` int(2) DEFAULT '0' COMMENT '是否开启自定义名称 0:关闭;1开启',
  `periodname` varchar(50) DEFAULT NULL COMMENT '包时段名称',
  `byType` tinyint(1) DEFAULT '1' COMMENT '是否开启包夜模式（1、未启用；2、启用）',
  `ifClientUse` tinyint(1) DEFAULT '0' COMMENT '是否允许客户端使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `netbar_extracost` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL COMMENT '网咖id',
  `regionid` int(11) NOT NULL COMMENT '区域id',
  `typeid` int(11) NOT NULL COMMENT '会员类型',
  `price` float NOT NULL COMMENT '附加费价格',
  `roomtype` int(8) NOT NULL DEFAULT '0' COMMENT '是否为包房',
  `deleteflag` int(8) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4;