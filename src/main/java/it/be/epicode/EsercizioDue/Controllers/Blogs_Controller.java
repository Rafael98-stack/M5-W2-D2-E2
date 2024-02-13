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

    @GetMapping("/getExample")
    // Per contattare questo endpoint dovrò inviare una request GET a http://localhost:numerodiporta/examples/getExample
    public String getExample() {
        return "Ciao io rispondo alle richieste ciao";
    }

    @PostMapping
    // POST su http://localhost:3001/examples/payloadExample (+body)
    public Blog_Post payloadExample(@RequestBody Blog_Post body) {
        System.out.println("body --> " + body);
        return body;
    }

    @GetMapping
    public List<Blog_Post> getAllUsers() {
        return this.autorsBlogsService.getBlog();
    }
//
//    @PostMapping
//    public Blog_Post payloadExample(@RequestBody Blog_Post body) {
//        System.out.println("body --> " + body);
//        return this.autorsBlogsService.saveBlogs(body);    }

}
