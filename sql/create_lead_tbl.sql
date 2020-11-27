CREATE TYPE user_sts AS ENUM ('LOOKING_FOR_RENTAL','RENTED','DO_NOT_CALL','NOT_INTERESTED','ARCHIVED');
CREATE TABLE lead_tbl (
	id integer not NULL,
	first_name varchar(255),
	last_name varchar(255),
	email varchar(255),
	phone char(12),
	source varchar(255),
	status user_sts,
	created_date TIMESTAMP,
	updated_date TIMESTAMP,
	PRIMARY KEY (id)
);