create database ClinicaVeterinaria;
use ClinicaVeterinaria;

create table Clinica( 
cod_laboratorio numeric (6) primary key,
nome_lab varchar (15) not null, 
equipamentos varchar (100) not null 
);

create table Funcionario( 
matricula numeric (12) primary key, 
cod_laboratorio numeric (6) REFERENCES Clinica,
nome varchar (30) not null, 
cpf varchar (11) not null,
contato numeric (11) not null, 
endereco varchar (75) not null, 
esp_fun varchar (24) not null 
);

create table Cliente(  
cpf_cli varchar (11) primary key, 
nome_cli varchar (30) not null,
endereco_cli varchar (75) not null, 
contato_cli numeric (11) not null 
);


create table Animal( 
RGA numeric (6) primary key, 
cpf varchar (11) REFERENCES Cliente,
tipo varchar (25) not null, 
peso numeric (3) not null, 
idade numeric (2) not null 
);

create table Consulta( 
n_consulta numeric (5) primary key, 
data date not null, 
horarios varchar (6) not null,
preco numeric (8,2) not null 
);

create table Remedio( 
cod_rem numeric (26) primary key, 
nome_rem varchar (20) not null, 
preco_rem numeric (6,2) not null 
);

create table Historico( 
cod_his varchar (5) primary key, 
n_consulta numeric (5) REFERENCES Consulta,
horario_his varchar (6) not null 
);

create table Tratamento( 
cod_tratamento numeric (5) primary key, 
n_consulta numeric (5) REFERENCES Consulta,
cod_rem numeric (26) REFERENCES Remedio,
qualidade numeric (3) not null, 
descricao varchar (400) not null 
);

create table Exame( 
cod_exa numeric (5) primary key, 
n_consulta numeric (5) REFERENCES Consulta,
tipo varchar (35) not null 
);

Insert into Clinica values ( 654789, 'Vetcase', 'Raio x/ Kit cirurgia/ Kit coleta de sangue/ Kit exames');
Insert into Clinica values ( 653489, 'Animalia', 'Kit coleta de sangue/ Kit exames');
Insert into Clinica values ( 651729, 'Vetcenter', 'Raio x/ Kit cirurgia/ Kit coleta de sangue/ Kit exames');
Insert into Clinica values ( 657142, 'Doghelp', 'Raio x/ Kit coleta de sangue/ Kit exames'); 
Insert into Clinica values ( 658390, 'Curander', 'Raio x/ Kit cirurgia/ Kit coleta de sangue/ Kit exames');

Insert into Funcionario values (238427427474, 654789, 'Claudio Ribeiro Rodrigues', 11994573847, 11959739167, 'Rua Rogerio Vargas, 6059', 'Veterinario');
Insert into Funcionario values (324872367232, 653489, 'Cristiano Ronaldo Pereira', 11976543332, 11959749667, 'Rua Cleitin Borges, 221', 'Banhista');
Insert into Funcionario values (443346756765, 651729, 'Neymar Junior Santos', 11972335566, 11936759264, 'Rua Furacao dos Japa, 666', 'Seguranca');
Insert into Funcionario values (123445678972, 658390, 'Lionel Messi Brandao', 11997565656, 11949559669, 'Rua Rogerio Vargas, 659', 'Faxineiro');
Insert into Funcionario values (212233256453, 657142, 'Roberto Carlos Soares', 11991234567, 11936745327, 'Rua Rogerio Ceni, 59', 'Recepcionista');

Insert into Cliente values ( 42455478895, 'Matheus Vinicius da Silva', 'Rua Servidao Publica, 40', '11990028922');
Insert into Cliente values ( 42458478895, 'Lucas Vinicius Carvalho', 'Rua dos Macoes, 29', '11978992928');
Insert into Cliente values ( 42454478895, 'Geraldo Luiz', 'Rua Vasconcelos, 457', '12998359836');
Insert into Cliente values ( 42459478895, 'Gerson Ramos', 'Rua Brisa Torta, 893', '21939386459');
Insert into Cliente values ( 42454778895, 'Carlos Neto', 'Rua Luis de Camoes, 157', '17999349374');

Insert into Animal values (347634, 42455478895, 'Cachorro', 30, '14');
Insert into Animal values (832376, 42458478895, 'Gato', 08, '06');
Insert into Animal values (378634, 42454478895, 'Papagaio', '0.700', '19');
Insert into Animal values (873456, 42459478895, 'Largatixa', '0.200', '01');
Insert into Animal values (276345, 42454778895, 'Leao', 120,'15');

Insert into Consulta values ( 34763, date '2022-10-08', '16:30', '250.00');
Insert into Consulta values ( 32363, date '2022-08-09', '14:20', '300.00');
Insert into Consulta values ( 31663, date '2022-06-11', '09:30', '90.00');
Insert into Consulta values ( 38973, date '2022-09-02', '18:00', '580.00');
Insert into Consulta values ( 30983, date '2022-06-07', '12:00', '290.00');

Insert into Remedio values ( 33464667234632647847438700, 'Azitromicina', '58.00');
Insert into Remedio values ( 45638458737458374658392830, 'Domperidona', '99.00');
Insert into Remedio values ( 24757457263452764734576254, 'Amoxilina', '50.00');
Insert into Remedio values ( 45687458374573829023980089, 'Sufelicitrina', '200.00');
Insert into Remedio values ( 77435784576436743643674538, 'Dipirona', '120.00');

Insert into Historico values ( 12367, 34763, '16:30');
Insert into Historico values ( 37677, 32363, '14:20');
Insert into Historico values ( 89475, 31663, '09:30');
Insert into Historico values ( 34864, 38973, '18:00');
Insert into Historico values ( 47298, 30983, '12:00');

Insert into Tratamento values (32525, 34763, 33464667234632647847438700, 100, 'Quimeoterapia');
Insert into Tratamento values (72443, 32363, 45638458737458374658392830, 80, 'Tratamento contra ansiedade');
Insert into Tratamento values (32456, 31663, 24757457263452764734576254, 99, 'Quimeoterapia');
Insert into Tratamento values (53263, 38973, 45687458374573829023980089, 50, 'Tratamento contra cancer');
Insert into Tratamento values (46754, 30983, 77435784576436743643674538, 100, 'Quimeoterapia');

Insert into Exame values (43553, 34763, 'Exame de sangue');
Insert into Exame values (76567, 32363, 'Exame de sangue');
Insert into Exame values (12937, 31663, 'Exame de sangue');
Insert into Exame values (84387, 38973, 'Exame de sangue');
Insert into Exame values (43534, 30983, 'Exame de sangue');

select cod_laboratorio, nome_lab from Clinica order by nome_lab;
select equipamentos from Clinica where not cod_laboratorio = 654789;
select equipamentos from Clinica order by cod_laboratorio;
select nome_lab from Clinica where LEN (nome_lab) > 5;       
select nome_lab, lower (nome_lab) from Clinica;

select n_consulta from Consulta where LEN (n_consulta) > 4;           
select horarios from Consulta order by 1;                     
select preco from Consulta where preco > 200;
select * from Consulta order by preco;
select n_consulta from Consulta where n_consulta > 70000;

select nome_cli, endereco_cli, contato_cli from Cliente order by 1;
select nome_cli from Cliente where LEN (nome_cli) in (1,2,3);                    
select cpf_cli, nome_cli, contato_cli from Cliente where nome_cli = 'Geraldo Luiz';
select contato_cli from Cliente order by 1;
select * from Cliente;

select * from Historico order by 1;
select horario_his from Historico where cod_his > 50000;
select cod_his from Historico;
select cod_his from Historico order by 1;

select nome_rem from Remedio where LEN(nome_rem)>20;       
select nome_rem, upper (nome_rem) from Remedio;
select preco_rem, cod_rem from Remedio order by cod_rem;
select cod_rem from Remedio where LEN (cod_rem) >= 25;     
select * from Remedio where LEN(nome_rem) > 20;

select matricula, nome_fun from Funcionario;
select endereco_fun, contato_fun from Funcionario where LEN (nome_fun) > 26;  
select esp_fun from Funcionario order by nome_fun;
select * from Funcionario;
select matricula, nome_fun, endereco_fun from Funcionario where LEN (matricula) > 10;    

select idade from Animal order by 1;
select RGA, cadastro, idade from Animal where idade >15;
select cadastro, peso from Animal where LEN (peso) > 1;   
select * from Animal;
select * from Animal where idade <= 20;

select * from Tratamento where qualidade > 85;
select descricao, cod_tratamento from Tratamento where LEN(descricao) >350;  
select descricao from Tratamento order by qualidade;
select * from Tratamento where cod_tratamento >50000;
select qualidade from Tratamento order by 1;

select cod_exa from Exame order by 1;
select tipo from Exame where LEN ( tipo) < 14; 
select tipo, upper (tipo) from Exame;
select * from Exame order by cod_exa;
select cod_exa from Exame where cod_exa > 30000;

select * from tratamento;