INSERT INTO users (userId, userName, userPass) VALUES (1, 'John', 'pass1234');
INSERT INTO users (userId, userName, userPass) VALUES (2, 'Johny', 'pass4567');
INSERT INTO users (userId, userName, userPass) VALUES (3, 'Johnatan', 'pass8900');
INSERT INTO users (userId, userName, userPass) VALUES (4, 'Johnie', '1234pass');
INSERT INTO users (userId, userName, userPass) VALUES (5, 'Johna', '564789pass');



INSERT INTO posts (postId, content, date, title, userId) VALUES (1, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', '2020-10-05', 'Lorem Ipsum', 3);


INSERT INTO followers (followerId, userId, follows) VALUES (1, 3, 5);
INSERT INTO followers (followerId, userId, follows) VALUES (2, 3, 1);
INSERT INTO followers (followerId, userId, follows) VALUES (3, 3, 2);
INSERT INTO followers (followerId, userId, follows) VALUES (4, 3, 4);
INSERT INTO followers (followerId, userId, follows) VALUES (5, 3, 3);
