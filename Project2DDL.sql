--select 'drop table ' || table_name || ' cascade constraints;' from user_tables;
drop table CUSTOMER cascade constraints;
drop table RESTAURANT cascade constraints;
drop table FAVORITED_RESTAURANT cascade constraints;
drop table MENU_ITEM cascade constraints;
drop table TAG cascade constraints;
drop table REVIEWS cascade constraints;
drop table RESTAURANT_TAGS cascade constraints;

--select 'drop sequence ' || sequence_name || ';' from user_sequences;
drop sequence CUSTOMERS_SEQ;
drop sequence RESTAURANT_SEQ;
drop sequence TAG_SEQ;

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
    restaurant_id number(20) primary key,
    restaurant_name varchar2(60) not null,
    username varchar2(100) unique not null,
    password varchar2(100) not null,
    phone varchar2(20)unique not null,
    email varchar2(30) unique,
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
    review_date varchar2(30),
    review varchar2(255)
);

create table menu_item(
    id number(30) primary key,
    restaurant_id number(20) not null,
    item_name varchar(150),
    item_price number(5, 2), 
    special_price number(5, 2),
    special_start number(30),
    special_end number(30),
    mon number(1) not null, 
    tue number(1)not null,
    wed number(1)not null,
    thu number(1)not null,
    fri number(1)not null,
    sat number(1)not null,
    sun number(1)not null
);

create table tag(
    id number(30),
    name varchar(150)
);



create table restaurant_tags(
    restaurant_id number(20),
    tag_id number(30)
);

insert into menu_item values(1234, 101, '12 Nuggets', 6.49, 5, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0);
insert into menu_item values(1235, 101, '24 Nuggets', 10.49, 8, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0);
insert into menu_item values(1236, 101, '50 Nuggets', 19.49, 15, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0);
insert into menu_item values(1237, 101, '6 Boneless Wings', 6.99, 4.50, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0);
insert into menu_item values(1238, 101, '12 Boneless Wings', 13.49, 9, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0);
insert into menu_item values(1239, 101, '18 Boneless Wings', 19.49, 13.50, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0);
insert into menu_item values(1240, 102, '12 Wings', 13.49, 10, 39600000, 79200000, 0, 0, 1, 0, 0, 0, 0);
insert into menu_item values(1241, 102, '6 Tenders', 9, 6, 39600000, 79200000, 0, 0, 0, 1, 0, 0, 0);
insert into menu_item values(1242, 102, '8 Tenders', 10, 8, 39600000, 79200000, 0, 0, 0, 1, 0, 0, 0);
insert into menu_item values(1243, 102, 'Shakes', 5.50, 4, 54000000, 64800000, 1, 1, 1, 1, 1, 0, 0); 

insert into restaurant values(101, 'Clutch Wings', 'Clutch', 'clutchpass', '304-212-5403', '', '444 High Street', '', 'MorganTown', 'WV', 26505, 'clutchwingshop.com', 39600000, 79200000); 
insert into restaurant values(102, 'Tailpipes', 'tailpipes', 'tailpipespass', '304-225-2535', '', '417 High Street', '', 'MorganTown', 'WV', 26505, 'tailpipesmorgantown.com', 39600000, 0);
insert into restaurant values(103, 'Yama', 'yama', 'yamapass', '304-291-2456', '', '387 1/2 High Street', '', 'MorganTown', 'WV', 26505, '', 41400000, 72000000);
insert into restaurant values(104, 'Benny Velinos', 'velinos', 'velinospass', '304-943-7363', '', '458 High Street', '', 'MorganTown', 'WV', 26505, 'bennysva.com', 39600000, 12600000);
insert into restaurant values(105, 'D.P. Dough', 'dpdough', 'dpdoughpass', '304-292-2444', '', '408 High Street', '', 'MorganTown', 'WV', 26505, 'dpdough.com', 39600000, 14400000);
insert into restaurant values(106, 'Pita Pit', 'pitapit', 'pitapitpass', '304-284-0027', '', '387 High Street', '', 'MorganTown', 'WV', 26505, 'locations.pitapitusa.com', 36000000, 14400000);
insert into restaurant values(107, 'Chicos fat', 'chicos', 'chicospass', '304-241-4712', '', '456 High Street', '', 'MorganTown', 'WV', 26505, 'chicosfatburritos.com', 39600000, 7200000);
insert into restaurant values(108, 'Jasmine Grill', 'jasmine', 'jasminepass', '304-291-7878', '', '330 High Street', '', 'MorganTown', 'WV', 26505, 'jasminegrillwv.com', 39600000, 67500000);
insert into restaurant values(109, 'Panera Bread', 'panera', 'panerapass', '304-291-6240', '', '207 Willey Street', '', 'MorganTown', 'WV', 26505, 'locations.panerabread.com', 25200000, 75600000);
insert into restaurant values(110, 'The Grind', 'grind', 'grindpass', '304-296-5297', '', '5531, 168 Willey Street', '', 'MorganTown', 'WV', 26505, 'thegrindwv.com', 28800000, 61200000);

CREATE SEQUENCE customers_seq START WITH 1;
create sequence restaurant_seq START WITH 1;
create sequence tag_seq START WITH 1;

insert into customer
    values(1, 'Kyle', 'Jensen', 'KJen', '760', 'kjen@760.com', '555-555-5555');
insert into customer
    values(2, 'harris', 'sam', 'sam', 'harris', '3333', 's@gmail.com');
    
insert into tag
    values(null, 'Pizza');
insert into tag
    values(null, 'Chinese');
insert into tag
    values(null, 'Wings');
insert into tag
    values(null, 'Burgers');
insert into tag
    values(null, 'Thai');
insert into tag
    values(null, 'Japanese');
insert into tag
    values(null, 'Sushi');
insert into tag
    values(null, 'Deli');

commit;
