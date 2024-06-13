
--INSERT INTO LOCATIONS(LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID)
--VALUES (1000,'1297 Via Cola di Rie','00989','Roma',NULL,'IT'),
--(1100,'93091 Calle della Testa','10934','Venice',NULL,'IT'),
--(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefecture','JP'),
--(1300,'9450 Kamiya-cho','6823','Hiroshima',NULL,'JP'),
--(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US'),
--(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US'),
--(1600,'2007 Zagora St','50090','South Brunswick','New Jersey','US'),
--(1700,'2004 Charade Rd','98199','Seattle','Washington','US');

INSERT INTO LOCATIONS (location_id, street_address, postal_code, city, state_province, country_id) VALUES
(3200, '123 Elm St', '12345', 'Springfield', 'IL', 'US'),
(3201, '456 Oak St', '67890', 'Shelbyville', 'IN', 'US'),
(3202, '789 Pine St', '54321', 'Capital City', 'CA', 'US'),
(3203, '101 Maple Ave', '98765', 'Ogdenville', 'NV', 'US'),
(3204, '202 Birch Blvd', '11223', 'North Haverbrook', 'TX', 'US');

INSERT INTO DEPARTMENTS(DEPARTMENT_ID,DEPARTMENT_NAME,IDGERENTE,LOCATION_ID) VALUES
(10,'DEVELOPMENT',100,3200);