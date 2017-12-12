/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  DUGPLPW7
 * Created: Dec 11, 2017
 */

create table direccion (id integer primary key auto_increment, cp integer, calle varchar(50),
                        municipio varchar(50));

create table cliente (id integer primary key , nombre varchar(50), edad integer, id_direccion integer,
         foreign key (id_direccion) references direccion(id));

describe direccion;
drop table direccion;
describe cliente;

select * from direccion;
select * from cliente;