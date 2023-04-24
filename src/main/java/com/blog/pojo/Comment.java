package com.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private String content;
    private int commentUserId;
    private int commentTopicId;
    private Date commentTime;
    private int floor;
    private int childFloor;
    private int reply;
    private Topic topic;
    private User author;
    private User replyTo;
    private int supportCount;
    private int criticismCount;
    private List<Comment> childCommentList;
}
