package it.be.epicode.EsercizioDue.Services;

import it.be.epicode.EsercizioDue.Entities.Blog_Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AutorsBlogs_Service {
    private static List<Blog_Post> blogPosts;

    public List<Blog_Post> getBlog() {
        return blogPosts;
    }

    public Blog_Post saveBlogs(Blog_Post newBlog) {
        Random rndm = new Random();
        newBlog.setId(rndm.nextInt(1, 10000));
       blogPosts.add(newBlog);
        return newBlog;
    }
}
