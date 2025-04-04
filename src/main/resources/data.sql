-- 1件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES
('買い物','スーパーで食材を購入する', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- ２件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES
('図書館に行く', '本を借りる', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- ３件目のデータ登録
INSERT INTO todos (todo, detail, created_at, updated_at)
VALUES
('ジムに行く', '運動する', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 認証テーブルへのダミーデータの追加
-- password:adminpass
INSERT INTO authentications(username,password, authority, displayname) VALUES
('admin','$2a$10$EKetyDe8kIsaXd8y6tyf3egxpH6el6/PWAQeHPIhFeJo26yp5GLRW', 'ADMIN','管理太郎');
-- password:userpass
INSERT INTO authentications(username, password, authority, displayname) VALUES
('user', '$2a$10$HU.ZD4OlJ5x3yuoIA3xyxuCeAKsyxM5fJwH.VYvF9CNUihrl7EDXC', 'USER', '一般花子');