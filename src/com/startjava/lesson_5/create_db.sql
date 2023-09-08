\c robots;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id         SERIAL PRIMARY KEY,
    model_name VARCHAR(20),
    mark       INT,
    height     REAL,
    weight     NUMERIC,
    status     VARCHAR(16),
    origin     VARCHAR(30),
    launch     DATE,
    kaiju_kill INT
);

\ir 'init_db.sql'
\ir 'queries.sql'
