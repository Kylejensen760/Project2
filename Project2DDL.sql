connect frugal/p4ssw0rd;
--select 'drop table ' || table_name || ' cascade constraints;' from user_tables;
drop table CUSTOMER cascade constraints;
drop table RESTAURANT cascade constraints;
drop table FAVORITED_RESTAURANT cascade constraints;
drop table MENU cascade constraints;
drop table MENU_ITEM cascade constraints;
drop table TAG cascade constraints;
drop table REVIEWS cascade constraints;
drop table RESTAURANT_TAGS cascade constraints;

create table customer(
    id number(20) primary key,
    first_name varchar2(60) not null,
    last_name varchar2(60) not null,
    username varchar2(100) unique not null,
    password varchar2(100) not null,
    phone varchar2(20)unique not null,
    email varchar2(30) unique not null
);

create table restaurant(
    id number(20) primary key,
    restaurant_name varchar2(60) not null,
    username varchar2(100) unique not null,
    password varchar2(100) not null,
    phone varchar2(20)unique not null,
    email varchar2(30) unique not null,
    line_one varchar2(150) not null,
    line_two varchar2(150),
    city varchar2(150) not null,
    state varchar2(3) not null,
    zip varchar2(150) not null,
    website_url varchar2(255),
    opening_time number(30),
    closing_time number(30)
);

create table favorited_restaurant(
    customer_id number(20),
    restaurant_id number(20)
);

create table reviews(
    id number(20),
    restaurant_id number(20),
    customer_id number(20),
    rating number(1),
    review_date number(30),
    review varchar2(255)
);

create table menu (
    id number(20) primary key,
    restaurant_id number(20) not null, 
    time_begin number(30),
    time_end number(30)
);

create table menu_item(
    id number(30) primary key,
    menu_id number(20) not null,
    item_name varchar(150),
    item_price number(5, 2), 
    isSpecial number(1),
    special_price number(5, 2),
    monday number(1),
    tuesday number(1),
    wednesday number(1),
    thursday number(1),
    friday number(1),
    saturday number(1),
    sunday number(1),
    special_start number(30),
    special_end number(30)
);

create table tag(
    id number(30),
    name varchar(150)
);

create table restaurant_tags(
    restaurant_id number(20),
    tag_id number(30)
);

insert into customer
    values(1, 'Kyle', 'Jensen', 'KJen', '760', 'kjen@760.com', '555-555-5555');





