CREATE TABLE Role (
roleId bigint not null auto_increment primary key,
roleName varchar(256)
);

insert into role (roleName) values ('passenger');
insert into role (roleName) values ('pilot');
insert into role (roleName) values ('employee');

CREATE TABLE Customer (
customerId bigint not null auto_increment primary key,
customerName varchar(256),
customerSurname varchar(256),
passport varchar(256),
roleId bigint,
foreign key (roleId) references role (roleId)
);

insert into Customer values (1, 'Andrey', 'Surikov', 'AB6464644', 1);
insert into Customer values (2, 'Sergey', 'Novik', 'EC5456262', 1);
insert into Customer values (3, 'Dima', 'Minok', 'SD6445645', 1);
insert into Customer values (4, 'Sasha', 'Martin', 'BD5452444', 1);
insert into Customer values (5, 'Kolya', 'Turin', 'KD5454554', 2);
insert into Customer values (6, 'Anya', 'Belka', 'TD6584445', 3);
insert into Customer values (7, 'Olga', 'Zotova', 'FD6562553', 1);
insert into Customer values (8, 'Katerina', 'Belova', 'YT4552522', 1);
insert into Customer values (9, 'Elena', 'Zebra', 'LK5454548', 1);

CREATE TABLE Login (
loginId bigint not null auto_increment primary key,
customerLogin varchar(256),
customerPass varchar(256),
customerId bigint,
foreign key (customerId) references Customer (customerId)
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
foreign key (cityId) references City (cityId)
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

CREATE TABLE Route (
routeId bigint not null auto_increment primary key,
arrivalAirportId bigint,
departureAirportId bigint,
cost bigint,
airCompanyId bigint,
foreign key (arrivalAirportId) references airport (airportId),
foreign key (departureAirportId) references airport (airportId),
foreign key (airCompanyId) references AirCompany (airCompanyId)
);

insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 2, 200, 1);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 2, 300, 2);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (2, 5, 500, 2);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (2, 5, 400, 3);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 10, 1000, 4);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 10, 1000, 3);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (6, 7, 1200, 2);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (7, 11, 1500, 4);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 6, 2500, 2);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 6, 2000, 4);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 7, 1500, 2);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 7, 2000, 4);
insert into route (arrivalAirportId, departureAirportId, cost, airCompanyId) values (1, 10, 1700, 3);

CREATE TABLE Ticket (
ticketId bigint not null auto_increment primary key,
ticketNumber bigint not null,
flightDate date,
routeId bigint,
customerId bigint,
foreign key (routeId) references Route (routeId),
foreign key (customerId) references Customer (customerId)
);

insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458254, '2022-10-29', 1, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (454564, '2022-10-30', 2, 2);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (454543, '2022-10-30', 3, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (443733, '2022-10-31', 4, 2);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (445333, '2022-10-31', 5, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (453272, '2022-10-28', 6, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (454344, '2022-10-28', 7, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458255, '2022-10-27', 8, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458256, '2022-10-27', 1, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458257, '2022-10-26', 6, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458258, '2022-10-25', 3, 2);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458259, '2022-10-24', 4, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458260, '2022-10-23', 8, 1);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458261, '2022-10-22', 9, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458261, '2022-10-23', 10, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458291, '2022-10-27', 11, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458292, '2022-10-27', 12, 3);
insert into ticket (ticketNumber, flightDate, routeId, customerId) values (458293, '2022-10-25', 13, 3);