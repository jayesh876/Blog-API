package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private long id;
    @NotEmpty(message = "Name cannot be null or empty")
    private String name;
    @NotEmpty(message = "Email cannot be null or empty")
    @Email
    private String email;
    @NotEmpty
    @Size(min = 10, message = "Comment body must have at least 10 characters")
    private String body;
}
