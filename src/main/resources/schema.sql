CREATE TABLE IF NOT EXISTS public.vehicles(
  id SERIAL  NOT NULL ,
  lon double precision, 
  lat double precision,
  licence_plate VARCHAR(8)
 );	
 
 ALTER TABLE public.vehicles ADD CONSTRAINT vehicles_pk PRIMARY KEY(id);
 SELECT AddGeometryColumn('public','vehicles','the_geom',4326,'POINT',2);