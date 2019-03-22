select 'alter table ' || table_name || ' allocate extent; ' from user_tables t where t.num_rows = 0 or t.num_rows is null;

--命令面板
exp koss1/1@orcl file=d:\koss1.dmp owner=koss1
