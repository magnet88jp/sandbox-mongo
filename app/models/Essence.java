package models;

import play.modules.morphia.Model;
import com.google.code.morphia.annotations.Entity;
 
@Entity
public class Essence extends Model {

  public String sha;
  public String content;

  public Essence(String content) {
    this.content = content;
    this.sha = "";
  } 
}