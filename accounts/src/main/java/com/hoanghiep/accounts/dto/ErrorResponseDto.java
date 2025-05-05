package com.hoanghiep.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "Api path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "HTTP status code of the response"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message of the response"
    )
    private String errorMessage;

    @Schema(
            description = "Error time of the response"
    )
    private LocalDateTime errorTime;
}
