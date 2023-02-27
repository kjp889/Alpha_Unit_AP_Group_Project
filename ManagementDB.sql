create database Query_Management;
use Query_Management;

	create table Student(
		stud_ID int primary key,
		fName varchar(50) not null,
        lName varchar(50) not null,
        pword varchar(20) not null,
        email varchar(50)
	);
	
    create table phoneNum(
		stud_ID int,
		phone int,
		Constraint fk_id foreign key (stud_ID) references Student (stud_ID),
		Constraint pk_phone primary key(cus_id, phone)
	);
    
    create table Staff(
		staff_ID varchar(8) primary key,
        fName varchar(50) not null,
        lName varchar(50) not null,
        staff_Type varchar(3),
        pword varchar(20)
    );
    
    create table Issue(
		issue_ID int primary key,
        issue_Type varchar(15),
        details varchar(200),
        date_Of_Issue date,
        stud_ID int,
        staff_ID varchar(8),
        constraint fkey_ID1 foreign key (stud_ID) references Student (stud_ID),
		constraint fkey_ID2 foreign key (staff_ID) references Staff (staff_ID)
    );
    
    select * from student;
    drop table student;
    
		
