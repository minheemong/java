-- command 창에서 운영되는 mysql 프로그램 접속

-- mysql -h localhost -u root -p
-- 		-h는 호스트, -u는 사용자, -p는 비밀번호 의미

-- mysql 종료는 quit 또는 exit

-- Schema 생성
create schema scott default chracter set utf8mb4;

-- 사용하려는 스키마로 이동
use scott;

-- 현재 스키마의 테이블 보기
show tables;

-- 테이블의 구조 보기
desc  테이블이름;

-- mysql의 외래키
-- foreign key(필드명) references 스키마이름, 테이블이름(필드명)
-- 추가옵션 : on delete cascade, on update cascade
-- 참조되는 테이블의 로우가 지워지고 수정될 때 참조하는 테이블에 연관된 로우도 같이 지워지고 수정됨
-- 참조값들과 참조되는 값들의 데이터를 일치시키기 위해 사용하는 옵션

-- LIMIT
-- 	select로 데이터 조회 시, 조회할 레코드의 개수를 조절 제한할 수 있습니다
select*from memberlist order by membernum desc limit 5;
-- 회원 정보 조회하여 5개의 레코드만 리턴

-- OFFSET
-- select로 데이터 조회 시, 맨 위에서부터 offset에 지정한 번째까지 뛰어넘고 그 다음부터 리턴
select*from memberlist order by membernum desc limit 10 offset 5;
-- 6번째 데이터부터 10개의 레코드 리턴 - 개수가 모자르면 있는 곳까지 리턴

-- limit와 offset의 동시사용
select*from memberlist order by membernum limit 5 offset 5;

-- offset과 limit는 게시판이나, 상품 진열시 페이지를 표시하기 위한 용도로 가장 많이 사용됩니다

select*from rentlist;