CREATE DATABASE omazon
  WITH ENCODING='UTF8'
       OWNER=postgres
       CONNECTION LIMIT=-1;

       
CREATE TABLE omz_product(
   id 		     INT PRIMARY KEY     NOT NULL,
   version           INT    NOT NULL,
   created_date      DATE     NOT NULL,
   updated_date      DATE,   
   product_name         TEXT NOT NULL,
   isbook         BOOLEAN , 
   type    CHAR(50), 
   amount            INT,
   currency          CHAR(30),
   language			 CHAR(50),
   book_author			 CHAR(50),
   publisher		 CHAR(50),
   isbn			 CHAR(50)  
);


CREATE SEQUENCE omz_id_seq START 101;



CREATE TABLE ref_order_product (
	order_id         INT,
	product_id	 INT
);


CREATE TABLE omz_order (
	id 				 INT PRIMARY KEY     NOT NULL,
   	version           INT    NOT NULL,
    created_date      DATE     NOT NULL,
    updated_date      DATE,
    order_description		  TEXT      
);



       
       