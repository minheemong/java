create table mboard(
	num number(5) primary key,
	pass varchar2(30),
	name varchar2(30),
	email varchar2(30),
	title varchar2(50),
	content varchar2(1000),
	readcount number(4) default 0,
	writedate date default sysdate
);

create sequence mboard_seq start with 1 increment by 1;

Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, '홍길동', 'abcd@naver.com', '1234', '첫방문','반갑습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, '홍길남', 'adddnaver.com', '1234', '게시판 개설','축하드립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, '홍길서', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, '홍길북', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '맛집 탐방 후기','그저그랬습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'scott', 'adddnaver.com', '1234', '코로나19','사회적 거리두기 2단계');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'light', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '맛집 탐방 후기','그저그랬습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'scott', 'adddnaver.com', '1234', '코로나19','사회적 거리두기 2단계');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'light', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '맛집 탐방 후기','그저그랬습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'scott', 'adddnaver.com', '1234', '코로나19','사회적 거리두기 2단계');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'light', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '맛집 탐방 후기','그저그랬습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'scott', 'adddnaver.com', '1234', '코로나19','사회적 거리두기 2단계');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'light', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'somi', 'abcd@naver.com', '1234', '맛집 탐방 후기','그저그랬습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'scott', 'adddnaver.com', '1234', '코로나19','사회적 거리두기 2단계');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'sang12', 'bnbn@naver.com', '1234', '돼지골마을','돼지 삼겹살이 맛있습니다');
Insert into mboard(num, name, email, pass, title, content)
values(mboard_seq.nextVal, 'light', 'gre@daum.ner', '1234', '2020년 여름' , '날씨 습하고 덥고 폭염이 기승을 부립니다');

select * from mboard;
