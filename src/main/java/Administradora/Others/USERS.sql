create user ADMINISTRADORA identified by ADMINISTRADORA;
Grant create session,create table to "ADMINISTRADORA";
DROP USER 'ADMINISTRADORA';
alter user ADMINISTRADORA quota 50m on system;