create table addresses (id int4 not null, address_comment varchar(100), geohash varchar(16), latitude varchar(12), longitude varchar(12), street varchar(64), streetnumber varchar(5), federalstate_id int4, zipcode_id int4, primary key (id));
create table blacklisted_contacts (user_data_id int4 not null, blacklisted_id int4 not null, primary key (user_data_id, blacklisted_id));
create table contactmethods (id int4 not null, contactmethod varchar(255), contactvalue varchar(1024), primary key (id));
create table countries (id int4 not null, iso3166_a2name varchar(2), iso3166_a3name varchar(3), iso3166_number varchar(3), name varchar(128), primary key (id));
create table favorite_members (id int4 not null, favorite_id int4, owner_id int4, primary key (id));
create table federalstates (id int4 not null, iso3166_a2code varchar(6), name varchar(128), subdivision_category varchar(128), subdivision_name varchar(56), country_id int4, primary key (id));
create table friendship_requests (id int4 not null, accepted_date timestamp, state varchar(255), requested_user_id int4, requestor_id int4, primary key (id));
create table message_attachments (message_id int4 not null, resource_id int4 not null, primary key (message_id, resource_id));
create table message_recipients (id int4 not null, message_id int4, recipient_id int4, recipient_email int4, primary key (id));
create table messages (id int4 not null, failed2sentemail bool, folder varchar(64), messageContent varchar(21845), messagetype varchar(255), read_flag bool, recipient_deleted_flag bool, sender_deleted_flag bool, sent_date timestamp, spam_flag bool, state varchar(255), subject varchar(1000), parent int4, sender int4, sender_email int4, primary key (id));
create table permissions (id int4 not null, description varchar(64), permissionName varchar(64) unique, shortcut varchar(10) unique, primary key (id));
create table profile_notice (id int4 not null, notice varchar(1000), user_id int4, user_profile int4, primary key (id));
create table profile_ratings (id int4 not null, rating_date timestamp, rating_description varchar(1024), rating_points int4, title_rating varchar(256), visibility varchar(255), rater int4, rated_profile int4, primary key (id));
create table profile_visitors (id int4 not null, count int4, visiting_date timestamp, visited_profile int4, visitor_id int4, primary key (id));
create table recommendations (id int4 not null, email varchar(1024), invitation_text varchar(1024), sent bool, recommended_id int4, user_id int4, primary key (id));
create table relation_permissions (id int4 not null, provider_id int4, subscriber_id int4, primary key (id));
create table reset_passwords (id int4 not null, expiry_date timestamp, generated_password varchar(1024), starttime timestamp, user_id int4, primary key (id));
create table resourcebundles (id int4 not null, base_name varchar(1024), properties_key varchar(1024), locale varchar(64), value varchar(2048), primary key (id));
create table resources (id int4 not null, checksum varchar(255), content BYTEA, contentType varchar(64), created timestamp, deleted_flag bool, description varchar(1024), filename varchar(1024), filesize varchar(64), primary key (id));
create table robinsons (id int4 not null, robinson_user_id int4, primary key (id));
create table role_permissions (role_id int4 not null, permission_id int4 not null, primary key (role_id, permission_id));
create table roles (id int4 not null, description varchar(64), rolename varchar(64) unique, primary key (id));
create table rule_violations (id int4 not null, description varchar(1000), reason varchar(255), detector_user_id int4, violator_user_id int4, primary key (id));
create table search_criteria (id int4 not null, from_age int4, search_gender varchar(255), until_age int4, primary key (id));
create table user_addresses (user_data_id int4 not null, addresses_id int4 not null, primary key (user_data_id, addresses_id));
create table user_contactmethods (user_data_id int4 not null, contactmethods_id int4 not null, primary key (user_data_id, contactmethods_id));
create table user_contacts (user_data_id int4 not null, user_contact_id int4 not null, primary key (user_data_id, user_contact_id));
create table user_credits (id int4 not null, credits int4, user_id int4, primary key (id));
create table user_data (id int4 not null, birthname varchar(64), dateofbirth timestamp, firstname varchar(64), gender varchar(255), ip_address varchar(16), lastname varchar(64), locale varchar(12), primary_address_id int4, primary key (id));
create table user_profile (id int4 not null, age int4, education_state varchar(255), figure varchar(255), haircolor varchar(255), height int4, interests varchar(255), occupation varchar(50), profile_text varchar(1000), relationship_status varchar(255), smokerstate varchar(255), weight int4, zodiac_sign varchar(255), search_criteria int4, user_id int4, image_id int4, primary key (id));
create table user_relation_permissions (user_relation_permission_id int4 not null, permission_id int4 not null, primary key (user_relation_permission_id, permission_id));
create table user_resources (user_data_id int4 not null, resources_id int4 not null, primary key (user_data_id, resources_id));
create table user_roles (user_id int4 not null, role_id int4 not null, primary key (user_id, role_id));
create table users (id int4 not null, active bool, locked bool, pw varchar(1024), salt varchar(8), username varchar(256) unique, user_data int4, primary key (id));
create table zipcodes (id int4 not null, city varchar(128), zipcode varchar(10) not null, country_id int4, primary key (id));
