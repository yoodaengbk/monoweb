use travelweb;
alter table comment add constraint fk_user_comment foreign key (userid) references  userEntity(userid);
alter table comment add constraint fk_tour_comment foreign key (tourid) references  tourEntity(tourid);
alter table cart add constraint fk_user_cart foreign key (userid) references  user(userid);
alter table cart add constraint fk_tour_cart foreign key (tourid) references  tour(tourid);