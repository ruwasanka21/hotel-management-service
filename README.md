# Hotel Management Service API

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](#) [![License: MIT](https://img.shields.io/badge/license-MIT-blue)](#)

## Overview

**Hotel Management Service** is a RESTful API built with **Java** and **Spring Boot** to handle hotels, branches, rooms, facilities, addresses, and related media. It aims to provide a clean layered architecture for managing a hotel ecosystem with features like search, pagination, image association, and robust exception handling.

## Features

- **Hotel Management**: Create, update, delete, and search hotels with metadata (name, star rating, description, pricing, activation status, etc.).
- **Branch Management**: Manage hotel branches, each with its own type, name, and room capacity.
- **Room Management**: Full CRUD for rooms.
- **Facility Management**: Assign and manage facilities per room.
- **Image Management**: Upload and associate images with rooms.
- **Address Management**: Add/update addresses for hotels and branches.
- **Pagination & Search**: Efficient browsing/filtering of hotels.
- **Health Check**: Simple endpoint to verify service availability.
- **Exception Handling**: Custom exceptions for missing resources and validation issues.

## Architecture

- **Spring Boot** as the framework.
- **Layered Design**:
  - **Controllers**: REST entry points (e.g., `HotelController`, `RoomController`).
  - **Services**: Business logic implementations (e.g., `HotelServiceImpl`).
  - **Repositories**: JPA repositories (e.g., `HotelRepo`, `BranchRepo`).
  - **Entities**: Domain models mapping to database tables.
  - **DTOs**: Data Transfer Objects for request/response encapsulation.
  - **Exception Handling**: Centralized handlers for consistent error responses.

## Prerequisites

- Java 17+ 
- Maven 
- MySQL 
- Git

## Installation

Clone the repository:

```bash
git clone https://github.com/ruwasanka21/hotel-management-service.git
cd hotel-management-service
