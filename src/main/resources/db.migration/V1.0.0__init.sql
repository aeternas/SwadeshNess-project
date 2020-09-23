CREATE TABLE language(
     id SERIAL PRIMARY KEY NOT NULL,
     version integer,
     name VARCHAR(20)
);

INSERT INTO language(version, name) VALUES('1', 'Russian');