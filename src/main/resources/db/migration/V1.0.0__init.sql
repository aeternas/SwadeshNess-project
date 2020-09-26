CREATE TABLE language_family(
     id SERIAL PRIMARY KEY NOT NULL,
     version integer DEFAULT 1,
     name VARCHAR(20) UNIQUE
);

CREATE TABLE language(
     id SERIAL PRIMARY KEY NOT NULL,
     version integer DEFAULT 1,
     name VARCHAR(20),
     family_id integer REFERENCES language_family(id)
);

INSERT INTO language_family(name) VALUES('Slavic');

INSERT INTO language(name, family_id) SELECT 'Russian', id FROM language_family WHERE language_family.name = 'Slavic';