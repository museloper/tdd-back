## `Repository secrets` 등록

1. 프로젝트 저장소에서 `Settings` > `Secrets and variables` > `Actions` 메뉴로 이동
2. `New repository secret` 버튼 클릭
3. `key-value` 등록

<br>

> 주의사항 

```yml
services:
  mysql:
    image: mysql:8.0
    env:
      MYSQL_ROOT_PASSWORD: ${{ secrets.DB_PASSWORD }}
      MYSQL_DATABASE: ${{ secrets.DB_DATABASE }}
      MYSQL_USER: ${{ secrets.DB_USERNAME }}
      MYSQL_PASSWORD: ${{ secrets.DB_PASSWORD }}
    ports:
      - 3306:3306
    options: >-
      --health-cmd="mysqladmin ping --silent"
      --health-interval=10s
      --health-timeout=5s
      --health-retries=5
```

이렇게 도커 이미지로 올라오는 서비스의 경우 `localhost` 또는 `127.0.0.1`로 접근해야 한다.