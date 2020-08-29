# spring-data-redis-example

# Subindo o container do postgres
docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres

# Subindo o container do redis
docker run --name redis -p 6379:6379 -d redis:5.0.3

