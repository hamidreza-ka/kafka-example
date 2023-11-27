package com.hrk.kafka.message;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime createdAt) {
}
