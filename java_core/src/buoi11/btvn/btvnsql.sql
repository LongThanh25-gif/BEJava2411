create database quanlyhocsinh2;
use quanlyhocsinh2;

create table student (
                         id integer primary key auto_increment,
                         first_name nvarchar(50),
                         last_name nvarchar(50),
                         birth_date date,
                         email nvarchar(100)
);

insert into
    student
(first_name, last_name, birth_date, email)
values
    ('Long', 'Nguyễn', '1998-01-01','glotig@example.com'),
    ('Duy', 'Võ', '2002-01-06','231232@gmail.com'),
    ('Thành', 'Đỗ', '2002-01-01','thanhlong2562@example.com'),
    ('Nam', 'Phạm', '2000-01-08','thanhlong2562@gmail.com'),
    ('Trung', 'Nguyễn', '1999-01-10','i123io1dji@example.com');

select first_name, last_name, email from student;

-- cập nhật dữ liệu
update student
set email = 'newemail@example'
where id = 1;


create table courses(
                        id integer primary key auto_increment,
                        course_name nvarchar(100),
                        course_description longtext
);


insert into courses
(course_name, course_description)
values
    ('JavaScript', 'Lập trình JavaScript'),
    ('Java', 'Lập trình Java'),
    ('Toán Học', 'Học tính toán')

select * from courses;

-- cập nhật dữ liệu
update courses
set course_description = 'Lập Trình Cơ Bản'
where course_name = 'Java';

create table enrollments(
                            id integer primary key auto_increment,
                            student_id integer,
                            course_id integer,
                            enrollment_date date,
                            foreign key (student_id) references student(id),
                            foreign key (course_id) references courses(id)
);

insert into enrollments
(student_id, course_id, enrollment_date)
values
    (1, 1, '2024-01-10'),
    (2, 1, '2024-01-12'),
    (3, 2, '2024-01-15'),
    (4, 3, '2024-01-18')

-- Truy vấn danh sách sinh viên cùng khóa học họ đăng ký (bao gồm tên sinh viên và tên khóa học).
select
    student.first_name,
    student.last_name,
    courses.course_name
from enrollments
         join student on enrollments.student_id = student.id
         join courses on enrollments.course_id = courses.id;


-- Truy vấn danh sách sinh viên đã đăng ký khóa học "Lập Trình Cơ Bản".
select
    student.first_name,
    student.last_name,
    courses.course_name
from enrollments
         join student on enrollments.student_id = student.id
         join courses on enrollments.course_id = courses.id
where courses.course_name = 'JavaScript';

-- Truy vấn các sinh viên có ngày sinh sau ngày 2000-01-01 và có email chứa từ "example".
select * from student where birth_date > '2000-01-01'and email like '%example';


-- xóa dữ liệu

-- toán tử
select * from student where birth_date > '2000-01-01';

-- tìm kiếm sinh viên có họ Nguyễn
select * from student where last_name like '%Nguyễn%'

-- and/or







