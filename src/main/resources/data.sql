INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.53249,3.40570, 'AAA-000');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.50503,3.43372, 'BBB-111');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.51568,3.44997, 'CCC-222');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.49494,3.48135, 'DDD-333');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.52585,3.37757, 'EEE-444');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.53886,3.38145, 'FFF-555');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.54631,3.40942, 'GGG-666');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.51512,3.46005, 'HHH-777');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.52797,3.48456, 'III-888');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.46759,3.43351, 'OOO-089');
INSERT INTO public.vehicles(lon,lat,licence_plate) VALUES(-76.50262,3.39943, 'UUU-456');

UPDATE public.vehicles set the_geom = st_setsrid(st_makepoint(lon,lat),4326);