DROP TABLE lightsabers;


-- delete pre-exist tables:
DROP TABLE characters;

CREATE TABLE characters(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

create table lightsabers(
  id SERIAL PRIMARY KEY,
  hilt_metal VARCHAR(255) NOT NULL,
  colour VARCHAR(255) NOT NULL,
  character_id INT REFERENCES characters(id)
);


-- insert data
INSERT INTO characters (name, darkside, age)
VALUES ('Obi-Wan-Kenobi', false, 27);

INSERT INTO characters (name, darkside, age)
VALUES ('Anakin Skywalker', false, 19);

INSERT INTO characters (name, darkside, age)
VALUES ('Darth Maul', true, 32);

-- will insert mnull for missed column value - age in this case
INSERT INTO characters(name, darkside)
VALUES ('Yoda', false);

INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('green', 'palladium', 1);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('red', 'gold', 2);

insert into lightsabers (colour, hilt_metal, character_id) values ('purple', 'titanium', 2);

SELECT * FROM lightsabers where character_id = 2;



-- -- grab all records from table characters: R in CRUD. Grab information.
--
-- SELECT * FROM characters;
-- SELECT name FROM characters;
--
-- -- count all records
-- SELECT COUNT(*) FROM characters;
-- -- in terminal: -d database, -f insert file.
-- -- psql -d star_wars -f star_wars.sql
--
-- -- double quotes are reserved for system operations!
--
--
-- -- Updating info
-- UPDATE characters SET darkside = true;
-- UPDATE characters SET darkside = true WHERE name = 'Anakin Skywalker';
--
-- SELECT * FROM characters;
--
-- -- upd many columns
-- UPDATE characters SET (name, darkside) = ('Darth Vader', true)
-- WHERE name = 'Anakin Skywalker';
--
-- SELECT * FROM characters;
--
-- -- creating data again:
--
-- INSERT INTO characters(name, darkside, age)
-- VALUES ('Luke Skywalker', false, 17);
--
-- -- if changing only one column, no paretheses
-- UPDATE characters SET age = 27
-- WHERE name = 'Luke Skywalker';
--
-- SELECT * FROM characters;
--
-- -- Deleting: there is no undo once u delete!
-- DELETE FROM characters WHERE name = 'Darth Maul';
-- SELECT * FROM characters;
--
--
-- INSERT INTO characters (name, darkside, age)
-- VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age)
-- VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age)
-- VALUES ('Stormtrooper', true, 25);
-- INSERT INTO characters (name, darkside, age)
-- VALUES ('Stormtrooper', true, 25);
--
-- SELECT * FROM characters;
--
-- UPDATE characters SET age = 26 WHERE id = 8;
-- SELECT * FROM characters;
