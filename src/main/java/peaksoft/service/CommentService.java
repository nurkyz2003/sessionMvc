package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Comment;
import peaksoft.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComment(Long id){
        return commentRepository.getAllComment(id);
    }

    public void saveComment(Long id,Comment comment){
        commentRepository.saveComment(id,comment);
    }
}
