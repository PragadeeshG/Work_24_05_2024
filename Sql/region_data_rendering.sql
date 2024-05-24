create table if not exists region_data_rendering(
country_code varchar(255) not null,
region_code varchar(255) null,
region_name varchar(255) null,
rendering_id varchar(255) null,
is_primary varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint region_data_rendering_pk primary key(country_code));