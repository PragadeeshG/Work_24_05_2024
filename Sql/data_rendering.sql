create table if not exists data_rendering(
rendering_id bigint not null,
rendering_name varchar(255) null,
rendering_type varchar(255) null,
rendering_behaviour varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_rendering_pk primary key(rendering_id));