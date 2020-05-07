-- psql -d forest_aj -f forest.sql to be run through terminal to call this file.
DROP TABLE forest_scdb;
DROP TABLE tree_prices;

create table forest_scdb (
	-- BIGSERIAL will add number in a sequence so we dont need to to dhat on inserts
  id BIGSERIAL NOT NULL PRIMARY KEY,
	species VARCHAR(150),
	area_ha FLOAT NOT NULL,
  contract VARCHAR(255),
	type VARCHAR(50)
);

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('SS', 10.00, 'CON', 'prod. conifer');

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('SS', 10.00, 'CON', 'prod. conifer');

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('OK', 9.00, 'CON', 'native broadleaves');

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('SP', 12.00, 'CON', 'alt. conifer');

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('OG', 2.00, 'CON', 'open ground');

INSERT INTO forest_scdb (species, area_ha, contract, type)
VALUES ('OL', 10.00, NULL, 'other land');


create table tree_prices (
  record_id BIGSERIAL NOT NULL PRIMARY KEY,
  tree_species VARCHAR(150),
  tree_price FLOAT NOT NULL
);


INSERT INTO tree_prices (tree_species, tree_price)
VALUES ('SS', 54.37);

INSERT INTO tree_prices (tree_species, tree_price)
VALUES ('NS', 24.37);

INSERT INTO tree_prices (tree_species, tree_price)
VALUES ('SP', 10.37);

INSERT INTO tree_prices (tree_species, tree_price)
VALUES ('CAR', 3.37);

--
-- SELECT species, area_ha, tree_price, ROUND(cast(area_ha*tree_price as numeric), 2) AS total_price FROM forest_scdb, tree_prices
-- WHERE species = tree_species;

-- (cast(doublecolumn as numeric),2)
-- ROUND (source [ , n ] )

SELECT species, area_ha FROM forest_scdb GROUP BY species;











--
