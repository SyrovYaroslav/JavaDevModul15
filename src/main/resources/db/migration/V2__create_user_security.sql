CREATE TABLE IF NOT EXISTS users (
     user_id IDENTITY PRIMARY KEY,
     username VARCHAR(45) NOT NULL,
     password VARCHAR(64) NOT NULL,
     role VARCHAR(45) NOT NULL,
     enabled boolean DEFAULT true
);

INSERT INTO users (username, password, role, enabled)
VALUES ('user',
        '{noop}jdbcDefault',
        'ROLE_USER', true);