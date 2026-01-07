# ===============================
# FIFA Player Comparison Project
# Makefile
# ===============================

# Backend & Frontend directories
BACKEND_DIR=backend
FRONTEND_DIR=frontend

# Default target
.PHONY: help
help:
	@echo "Available commands:"
	@echo "  make backend        - Run Spring Boot backend"
	@echo "  make frontend       - Run React frontend"
	@echo "  make install        - Install frontend dependencies"
	@echo "  make build-backend  - Build backend (mvn package)"
	@echo "  make clean-backend  - Clean backend target folder"
	@echo "  make run            - Run backend and frontend (two terminals)"
	@echo "  make stop           - Instructions to stop services"

# -------------------------------
# Backend commands
# -------------------------------

.PHONY: backend
backend:
	cd $(BACKEND_DIR) && mvn spring-boot:run

.PHONY: build-backend
build-backend:
	cd $(BACKEND_DIR) && mvn clean package

.PHONY: clean-backend
clean-backend:
	cd $(BACKEND_DIR) && mvn clean

# -------------------------------
# Frontend commands
# -------------------------------

.PHONY: install
install:
	cd $(FRONTEND_DIR) && npm install

.PHONY: frontend
frontend:
	cd $(FRONTEND_DIR) && npm run dev

# -------------------------------
# Combined
# -------------------------------

.PHONY: run
run:
	@echo "Run backend and frontend in two separate terminals:"
	@echo "Terminal 1: make backend"
	@echo "Terminal 2: make frontend"

.PHONY: stop
stop:
	@echo "Press CTRL + C in the terminal running backend/frontend to stop them"
