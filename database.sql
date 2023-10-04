CREATE TABLE users (
    username varchar(50),
    password varchar(100) NOT NULL,
    name varchar(100) NOT NULL,
    token varchar(100) UNIQUE,
    token_expired_at BIGINT,
    PRIMARY (username)
);

CREATE TABLE contacts(
    id varchar(100) PRIMARY KEY,
    username varchar(50) NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name varchar(100),
    phone varchar(100),
    email varchar(100),
    FOREIGN KEY (username) REFERENCES users(username)
);

CREATE TABLE addresses(
    id varchar(100) PRIMARY KEY,
    contact_id varchar(100),
    city varchar(100),
    street varchar(200),
    province varchar(100),
    country varchar(100) NOT NULL,
    postal_code varchar(10),
    FOREIGN KEY (contact_id) REFERENCES contacts(id)
);
