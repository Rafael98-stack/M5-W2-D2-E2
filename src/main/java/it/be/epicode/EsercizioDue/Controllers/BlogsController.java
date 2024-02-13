package it.be.epicode.EsercizioDue.Controllers;

import it.be.epicode.EsercizioDue.Entities.blogPost;
import it.be.epicode.EsercizioDue.Services.AutorsBlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    private AutorsBlogsService autorsBlogsService;

//    @PostMapping
//    // POST su http://localhost:3001/examples/payloadExample (+body)
//    public Blog_Post payloadExample(@RequestBody Blog_Post body) {
//        System.out.println("body --> " + body);
//        return body;
//    }

    @GetMapping
    public List<blogPost> getAllBlogs() {
        return this.autorsBlogsService.getBlog();
    }

    @PostMapping
  public blogPost saveBlogs() {

        return this.autorsBlogsService.saveBlogs(new blogPost());
    }
}
