package com.springboot.blog.payload;

import com.springboot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;


@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message = "Post should have at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min = 5, message = "Description should have at least 5 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
