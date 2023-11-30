insert into user_details(id, name, birth_date)
values (10001, 'Adam', current_date());

insert into user_details(id, name, birth_date)
values (10002, 'Eve', current_date());

insert into user_details(id, name, birth_date)
values (10003, 'Zampa', current_date());

insert into post(id, description, user_id)
values (20001, 'I want to Learn DevOps', 10001);

insert into post(id, description, user_id)
values (20002, 'I want to Learn AWS', 10002);

insert into post(id, description, user_id)
values (20003, 'I want to Learn Full Stack Development', 10002);

insert into post(id, description, user_id)
values (20004, 'I want to Learn Multi Cloud', 10003);