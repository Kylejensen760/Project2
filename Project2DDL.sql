--select 'drop table ' || table_name || ' cascade constraints;' from user_tables;
drop table CUSTOMER cascade constraints;
drop table RESTAURANT cascade constraints;
drop table FAVORITED_RESTAURANT cascade constraints;
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
    closing_time number(30),
    image_link varchar2(100)
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
    sun number(1)not null,
    image_link varchar2(100)
);

create table tag(
    id number(30),
    name varchar(150)
);



create table restaurant_tags(
    restaurant_id number(20),
    tag_id number(30)
);

insert into menu_item values(1234, 101, '12 Nuggets', 6.49, 5.00, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/vqdr280vo8a6a1h/ClutchNuggets.webp?raw=1');
insert into menu_item values(1235, 101, '24 Nuggets', 10.49, 8.00, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/vqdr280vo8a6a1h/ClutchNuggets.webp?raw=1');
insert into menu_item values(1236, 101, '50 Nuggets', 19.49, 15.00, 39600000, 79200000, 1, 0, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/vqdr280vo8a6a1h/ClutchNuggets.webp?raw=1');
insert into menu_item values(1237, 101, '6 Boneless Wings', 6.99, 4.50, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/s8zyqwy7vdttrvr/clutchBonelessWings.webp?raw=1');
insert into menu_item values(1238, 101, '12 Boneless Wings', 13.49, 9.00, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/s8zyqwy7vdttrvr/clutchBonelessWings.webp?raw=1');
insert into menu_item values(1239, 101, '18 Boneless Wings', 19.49, 13.50, 39600000, 79200000, 0, 1, 0, 0, 0, 0, 0, 'https://www.dropbox.com/s/s8zyqwy7vdttrvr/clutchBonelessWings.webp?raw=1');
insert into menu_item values(1240, 101, '12 Wings', 13.49, 10.00, 39600000, 79200000, 0, 0, 1, 0, 0, 0, 0, 'https://www.dropbox.com/s/s8zyqwy7vdttrvr/clutchBonelessWings.webp?raw=1');
insert into menu_item values(1241, 101, '6 Tenders', 9.00, 6.00, 39600000, 79200000, 0, 0, 0, 1, 0, 0, 0, 'https://www.dropbox.com/s/xnkatx834ov8dt4/ClutchTenders.webp?raw=1');
insert into menu_item values(1242, 101, '8 Tenders', 10.00, 8.00, 39600000, 79200000, 0, 0, 0, 1, 0, 0, 0, 'https://www.dropbox.com/s/xnkatx834ov8dt4/ClutchTenders.webp?raw=1');
insert into menu_item values(1243, 102, 'Milk Shakes', 5.50, 4.00, 54000000, 64800000, 1, 1, 1, 1, 1, 0, 0, 'https://www.dropbox.com/s/yau2l61ty2e58dd/tailpipesMilkshake.jpg?raw=1'); 
insert into menu_item values(1244, 102, 'Challenger', 11.00, 11.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/wl4i8bnjsgxywk2/TailpipesBurger.jpg?raw=1'); 
insert into menu_item values(1245, 102, 'Classic Burger', 10.00, 10.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/wl4i8bnjsgxywk2/TailpipesBurger.jpg?raw=1'); 
insert into menu_item values(1246, 102, 'Cajun', 10.00, 10.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/wl4i8bnjsgxywk2/TailpipesBurger.jpg?raw=1'); 
insert into menu_item values(1247, 102, 'Chili Cheese Fries', 10.00, 10.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/b6vz070xcvsyuh6/TailpipesChiliCHeeseFries.jpg?raw=1');
insert into menu_item values(1248, 103, 'Shoyu Ramen', 8.25, 8.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/xf52pw4odevycv4/YamaShoyuRamen.jpg?raw=1');
insert into menu_item values(1249, 103, 'Spicy Tuna Roll', 10.75, 10.75, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/qhc9wmdfyx3dxon/Yama%20Spicy%20Tuna%20Roll.jpg?raw=1');
insert into menu_item values(1250, 103, 'Pork Gyoza', 5.99, 5.99, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/qy0bwcldsrch6an/YamaPorkGyoza.jpg?raw=1');
insert into menu_item values(1251, 103, 'Takoyaki', 6.29, 6.29, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/82fkrc45q2x1yjd/Yama%20Takoyaki.jpg?raw=1');

insert into menu_item values(121, 104, 'Fiesta Slice', 5.00, 5.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/y7zfvv0s338y3b7/BennyVelinosFiestaSlice.jpg?raw=1');
insert into menu_item values(1252, 104, 'Pepperoni', 5.00, 5.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/ck8jb9ewpwzv2j0/BennyVelinosPepperoni.jpg?raw=1');
insert into menu_item values(1253, 104, 'Cheese', 4.00, 4.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/oah0g3ig73rtgy9/BennyVelinosCheese.jpg?raw=1');

insert into menu_item values(1254, 105, 'Roni Zoni', 7.25, 7.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/vwb942r4xzm97cc/DPDoughRoniZoni.PNG?raw=1');
insert into menu_item values(1255, 105, 'Cheese Zone', 7.25, 7.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/cjjphtzbo7rsc5c/DPDoughCheeseZone.PNG?raw=1');
insert into menu_item values(1256, 105, 'BBQ Chiccken Zone', 7.25, 7.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/boddg7e5xncnrvg/DPDoughBBQChickenZone.PNG?raw=1');
insert into menu_item values(1257, 105, 'Buffer Zone', 7.25, 7.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/xtnv8lev0ykn369/DPDoughBufferZone.PNG?raw=1');

insert into menu_item values(1258, 106, 'Awaken W Bacon', 7.00, 7.00, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/vo9g22qm3lyebdn/PitaPitAwakenWithBacon.PNG?raw=1');
insert into menu_item values(1259, 106, 'Philly', 7.20, 7.20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/1i1bwe0lbc5itu5/PitaPitPhilly.PNG?raw=1');
insert into menu_item values(1260, 106, 'Buffalo Chicken', 6.85, 6.85, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/mp31il5v58j6ycb/PitaPitBuffaloChicken.PNG?raw=1');
insert into menu_item values(1261, 106, 'Bacon Cheeseburger', 7.20, 7.20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'https://www.dropbox.com/s/814wlhatvu7esrm/PitaPitBaconCheeseBurger.PNG?raw=1');








insert into restaurant values(101, 'Clutch Wings', 'Clutch', 'clutchpass', '304-212-5403', '', '444 High Street', '', 'MorganTown', 'WV', 26505, 'clutchwingshop.com', 39600000, 79200000, 'https://www.dropbox.com/s/602lqar4bf7p3d6/ClutchWings.webp?raw=1'); 
insert into restaurant values(102, 'Tailpipes', 'tailpipes', 'tailpipespass', '304-225-2535', '', '417 High Street', '', 'MorganTown', 'WV', 26505, 'tailpipesmorgantown.com', 39600000, 0, 'https://www.dropbox.com/s/b2czwn86nhi8jvk/Tailpipes.jpg?raw=1');
insert into restaurant values(103, 'Yama', 'yama', 'yamapass', '304-291-2456', '', '387 1/2 High Street', '', 'MorganTown', 'WV', 26505, '', 41400000, 72000000, 'https://www.dropbox.com/s/q23os33ph61oip8/Yama.png?raw=1');
insert into restaurant values(104, 'Benny Velinos', 'velinos', 'velinospass', '304-943-7363', '', '458 High Street', '', 'MorganTown', 'WV', 26505, 'bennysva.com', 39600000, 12600000, 'https://www.dropbox.com/s/yq5odvoc0m3ttns/BennyVelinos.png?raw=1');
insert into restaurant values(105, 'D.P. Dough', 'dpdough', 'dpdoughpass', '304-292-2444', '', '408 High Street', '', 'MorganTown', 'WV', 26505, 'dpdough.com', 39600000, 14400000, 'https://www.dropbox.com/s/6ta5sua1pubskm7/DPDough.webp?raw=1');
insert into restaurant values(106, 'Pita Pit', 'pitapit', 'pitapitpass', '304-284-0027', '', '387 High Street', '', 'MorganTown', 'WV', 26505, 'locations.pitapitusa.com', 36000000, 14400000, 'https://www.dropbox.com/s/38ogn59wr4fos8n/PitaPit.jpg?raw=1');
insert into restaurant values(107, 'Chicos fat', 'chicos', 'chicospass', '304-241-4712', '', '456 High Street', '', 'MorganTown', 'WV', 26505, 'chicosfatburritos.com', 39600000, 7200000, 'https://www.dropbox.com/s/pkpqka64lfchsed/ChicosFat.jpg?raw=1');
insert into restaurant values(108, 'Jasmine Grill', 'jasmine', 'jasminepass', '304-291-7878', '', '330 High Street', '', 'MorganTown', 'WV', 26505, 'jasminegrillwv.com', 39600000, 67500000, 'https://www.dropbox.com/s/26uwfcit538tlpr/JasmineGrill330MorgantownWV.png?raw=1');
insert into restaurant values(109, 'Panera Bread', 'panera', 'panerapass', '304-291-6240', '', '207 Willey Street', '', 'MorganTown', 'WV', 26505, 'locations.panerabread.com', 25200000, 75600000, 'https://www.dropbox.com/s/san3rce60rn6vnt/paneraBread.jpg?raw=1');
insert into restaurant values(110, 'The Grind', 'grind', 'grindpass', '304-296-5297', '', '5531, 168 Willey Street', '', 'MorganTown', 'WV', 26505, 'thegrindwv.com', 28800000, 61200000, 'https://www.dropbox.com/s/ujh37rak3v52j8y/TheGrind.jpg?raw=1');

insert into customer values(1, 'harris', 'sam', 'sam', 'harris', '3333', 's@gmail.com');
commit;
