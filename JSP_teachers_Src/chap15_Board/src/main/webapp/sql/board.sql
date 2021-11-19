drop table mvcboard purge;

create table mvcboard(
	boardNum	number		primary key,
	boardName	varchar2(20),
	boardPass	varchar2(20),
	boardSubject	varchar2(50),
	boardContent	varchar2(2000),
	boardFile		varchar2(50),
	boardReplyRef	number,
	boardReplyLev	number,
	boardReplySeq	number,
	boardReadCount	number,
	boardDate		date
);

select * from MVCBOARD;


