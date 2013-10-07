
--
-- Structure for table subscribe_subscription
--

DROP TABLE IF EXISTS subscribe_subscription;
CREATE TABLE subscribe_subscription (		
	id_subscription int(11) NOT NULL default '0',
	id_subscriber int(11) NOT NULL default '0',
	subscription_provider varchar(255) NULL ,
	subscription_key varchar(255) NOT NULL default '',
	id_subscribed_resource varchar(255) NOT NULL default '',
	PRIMARY KEY (id_abonnement)
);
