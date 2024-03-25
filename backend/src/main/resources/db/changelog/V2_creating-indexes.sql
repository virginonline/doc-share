alter table documents
    add column if not exists name varchar not null default now();

create index if not exists ix_users_username on users (username);
create index if not exists ix_documents_name on documents (name);
create index if not exists ix_documents_users_user_id on user_documents (user_id);
create index if not exists ix_documents_users_document_id on user_documents (document_id);
