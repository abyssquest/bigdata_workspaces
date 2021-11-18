DROP TABLE MVCBOARD purge;

CREATE TABLE MVCBOARD(
	boardNum				number		primary key,
	boardName			varchar2(20),
	boardPass				varchar2(15),
	boardSubject		varchar2(50),
	boardContent		varchar2(2000),
	boardFile				varchar2(50),
	boardReplyRef		number,
	boardReplyLev		number,
	boardReplySeq		number,
	boardReadcount	number,
	boardDate				date
);

select * from MVCBOARD;

delete from MVCBOARD;