CREATE TABLE Role (
roleId bigint not null auto_increment primary key,
roleName varchar(256)
);

insert into role (roleName) values ('passenger');
insert into role (roleName) values ('pilot');
insert into role (roleName) values ('employee');

CREATE TABLE Passport (
passportId bigint not null auto_increment primary key,
passportNumber varchar(256)
);

insert into passport (passportNumber) value ('AB6464644');
insert into passport (passportNumber) value ('EC5456262');
insert into passport (passportNumber) value ('SD6445645');
insert into passport (passportNumber) value ('BD5452444');
insert into passport (passportNumber) value ('KD5454554');
insert into passport (passportNumber) value ('TD6584445');
insert into passport (passportNumber) value ('FD6562553');
insert into passport (passportNumber) value ('YT4552522');
insert into passport (passportNumber) value ('LK5454548');

CREATE TABLE Visitor (
visitorId bigint not null auto_increment primary key,
visitorName varchar(256),
visitorSername varchar(256),
passportId bigint,
roleId bigint,
foreign key (passportId) references passport (passportId),
foreign key (roleId) references role (roleId)
);

insert into Visitor values (1, 'Andrey', 'Surikov', 1, 1);
insert into Visitor values (2, 'Sergey', 'Novik', 2, 1);
insert into Visitor values (3, 'Dima', 'Minok', 3, 1);
insert into Visitor values (4, 'Sasha', 'Martin', 4, 1);
insert into Visitor values (5, 'Kolya', 'Turin', 5, 2);
insert into Visitor values (6, 'Anya', 'Belka', 6, 3);
insert into Visitor values (7, 'Olga', 'Zotova', 7, 1);
insert into Visitor values (8, 'Katerina', 'Belova', 8, 1);
insert into Visitor values (9, 'Elena', 'Zebra', 9, 1);

CREATE TABLE Login (
loginId bigint not null auto_increment primary key,
visitorLogin varchar(256),
visitorPass varchar(256),
visitorId bigint,
foreign key (visitorId) references Visitor (visitorId)
);

insert into login values (1, 'Andrey', 'dfgbdb', 1);
insert into login values (2, 'SergeyD', 'gnbrgn', 2);
insert into login values (3, 'DimaJKL', 'ipjmn', 3);
insert into login values (4, 'SashaHDK', 'werg', 4);
insert into login values (5, 'KolyaJK', 'hhkhf', 5);
insert into login values (6, 'AnyaL', 'dfnmm', 6);
insert into login values (7, 'OlgaPO', 'zxv', 7);
insert into login values (8, 'Kate56', 'drhn', 8);
insert into login values (9, 'El5sf', 'bhjyt', 9);

CREATE TABLE City (
cityId bigint not null auto_increment primary key,
cityName varchar(256)
);

insert into city (cityName) value ('Moskow');
insert into city (cityName) value ('Minsk');
insert into city (cityName) value ('Kiev');
insert into city (cityName) value ('Munhen');
insert into city (cityName) value ('London');
insert into city (cityName) value ('Tokio');
insert into city (cityName) value ('Pekin');
insert into city (cityName) value ('Baku');
insert into city (cityName) value ('Astana');

CREATE TABLE AirCompany (
airCompanyId bigint not null auto_increment primary key,
airCompanyName varchar(256)
);

insert into aircompany (AirCompanyName) values ('Belavia');
insert into aircompany (AirCompanyName) values ('Aeroflot');
insert into aircompany (AirCompanyName) values ('LOT');
insert into aircompany (AirCompanyName) values ('FlyAmirates');

CREATE TABLE Airport (
airportId bigint not null auto_increment primary key,
airportName varchar(256),
countryName varchar(256),
cityId bigint,
foreign key (cityId) references city (cityId)
);

insert into airport (AirportName, CountryName, cityId) values ('MSQ', 'Belarus', 2);
insert into airport (AirportName, CountryName, cityId) values ('MOW', 'Russia', 1);
insert into airport (AirportName, CountryName, cityId) values ('SVO', 'Russia', 1);
insert into airport (AirportName, CountryName, cityId) values ('IEV', 'Ukraine', 3);
insert into airport (AirportName, CountryName, cityId) values ('LHR', 'UK', 5);
insert into airport (AirportName, CountryName, cityId) values ('LGW', 'UK', 5);
insert into airport (AirportName, CountryName, cityId) values ('PEC', 'China', 7);
insert into airport (AirportName, CountryName, cityId) values ('NAY', 'China', 7);
insert into airport (AirportName, CountryName, cityId) values ('GYD', 'Azerbajan', 8);
insert into airport (AirportName, CountryName, cityId) values ('NRT', 'Japan', 6);
insert into airport (AirportName, CountryName, cityId) values ('QXO', 'Japan', 6);

CREATE TABLE Rote (
roteId bigint not null auto_increment primary key,
arrivalAirportId bigint,
departureAirportId bigint,
cost bigint,
airCompanyId bigint,
foreign key (arrivalAirportId) references airport (airportId),
foreign key (departureAirportId) references airport (airportId),
foreign key (airCompanyId) references AirCompany (airCompanyId)
);

insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 2, 200, 1);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 2, 300, 2);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (2, 5, 500, 2);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (2, 5, 400, 3);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 10, 1000, 4);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 10, 1000, 3);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (6, 7, 1200, 2);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 11, 1500, 4);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 6, 2500, 2);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 6, 2000, 4);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 7, 1500, 2);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 7, 2000, 4);
insert into rote (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 10, 1700, 3);

CREATE TABLE Ticket (
ticketId bigint not null auto_increment primary key,
ticketNumber bigint not null,
flightDate date,
roteId bigint,
visitorId bigint,
foreign key (roteId) references Rote (roteId),
foreign key (visitorId) references visitor (visitorId)
);

insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458254, '2022-10-29', 1, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (454564, '2022-10-30', 2, 2);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (454543, '2022-10-30', 3, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (443733, '2022-10-31', 4, 2);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (445333, '2022-10-31', 5, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (453272, '2022-10-28', 6, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (454344, '2022-10-28', 7, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458255, '2022-10-27', 8, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458256, '2022-10-27', 1, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458257, '2022-10-26', 6, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458258, '2022-10-25', 3, 2);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458259, '2022-10-24', 4, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458260, '2022-10-23', 8, 1);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458261, '2022-10-22', 9, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458261, '2022-10-23', 10, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458291, '2022-10-27', 11, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458292, '2022-10-27', 12, 3);
insert into ticket (ticketNumber, flightDate, roteId, visitorId) values (458293, '2022-10-25', 13, 3);