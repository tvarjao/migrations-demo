CREATE TABLE tb_profession (
	id int8 NOT NULL,
	name varchar(500) NOT NULL,
	CONSTRAINT profession_pkey PRIMARY KEY (id)
);

ALTER TABLE tb_user ADD COLUMN profession int8;

INSERT INTO tb_profession values (1, 'Developer');
INSERT INTO tb_profession values (2, 'QA');
INSERT INTO tb_profession values (3, 'Manager');

UPDATE tb_user SET profession = 2;