# windows boilerplate
ifeq ($(OS),Windows_NT)
    SHELL := pwsh.exe
else
   SHELL := pwsh
endif
.SHELLFLAGS := -NoProfile -Command


default:
	cat ./Makefile
compose:
	docker compose -f devops/docker-compose.dev.yml --env-file devops/.env.local up --detach


#up: build all images and up docker compose