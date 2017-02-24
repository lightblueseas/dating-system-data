alter table addresses drop constraint FK34207BA2FBFE6130;
alter table addresses drop constraint FK34207BA27EE00646;
alter table blacklisted_contacts drop constraint FKA1253AB649A61DF;
alter table blacklisted_contacts drop constraint FKA1253AB64E23EC72;
alter table bundle_application_bundlenames drop constraint FKE03DE2DA81FDD8D7;
alter table bundle_application_bundlenames drop constraint FKE03DE2DA64F45D92;
alter table bundlenames drop constraint FKF230A806D4CC327E;
alter table bundlenames drop constraint FKF230A80663C76715;
alter table default_locale_basenames drop constraint FKC87181B017DEE600;
alter table default_locale_basenames drop constraint FKC87181B0BE71D570;
alter table favorite_members drop constraint FKE79ADD76C3D248;
alter table favorite_members drop constraint FKE79ADD7620FE8067;
alter table federalstates drop constraint FK1A5486DFAE853FD9;
alter table friendship_requests drop constraint FK8AE72089EC30F7E9;
alter table friendship_requests drop constraint FK8AE7208941AA125F;
alter table message_attachments drop constraint FK64E05778311BBAC0;
alter table message_attachments drop constraint FK64E05778D45A1211;
alter table message_recipients drop constraint FKF83BACB2468E2270;
alter table message_recipients drop constraint FKF83BACB2D45A1211;
alter table message_recipients drop constraint FKF83BACB2E9005122;
alter table messages drop constraint FKE475014CFDCB7A68;
alter table messages drop constraint FKE475014C67A24E56;
alter table messages drop constraint FKE475014CF13D458C;
alter table profile_notice drop constraint FKCED38A2E94DD2230;
alter table profile_notice drop constraint FKCED38A2EDC16AEFE;
alter table profile_ratings drop constraint FKC752F9E0F1B549B7;
alter table profile_ratings drop constraint FKC752F9E0A41683B3;
alter table profile_visitors drop constraint FK6810CF9B2CE0275D;
alter table profile_visitors drop constraint FK6810CF9B3066F2AD;
alter table recommendations drop constraint FK9357B7DA94DD2230;
alter table recommendations drop constraint FK9357B7DA608365A0;
alter table relation_permissions drop constraint FK634032C1FB63A073;
alter table relation_permissions drop constraint FK634032C118B30E4A;
alter table reset_passwords drop constraint FK35B79A4894DD2230;
alter table resourcebundles drop constraint FKD0A7106365054731;
alter table resourcebundles drop constraint FKD0A71063BE71D570;
alter table robinsons drop constraint FKAAF79CBA77A9C99;
alter table role_permissions drop constraint FKEAD9D23BEF87CA5A;
alter table role_permissions drop constraint FKEAD9D23B91DD8968;
alter table rule_violations drop constraint FK99170D1187CEBAB7;
alter table rule_violations drop constraint FK99170D11D85AF017;
alter table user_addresses drop constraint FK9188602E4E23EC72;
alter table user_addresses drop constraint FK9188602EDEBFF13B;
alter table user_contactmethods drop constraint FKA59F56864E23EC72;
alter table user_contactmethods drop constraint FKA59F568644566562;
alter table user_contacts drop constraint FKE130BA47F58D3AAF;
alter table user_contacts drop constraint FKE130BA474E23EC72;
alter table user_credits drop constraint FK983F4C2694DD2230;
alter table user_data drop constraint FK1435639EA3F626D4;
alter table user_data drop constraint FK1435639E8089EA06;
alter table user_profile drop constraint FK487E213594DD2230;
alter table user_profile drop constraint FK487E2135B449B653;
alter table user_profile drop constraint FK487E2135A35E0ACE;
alter table user_relation_permissions drop constraint FKDBE83EB591DD8968;
alter table user_relation_permissions drop constraint FKDBE83EB532C37ABD;
alter table user_resources drop constraint FKE734A2B1D0AAF549;
alter table user_resources drop constraint FKE734A2B14E23EC72;
alter table user_roles drop constraint FK73429949EF87CA5A;
alter table user_roles drop constraint FK7342994994DD2230;
alter table zipcodes drop constraint FKF88385A5AE853FD9;
drop table addresses;
drop table basenames;
drop table blacklisted_contacts;
drop table bundle_application_bundlenames;
drop table bundle_applications;
drop table bundlenames;
drop table contactmethods;
drop table countries;
drop table default_locale_basenames;
drop table favorite_members;
drop table federalstates;
drop table friendship_requests;
drop table language_locales;
drop table languages;
drop table message_attachments;
drop table message_recipients;
drop table messages;
drop table permissions;
drop table profile_notice;
drop table profile_ratings;
drop table profile_visitors;
drop table properties_keys;
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
drop table user_tokens;
drop table users;
drop table zipcodes;
drop sequence hibernate_sequence;
