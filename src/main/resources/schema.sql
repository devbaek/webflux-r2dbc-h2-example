CREATE TABLE team (
    team_id VARCHAR(255) AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE member (
    member_id VARCHAR(255) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255),
    age INT,
    team_id VARCHAR(255),
    FOREIGN KEY (team_id) REFERENCES team(team_id)
);


INSERT INTO team(name) VALUES ('teamA');
INSERT INTO team(name) VALUES ('teamB');

INSERT INTO member(username, age, team_id) VALUES ('userA', 15, '1');
INSERT INTO member(username, age, team_id) VALUES ('userB', 20, '1');
INSERT INTO member(username, age, team_id) VALUES ('userC', 25, '1');
INSERT INTO member(username, age, team_id) VALUES ('userD', 30, '2');
INSERT INTO member(username, age, team_id) VALUES ('userE', 35, '2');