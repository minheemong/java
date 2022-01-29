
/* Drop Tables */

DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE worker CASCADE CONSTRAINTS;

 select * from 
 (select * from 
 (select rownum as rn, o.* from 
 (select * from order_view order by result, odseq desc) o) 
 where rn>=0) 
 where rn<=10000;


/* Create Tables */

CREATE TABLE member
(
	id varchar2(20) NOT NULL,
	pwd varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL,
	email varchar2(40) NOT NULL,
	zip_num varchar2(10) NOT NULL,
	address varchar2(100) NOT NULL,
	phone varchar2(20) NOT NULL,
	useyn char(1) DEFAULT 'y',
	indate date DEFAULT sysdate,
	PRIMARY KEY (id)
);


CREATE TABLE product
(
	pseq number(5) NOT NULL,
	name varchar2(100) NOT NULL,
	kind char(1) NOT NULL,
	price number(7),
	price2 number(7),
	price3 number(7),
	content varchar2(1000),
	image varchar2(50),
	useyn char(1) DEFAULT 'y',
	bestyn char(1) DEFAULT 'n',
	indate date DEFAULT sysdate,
	PRIMARY KEY (pseq)
);

alter table product rename column price to price1;

drop sequence product_seq;
create sequence product_seq start with 1;


-- 쇼핑몰 관리자 테이블
CREATE TABLE worker
(
	id varchar2(20) NOT NULL,
	pwd varchar2(20) NOT NULL,
	name varchar2(20) NOT NULL,
	phone varchar2(20) NOT NULL,
	PRIMARY KEY (id)
);


alter table cart drop primary key cascade;
drop table cart purge;

create table cart(
cseq number(10) primary key, -- 장바구니 번호
id varchar2(16) references member(id), -- 주문자 아이디(FK: member.id)
pseq number(5) references product(pseq), -- 주문 상품번호(FK: product.pseq)
quantity number(5) default 1, -- 주문수량
result char(1) default '1', -- 1:미처리 2:처리
indate date default sysdate -- 주문일
);

drop sequence cart_seq;
create sequence cart_seq start with 1;

alter table orders drop primary key cascade;
drop table orders purge;

create table orders(
oseq number(10) primary key, -- 주문번호
id varchar2(16) references member(id), -- 주문자 아이디
indate date default sysdate -- 주문일
);

drop sequence orders_seq;
create sequence orders_seq start with 1;

alter table order_detail drop primary key cascade;
drop table order_detail purge;
create table order_detail(
odseq number(10) primary key, -- 주문상세번호
oseq number(10) references orders(oseq), -- 주문번호
pseq number(5) references product(pseq), -- 상품번호
quantity number(5) default 1, -- 주문수량
result char(1) default '1' -- 1:미처리 2:처리
);

drop sequence order_detail_seq;
create sequence order_detail_seq start with 1;


alter address drop primary key cascade;
drop table address purge;
create table address(
zip_num varchar2(7) not null,
sido varchar2(30) not null,
gugun varchar2(30) not null,
dong varchar2(100) not null,
zip_code varchar2(30),
bunji varchar2(30)
);


alter table qna drop primary key cascade;
dro table qna purge;

create table qna(
qseq number(5) primary key, -- 글번호
subject varchar2(300), -- 제목
content varchar2(1000), -- 문의내용
reply varchar2(1000), -- 답변내용
id varchar2(20), --작성자(FK: member.id)
rep char(1) default '1', -- 1:답변무 2:답변유
indate date default sysdate -- 작성일
);

drop sequence qna_seq;
create sequence qna_seq start with 1;


insert into worker values('admin', 'admin', '관리자', '010-7777-7777');
insert into worker values('scott', 'tiger', '강희준', '010-6400-6068');

insert into member(id, pwd, name, zip_num, address, phone,email) values
('one', '1111', '김나리', '133-110', '서울시 성동구 성수동 1가 1번지 21호', '017-777-7777','mini@daum.net');
insert into member(id, pwd, name, zip_num, address, phone,email) values
('two', '2222', '김길동', '130-120', '서울시 송파구 잠실2동 리센츠 아파트 201동 505호', '011-123-4567','two@gmail.com');

insert into product(pseq,name,kind,price,price2,price3,content,image)
values(product_seq.nextVal,'크로그다일부츠','2',40000,50000,10000,'오리지날 크로그다일부츠입니다','w2.jpg');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'롱부츠','2',40000,50000,10000,'따듯한 롱부츠입니다.','w-28.jpg','n');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'힐','1',10000,12000,2000,'여성전용 힐','w-26.jpg','n');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'슬리퍼','4',5000,5500,500,'편안한 슬리퍼입니다','w-25.jpg','y');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'회색힐','1',10000,12000,2000,'여성용 힐','w9.jpg','n');
insert into product(pseq,name,kind,price,price2,price3,content,image)
values(product_seq.nextVal,'여성부츠','2',12000,18000,6000,'여성용 부츠','w-4.jpg');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'핑크샌달','3',5000,5500,500,'사계절용 샌달입니다','w-10.jpg','y');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'슬리퍼','3',5000,5500,500,'편안한 슬리퍼입니다','w-11.jpg','y');
insert into product(pseq,name,kind,price,price2,price3,content,image)
values(product_seq.nextVal,'스니커즈','4',15000,20000,5000,'활동성이 좋은 스니커즈입니다','w1.jpg');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'샌달','3',5000,5500,500,'사계절용 샌달입니다','w-09.jpg','n');
insert into product(pseq,name,kind,price,price2,price3,content,image,bestyn)
values(product_seq.nextVal,'스니커즈','5',15000,20000,5000,'활동성이 좋은 스니커즈입니다','w-05.jpg','n');


insert into cart(cseq,id,pseq,quantity) values(cart_seq.nextval,'one',1,1);

insert into orders(oseq,id) values(orders_seq.nextval,'two');
insert into orders(oseq,id) values(orders_seq.nextval,'one');
insert into orders(oseq,id) values(orders_seq.nextval,'one');
insert into orders(oseq,id) values(orders_seq.nextval,'two');

insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,2,1,1);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,3,2,5);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,5,4,3);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,6,5,2);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,2,3,1);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,3,2,1);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,5,6,2);
insert into order_detail(odseq,oseq,pseq,quantity) values(order_detail_seq.nextval,6,1,2);


insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'배송문의입니다','현재 배송상태와 예상배송일을 답변 부탁합니다','one');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'환불문의입니다','환불절차 안내부탁드려요. 배송사 선택은 어떻게 되는지도 알려주세요','one');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'사이즈 교환하고싶어요','사이즈가 예상보다 작습니다. 교환절차 안내해주세요','two');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'배송이 많이 지연되고 있습니다','언제 받을 수 있나요?','scott');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'상품문의입니다','소재가 어떻게 되나요?','scott');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'배송문의입니다','현재 배송상태와 예상배송일을 답변 부탁합니다','one');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'환불문의입니다','환불절차 안내부탁드려요. 배송사 선택은 어떻게 되는지도 알려주세요','one');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'사이즈 교환하고싶어요','사이즈가 예상보다 작습니다. 교환절차 안내해주세요','two');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'배송이 많이 지연되고 있습니다','언제 받을 수 있나요?','scott');
insert into qna(qseq,subject,content,id)
values(qna_seq.nextval,'상품문의입니다','소재가 어떻게 되나요?','scott');

create or replace view cart_view
as
select c.cseq, c.id, m.name as mname, c.pseq, p.name as pname,
	c.quantity, p.price2, c.result, c.indate
from cart c, product p, member m
where c.pseq = p.pseq and m.id = c.id;

create or replace view order_view
as
select d.odseq, o.oseq, o.id, o.indate, d.pseq, d.quantity, d.result,
m.name as mname, m.zip_num, m.address, m.phone,
p.name as pname, p.price2
from orders o, order_detail d, member m, product p
where o.oseq = d.oseq and o.id = m.id and d.pseq = p.pseq;

create or replace view best_pro_view
as
select * from(
select rownum, pseq, name, price2, image
from product where bestyn='y' order by indate desc
) where rownum <= 4;

create or replace view new_pro_view
as
select * from(
select rownum, pseq, name, price2, image
from product where useyn='y' order by indate desc
) where rownum <= 4;

select * from worker;
select * from member;
select * from product;
select * from cart;
select * from orders;
select * from order_detail;
select * from cart_view;
select * from order_view;
select * from best_pro_view;
select * from new_pro_view;
select * from qna;

select count(*) from address;
select /*insert*/ * from address;
select distinct oseq from order_view where id='scott' and result='1' order by oseq desc;

update order_detail set result='2' where oseq = 7;