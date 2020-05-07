-- sql file to run from terminal, to create/reset tables..
-- in .sql we want to create our table to store our pizza orders. What do we want to save?
--
-- - first_name
-- - last_name
-- - topping
-- - quantity
--
-- Basically all properties that we created in our PizzaOrder class. We want to take these seperate inputs and save them as a new row in our database.
--
-- Let's chuck in an ID as well so we can differentiate between the orders.


DROP TABLE IF EXISTS pizza_orders;

create table pizza_orders(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  quantity INT,
  topping VARCHAR(255)
);
