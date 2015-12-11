alter table addresses drop constraint FK34207BA2FBFE6130;
alter table addresses drop constraint FK34207BA27EE00646;
alter table blacklisted_contacts drop constraint FKA1253AB66926A1DE;
alter table blacklisted_contacts drop constraint FKA1253AB64E23EC72;
alter table favorite_members drop constraint FKE79ADD7665501247;
alter table favorite_members drop constraint FKE79ADD7620FE8067;
alter table federalstates drop constraint FK1A5486DFAE853FD9;
alter table friendship_requests drop constraint FK8AE7208950BD37E8;
alter table friendship_requests drop constraint FK8AE72089A636525E;
alter table message_attachments drop constraint FK64E05778311BBAC0;
alter table message_attachments drop constraint FK64E05778D45A1211;
alter table message_recipients drop constraint FKF83BACB2468E2270;
alter table message_recipients drop constraint FKF83BACB2D45A1211;
alter table message_recipients drop constraint FKF83BACB24D8C9121;
alter table messages drop constraint FKE475014CFDCB7A68;
alter table messages drop constraint FKE475014CCC2E8E55;
alter table messages drop constraint FKE475014CF13D458C;
alter table profile_notice drop constraint FKCED38A2EF969622F;
alter table profile_notice drop constraint FKCED38A2EDC16AEFE;
alter table profile_ratings drop constraint FKC752F9E0F1B549B7;
alter table profile_ratings drop constraint FKC752F9E08A2C3B2;
alter table profile_visitors drop constraint FK6810CF9B2CE0275D;
alter table profile_visitors drop constraint FK6810CF9B94F332AC;
alter table recommendations drop constraint FK9357B7DAF969622F;
alter table recommendations drop constraint FK9357B7DAC50FA59F;
alter table relation_permissions drop constraint FK634032C15FEFE072;
alter table relation_permissions drop constraint FK634032C17D3F4E49;
alter table reset_passwords drop constraint FK35B79A48F969622F;
alter table robinsons drop constraint FKAAF79CBC06DC98;
alter table role_permissions drop constraint FKEAD9D23B54140A59;
alter table role_permissions drop constraint FKEAD9D23BB7538E27;
alter table rule_violations drop constraint FK99170D11EC5AFAB6;
alter table rule_violations drop constraint FK99170D113CE73016;
alter table user_addresses drop constraint FK9188602E4E23EC72;
alter table user_addresses drop constraint FK9188602EDEBFF13B;
alter table user_contactmethods drop constraint FKA59F56864E23EC72;
alter table user_contactmethods drop constraint FKA59F568644566562;
alter table user_contacts drop constraint FKE130BA475A197AAE;
alter table user_contacts drop constraint FKE130BA474E23EC72;
alter table user_credits drop constraint FK983F4C26F969622F;
alter table user_data drop constraint FK1435639E8089EA06;
alter table user_profile drop constraint FK487E2135F969622F;
alter table user_profile drop constraint FK487E2135B449B653;
alter table user_profile drop constraint FK487E2135A35E0ACE;
alter table user_relation_permissions drop constraint FKDBE83EB5B7538E27;
alter table user_relation_permissions drop constraint FKDBE83EB53304507C;
alter table user_resources drop constraint FKE734A2B1D0AAF549;
alter table user_resources drop constraint FKE734A2B14E23EC72;
alter table user_roles drop constraint FK7342994954140A59;
alter table user_roles drop constraint FK73429949F969622F;
alter table users drop constraint FK6A68E08B1644EB4;
alter table zipcodes drop constraint FKF88385A5AE853FD9;
drop table addresses;
drop table blacklisted_contacts;
drop table contactmethods;
drop table countries;
drop table favorite_members;
drop table federalstates;
drop table friendship_requests;
drop table message_attachments;
drop table message_recipients;
drop table messages;
drop table permissions;
drop table profile_notice;
drop table profile_ratings;
drop table profile_visitors;
drop table recommendations;
drop table relation_permissions;
drop table reset_passwords;
drop table resourcebundles;
drop table resources;
drop table robinsons;
drop table role_permissions;
drop table roles;
drop table rule_violations;
drop table search_criteria;
drop table user_addresses;
drop table user_contactmethods;
drop table user_contacts;
drop table user_credits;
drop table user_data;
drop table user_profile;
drop table user_relation_permissions;
drop table user_resources;
drop table user_roles;
drop table users;
drop table zipcodes;
drop sequence hibernate_sequence;
