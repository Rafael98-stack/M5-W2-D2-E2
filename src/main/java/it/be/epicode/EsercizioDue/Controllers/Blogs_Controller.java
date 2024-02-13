package it.be.epicode.EsercizioDue.Controllers;

import it.be.epicode.EsercizioDue.Entities.Blog_Post;
import it.be.epicode.EsercizioDue.Services.AutorsBlogs_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/blogs")
public class Blogs_Controller {
    @Autowired
    private AutorsBlogs_Service autorsBlogsService;

    @GetMapping
    public List<Blog_Post> getAllUsers() {
        return autorsBlogsService.getBlog();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Status Code 201
    public Blog_Post saveBlog(@RequestBody Blog_Post newBlog) {

        return this.autorsBlogsService.saveBlogs(newBlog);
    }

}
