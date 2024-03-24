create table if not exists users
(
    id         uuid primary key,
    name       varchar check ( length(trim(name)) >= 3 ),
    username   varchar not null unique check ( length(trim(username)) >= 5 ),
    password   varchar not null,
    avatar     varchar,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);
create table if not exists authorities
(
    id        serial primary key,
    authority varchar check ( length(trim(authority)) > 0 ) unique
);
create table if not exists user_authorities
(
    id             serial primary key,
    id_user        uuid not null references users (id),
    id_authorities int  not null references authorities (id),
    constraint uk_user_authorities unique (id_user, id_authorities)
);
create table if not exists user_documents
(
    user_id     varchar not null,
    document_id varchar not null,
    constraint fk_users_documents_users foreign key (user_id) references users (id) on delete cascade on update no action,
    constraint fk_users_documents_documents foreign key (document_id) references documents (id) on delete cascade on update no action
);
create table if not exists documents
(
    id         uuid primary key,
    url        varchar check (url :: text ~*
                              'https?:\/\/(www\.)?[-a-zA-Z0-9@:%._\+~#=]{2,255}\.[a-z]{2,9}\y([-a-zA-Z0-9@:%_\+.~#?&//=]*)$' :: text),
    properties jsonb
);
create table if not exists comments
(
    id          bigserial not null primary key,
    author_id   varchar   not null,
    document_id varchar   not null,
    content     varchar   not null check ( length(trim(content)) >= 10),
    constraint fk_user_comments_user foreign key (author_id) references users (id) on delete cascade on update no action,
    constraint fk_user_comments_documents foreign key (document_id) references documents (id) on delete cascade on update no action
);