package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Post extends Model{
    String title;
    String message;

    public Post(String title, String message) {
        this.title = title;
        this.message = message;
    }
}
