package controllers;

import models.Post;
import play.*;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index() {
        List<Post> posts = Post.findAll();
        render(posts);
    }

    public static void showPostForm(){
        render();
    }

    public static void createPost(@Required String title, @Required String message){
        Post post = new Post(title, message);
        post.save();
        index();
    }

    public static void showPost(){
        Long id = Long.valueOf(params.get("id"));
        Post post = Post.findById(id);
        render(post);
    }

}