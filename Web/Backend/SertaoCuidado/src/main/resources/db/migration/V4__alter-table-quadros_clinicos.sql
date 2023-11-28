ALTER TABLE quadros_clinicos DROP COLUMN ca;
ALTER TABLE quadros_clinicos DROP COLUMN pa;
ALTER TABLE quadros_clinicos ADD COLUMN ca double precision;
ALTER TABLE quadros_clinicos ADD COLUMN pas integer;
ALTER TABLE quadros_clinicos ADD COLUMN pad integer;