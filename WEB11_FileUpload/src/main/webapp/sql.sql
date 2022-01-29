create table bookproduct(
	code number(5) primary key,
	name varchar2(100),
	price number(8),
	pictureurl varchar2(50),
	description varchar2(1000)
);

create sequence product_seq start with 1 increment by 1;

insert into bookproduct
values(product_seq.nextval, 'JQuery and JQuery moblie : 이해하기 쉽게 풀어쓴',
25000, 'jquery.jpg', '소스하나로 데스크탑과 모바일까지 HTML5와 함께 사용...');

select*from bookproduct;
